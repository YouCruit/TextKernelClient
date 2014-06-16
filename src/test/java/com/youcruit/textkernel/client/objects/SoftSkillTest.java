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

public class SoftSkillTest {
    private InputStream is;
    private ObjectMapper om;
    private SoftSkill expected;
    
    @Before
    public void setUp() throws ParseException {
	is = Thread.currentThread().getContextClassLoader().getResourceAsStream("SoftSkill.xml");
	om = new XmlMapper();
	expected = new SoftSkill();
	expected.setSoftSkillName("softSkillName");
    }
    
    @Test
    public void testParseSoftSkill() throws JsonParseException, JsonMappingException, IOException{
	SoftSkill actual = om.readValue(is,  SoftSkill.class);
	assertEquals(expected, actual);
    }
    
    @After
    public void tearDown() throws IOException{
	is.close();
    }
}
