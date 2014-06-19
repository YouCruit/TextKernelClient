package com.youcruit.textkernel.client.objects;

import java.io.IOException;
import java.util.Date;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.SimpleType;

public class TextKernelDateDeserializer extends JsonDeserializer<Date> {

    @Override
    public Date deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
	SimpleType st;
	st = SimpleType.construct(Date.class);
	TypeDeserializer deserialize = ctxt.getFactory().findTypeDeserializer(ctxt.getConfig(), st );
	Date date = null;
	try {
	    date = (Date) deserialize.deserializeTypedFromAny(jp, ctxt);
	} catch (Exception e) {
	    //ignore
	}
	return date;
    }

}
