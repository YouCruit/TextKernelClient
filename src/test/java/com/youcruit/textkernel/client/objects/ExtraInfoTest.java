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

public class ExtraInfoTest {
    private InputStream is;
    private ObjectMapper om;
    private ExtraInfo expected;
    
    @Before
    public void setUp() throws ParseException {
	is = Thread.currentThread().getContextClassLoader().getResourceAsStream("ExtraInfo.xml");
	om = new XmlMapper();
	expected = new ExtraInfo();
	expected.setTrxmlId("32015343");
	expected.setExtraInfo1("extraInfo1");
	expected.setExtraInfo2("extraInfo2");
	expected.setExtraInfo3("extraInfo3");
	expected.setExtraInfo4("extraInfo4");
    }
    
    @Test
    public void testParseExtraInfo() throws JsonParseException, JsonMappingException, IOException{
	ExtraInfo actual = om.readValue(is,  ExtraInfo.class);
	assertEquals(expected, actual);
    }
    
    @After
    public void tearDown() throws IOException{
	is.close();
    }
}
