package com.youcruit.textkernel.client.objects;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.io.InputStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class AddressTest {
    private InputStream is;
    private ObjectMapper om;
    private Address expected;
    
    @Before
    public void setUp() {
	is = Thread.currentThread().getContextClassLoader().getResourceAsStream("Address.xml");
	om = new XmlMapper();
	expected = new Address();
	expected.setCity("Malmo");
	expected.setCountryCodeDescription("Island");
	expected.setPostalCode("123");
	expected.setStreetNumberBase("1");
	expected.setStreetName("streetName");
    }
    
    @Test
    public void testParseAddress() throws JsonParseException, JsonMappingException, IOException{
	Address actual = om.readValue(is,  Address.class);
	assertEquals(expected, actual);
    }
    
    @After
    public void tearDown() throws IOException{
	is.close();
    }
}
