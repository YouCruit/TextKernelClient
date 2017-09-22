package com.youcruit.textkernel.client;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.commons.io.IOUtils;
import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.youcruit.textkernel.client.exceptions.TextKernelParsingException;
import com.youcruit.textkernel.client.objects.Profile;

public class ProfileParserTest {

    @Test
    public void parseTest() throws Exception {
	InputStreamReader is = new InputStreamReader(getClass().getResourceAsStream("/Profile.xml"), "UTF-8");
	byte[] bytes = IOUtils.toByteArray(is);
	ProfileParser parser = new ProfileParser();
	Profile p = parser.parse(bytes);
	assertNotNull(p);
    }

    @Test
    public void parseError() throws Exception {
	byte[] bytes = IOUtils.toByteArray(getClass().getResource("/error.html"));
	ProfileParser profileParser = new ProfileParser();
	try {
	    profileParser.parse(bytes);
	    fail("Should fail with sane message");
	} catch (TextKernelParsingException e) {
	    Assert.assertEquals("An error occurred during the execution of Action ProcessAtomicPost: Preprocessing failed; ERROR: 415 OCR is required for converting this document (likely scan)", e.getMessage());
	}
    }
}
