package com.youcruit.textkernel.client.objects;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.youcruit.textkernel.client.objects.Address;
import com.youcruit.textkernel.client.objects.Personal;

public class PersonalTest {
    private InputStream is;
    private ObjectMapper om;
    private Personal expected;
    
    @Before
    public void setUp() throws ParseException {
	is = Thread.currentThread().getContextClassLoader().getResourceAsStream("Personal.xml");
	om = new XmlMapper();
	expected = new Personal();
	expected.setFirstName("firstName");
	expected.setLastName("lastName");
	expected.setTitle("title");
	List<String> mobilePhones = new ArrayList<String>();
	mobilePhones.add("0046(0)555555555");
	expected.setMobilePhones(mobilePhones );
	expected.setAddress(new Address());
	List<String> homePhones = new ArrayList<String>();
	homePhones.add("0046(0)555555555");
	expected.setHomePhones(homePhones);
	List<String> emails = new ArrayList<String>();
	emails.add("ask@me.com");
	expected.setEmails(emails);
	expected.setNationalityCodeDescription("Danish");
	SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
	df.setTimeZone(TimeZone.getTimeZone("GMT"));
	expected.setDateOfBirth(df.parse("2014-06-16T00:00:00Z"));
    }
    
    @Test
    public void testParsePersonal() throws JsonParseException, JsonMappingException, IOException{
	Personal actual = om.readValue(is,  Personal.class);
	assertEquals(expected, actual);
    }
    
    @After
    public void tearDown() throws IOException{
	is.close();
    }
}
