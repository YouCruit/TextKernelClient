package com.youcruit.textkernel.client.objects;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.io.InputStream;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.youcruit.textkernel.client.objects.Profile;

/**
 * Unit test for simple ProfileParser.
 */
public class ProfileTest {
    @Test
    public void parseTest() throws JsonParseException, JsonMappingException, IOException{
	InputStream is = Thread.currentThread().getContextClassLoader().getResourceAsStream("Profile.xml");
	ObjectMapper om = new XmlMapper();
	Profile actual = om.readValue(is, Profile.class);
	Profile expected = new Profile();
	expected.setLang("english");
	assertEquals(expected, actual);
    }
}
