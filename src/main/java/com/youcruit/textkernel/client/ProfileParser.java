package com.youcruit.textkernel.client;

import java.io.IOException;
import java.io.InputStream;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.youcruit.textkernel.client.objects.Profile;

public class ProfileParser 
{   
    ObjectMapper mapper;
    public ProfileParser(){
	mapper = new XmlMapper();
    }
    Profile parse(InputStream is) throws JsonParseException, JsonMappingException, IOException{
	return mapper.readValue(is, Profile.class);
    }
}
