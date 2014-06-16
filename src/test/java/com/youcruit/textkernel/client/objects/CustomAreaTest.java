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

public class CustomAreaTest {
    private InputStream is;
    private ObjectMapper om;
    private CustomArea expected;
    
    @Before
    public void setUp() throws ParseException {
	is = Thread.currentThread().getContextClassLoader().getResourceAsStream("CustomArea.xml");
	om = new XmlMapper();
	expected = new CustomArea();
	expected.setCvTitle("cvTitle");
	expected.setTotalExperienceYears(16);
	expected.setCurrentJob("Developer, Partner");
	expected.setCurrentEmployer("FF Youcruit AB");
	expected.setLast3Experiences("Senior Consultant, Software Engineer / Project Leader, Network Technician");
	expected.setHighestEducationLevelCode(5);
	expected.setHighestEducationLevelCodeDescription("Master");
	expected.setSalaryCode(77);
	expected.setSalaryCodeDescription("80000");
	expected.setCandidateStatusCode(3);
	expected.setCandidateStatusCodeDescription("abc");
	expected.setAvailabilityCode(3);
	expected.setAvailabilityCodeDescription("asdf");
	expected.setCvComment("cvComment");
	expected.setCandidatePermission("permit");
	expected.setExternalId("777jjjj");
    }
    
    @Test
    public void testParseCustomArea() throws JsonParseException, JsonMappingException, IOException{
	CustomArea actual = om.readValue(is,  CustomArea.class);
	assertEquals(expected, actual);
    }
    
    @After
    public void tearDown() throws IOException{
	is.close();
    }
}
