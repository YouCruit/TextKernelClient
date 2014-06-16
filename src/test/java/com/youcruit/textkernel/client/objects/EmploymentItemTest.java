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

public class EmploymentItemTest {
    private InputStream is;
    private ObjectMapper om;
    private EmploymentItem expected;
    
    @Before
    public void setUp() throws ParseException {
	is = Thread.currentThread().getContextClassLoader().getResourceAsStream("EmploymentItem.xml");
	om = new XmlMapper();
	expected = new EmploymentItem();
	expected.setJobTitle("jobTitle");
	expected.setStartDate("2012-01-01");
	expected.setEndDate("present");
	expected.setExperienceYears(3);
	expected.setEmployerName("employerName");
	expected.setDescription("Random long description");
	
    }
    
    @Test
    public void testParseEmploymentItem() throws JsonParseException, JsonMappingException, IOException{
	EmploymentItem actual = om.readValue(is,  EmploymentItem.class);
	assertEquals(expected, actual);
    }
    
    @After
    public void tearDown() throws IOException{
	is.close();
    }
}
