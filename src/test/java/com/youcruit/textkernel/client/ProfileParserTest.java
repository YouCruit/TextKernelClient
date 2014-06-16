package com.youcruit.textkernel.client;

import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.io.InputStream;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.youcruit.textkernel.client.objects.Profile;

public class ProfileParserTest {

    @Test
    public void parseTest() throws JsonParseException, JsonMappingException, IOException{
	InputStream is = Thread.currentThread().getContextClassLoader().getResourceAsStream("Profile.xml");
	ProfileParser parser = new ProfileParser();
	Profile p = parser.parse(is);
	assertNotNull(p);
    }
}
