package com.youcruit.textkernel.client.objects;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class EducationItemTest {
    private InputStream is;
    private ObjectMapper om;
    private EductationItem expected;
    
    @Before
    public void setUp() throws ParseException {
	om = new XmlMapper();
	expected = new EductationItem();
	expected.setEducationLevelCode(7);
	expected.setEducationLevelCodeDescription("educationLevelCodeDescriptoin");
	expected.setDegreeDirection("degreeDirection");
	SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
	df.setTimeZone(TimeZone.getTimeZone("GMT"));
	expected.setStartDate(df.parse("2012-06-30T00:00:00Z"));
	expected.setEndDate(df.parse("2012-06-30T00:00:00Z"));
	expected.setInstituteName("instituteName");
	expected.setDiplomaCode(4);
	expected.setDiplomaCodeDescription("diplomaCodeDescription");
    }
    
    @Test
    public void testParseEducationItem() throws JsonParseException, JsonMappingException, IOException{
	is = Thread.currentThread().getContextClassLoader().getResourceAsStream("EducationItem.xml");
	EductationItem actual = om.readValue(is,  EductationItem.class);
	assertEquals(expected, actual);
    }
    
    @Test
    public void testParseEducationItemEndDateAsString() throws JsonParseException, JsonMappingException, IOException {
	is = Thread.currentThread().getContextClassLoader().getResourceAsStream("EducationItemEndDateAsText.xml");
	expected.setEndDate(null);
	EductationItem actual = om.readValue(is,  EductationItem.class);
	assertEquals(expected, actual);
    }
    
    @After
    public void tearDown() throws IOException{
	is.close();
    }
}
