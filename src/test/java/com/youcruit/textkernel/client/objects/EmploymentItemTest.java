package com.youcruit.textkernel.client.objects;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.util.Calendar;

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
	om = new XmlMapper();
    }
    
    @Test
    public void testParseEmploymentItem() throws JsonParseException, JsonMappingException, IOException{
	is = Thread.currentThread().getContextClassLoader().getResourceAsStream("EmploymentItem.xml");
	expected = new EmploymentItem();
	expected.setJobTitle("jobTitle");
	Calendar cal = Calendar.getInstance();
	cal.set(Calendar.YEAR, 2012);
	cal.set(Calendar.MONTH, 0);
	cal.set(Calendar.DAY_OF_MONTH, 1);
	cal.set(Calendar.HOUR_OF_DAY, 1);
	cal.set(Calendar.MINUTE, 0);
	cal.set(Calendar.SECOND, 0);
	cal.set(Calendar.MILLISECOND, 0);
	expected.setStartDate(cal.getTime());
	expected.setEndDate(null);
	expected.setExperienceYears(3);
	expected.setEmployerName("employerName");
	expected.setDescription("Random long description");
	EmploymentItem actual = om.readValue(is,  EmploymentItem.class);
	assertEquals(expected, actual);
    }
    
    @Test
    public void testParseEmploymentItem2() throws JsonParseException, JsonMappingException, IOException{
	is = Thread.currentThread().getContextClassLoader().getResourceAsStream("EmploymentItem2.xml");
	expected = new EmploymentItem();
	expected.setJobTitle("Fältsäljare; Kundansvarig - Region södra Skåne");
	Calendar cal = Calendar.getInstance();
	cal.set(Calendar.YEAR, 2011);
	cal.set(Calendar.MONTH, 0);
	cal.set(Calendar.DAY_OF_MONTH, 1);
	cal.set(Calendar.HOUR_OF_DAY, 1);
	cal.set(Calendar.MINUTE, 0);
	cal.set(Calendar.SECOND, 0);
	cal.set(Calendar.MILLISECOND, 0);
	expected.setStartDate(cal.getTime());
	expected.setEndDate(null);
	expected.setExperienceYears(4);
	expected.setEmployerName("Toms Sverige Malmö");
	expected.setDescription("Random long description");
	EmploymentItem actual = om.readValue(is,  EmploymentItem.class);
	assertEquals(expected, actual);
    }
    
    @Test
    public void testParseEmploymentItem3() throws JsonParseException, JsonMappingException, IOException{
	is = Thread.currentThread().getContextClassLoader().getResourceAsStream("EmploymentItem3.xml");
	expected = new EmploymentItem();
	Calendar cal = Calendar.getInstance();
	cal.set(Calendar.YEAR, 2007);
	cal.set(Calendar.MONTH, 0);
	cal.set(Calendar.DAY_OF_MONTH, 1);
	cal.set(Calendar.HOUR_OF_DAY, 1);
	cal.set(Calendar.MINUTE, 0);
	cal.set(Calendar.SECOND, 0);
	cal.set(Calendar.MILLISECOND, 0);
	expected.setStartDate(cal.getTime());
	cal.set(Calendar.YEAR, 2011);
	cal.set(Calendar.MONTH, 0);
	cal.set(Calendar.DAY_OF_MONTH, 1);
	cal.set(Calendar.HOUR_OF_DAY, 1);
	cal.set(Calendar.MINUTE, 0);
	cal.set(Calendar.SECOND, 0);
	cal.set(Calendar.MILLISECOND, 0);
	expected.setEndDate(cal.getTime());
	expected.setExperienceYears(5);
	expected.setEmployerName("Eniro Sverige Försäljning AB Malmö");
	EmploymentItem actual = om.readValue(is,  EmploymentItem.class);
	assertEquals(expected, actual);
    }
    
    @After
    public void tearDown() throws IOException{
	is.close();
    }
}
