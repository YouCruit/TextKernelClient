package com.youcruit.textkernel.client.objects;

import java.io.IOException;
import java.util.Date;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

public class TextKernelDateDeserializer extends JsonDeserializer<Date> {

    @Override
    public Date deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
	Date date = null;
	try {
	    date = jp.readValueAs(Date.class);
	} catch (Exception e) {
	    //ignore and return null
	}
	return date;
    }

}
