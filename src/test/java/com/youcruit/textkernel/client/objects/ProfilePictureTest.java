package com.youcruit.textkernel.client.objects;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class ProfilePictureTest {
    private InputStream is;
    private ObjectMapper om;
    private ProfilePicture expected;
    
    @Before
    public void setUp() throws ParseException {
	is = Thread.currentThread().getContextClassLoader().getResourceAsStream("ProfilePicture.xml");
	om = new XmlMapper();
	expected = new ProfilePicture();
	expected.setBase64Content("base64Content");
	expected.setFilename("image.png");
	expected.setContentType("image/png");
    }
    
    @Test
    public void testParsePicture() throws JsonParseException, JsonMappingException, IOException{
	ProfilePicture actual = om.readValue(is,  ProfilePicture.class);
	assertEquals(expected, actual);
    }
    
    @After
    public void tearDown() throws IOException{
	is.close();
    }
}
