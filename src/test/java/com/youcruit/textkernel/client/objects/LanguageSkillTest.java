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

public class LanguageSkillTest {
    private InputStream is;
    private ObjectMapper om;
    private LanguageSkill expected;
    
    @Before
    public void setUp() throws ParseException {
	is = Thread.currentThread().getContextClassLoader().getResourceAsStream("LanguageSkill.xml");
	om = new XmlMapper();
	expected = new LanguageSkill();
	expected.setLanguageSkillCode("SV");
	expected.setLanguageSkillCodeDescription("Swedish");
	expected.setLanguageProficiencyCode(5);
	expected.setLanguageProficiencyCodeDescription("(Near) Native");
    }
    
    @Test
    public void testParseLanguageSkill() throws JsonParseException, JsonMappingException, IOException{
	LanguageSkill actual = om.readValue(is,  LanguageSkill.class);
	assertEquals(expected, actual);
    }
    
    @After
    public void tearDown() throws IOException{
	is.close();
    }
}
