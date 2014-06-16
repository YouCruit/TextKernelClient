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

public class ComputerSkillTest {
    private InputStream is;
    private ObjectMapper om;
    private ComputerSkill expected;
    
    @Before
    public void setUp() throws ParseException {
	is = Thread.currentThread().getContextClassLoader().getResourceAsStream("ComputerSkill.xml");
	om = new XmlMapper();
	expected = new ComputerSkill();
	expected.setComputerSkillDuration(6);
	expected.setComputerSkillName("Windows NT and 2000");
    }
    
    @Test
    public void testParseComputerSkill() throws JsonParseException, JsonMappingException, IOException{
	ComputerSkill actual = om.readValue(is,  ComputerSkill.class);
	assertEquals(expected, actual);
    }
    
    @After
    public void tearDown() throws IOException{
	is.close();
    }
}
