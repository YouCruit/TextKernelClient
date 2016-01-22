package com.youcruit.textkernel.client;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.Charset;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.youcruit.textkernel.client.exceptions.TextKernelParsingException;
import com.youcruit.textkernel.client.objects.Profile;

public class ProfileParser 
{   
    private ObjectMapper mapper;
    private Charset UTF_8 = Charset.forName("UTF-8");

    public ProfileParser(){
	mapper = new XmlMapper();
    }
    Profile parse(byte[] bArray) throws IOException {
	if (! new String(bArray, 0, 10, UTF_8).startsWith("<?xml")) {
	    throw new TextKernelParsingException(new String(bArray, UTF_8));
	}
	return mapper.readValue(new ByteArrayInputStream(bArray), Profile.class);
    }
}
