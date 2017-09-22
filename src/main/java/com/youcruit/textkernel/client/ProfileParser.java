package com.youcruit.textkernel.client;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.youcruit.textkernel.client.exceptions.TextKernelParsingException;
import com.youcruit.textkernel.client.objects.Profile;

public class ProfileParser {
    private static final Pattern HTML_ERROR_PARSER = Pattern.compile("^<!DOCTYPE html.*<meta name=\"error-desc\" content=\"([^\"]+).*$", Pattern.CASE_INSENSITIVE | Pattern.DOTALL);

    private ObjectMapper mapper;
    private Charset UTF_8 = Charset.forName("UTF-8");

    public ProfileParser() {
	mapper = new XmlMapper();
    }

    Profile parse(byte[] bArray) throws IOException {
	if (new String(bArray, 0, 10, UTF_8).startsWith("<?xml")) {
	    return mapper.readValue(new ByteArrayInputStream(bArray), Profile.class);
	} else {
	    String asString = new String(bArray, UTF_8);
	    Matcher matcher = HTML_ERROR_PARSER.matcher(asString);
	    if (matcher.matches()) {
		throw new TextKernelParsingException(matcher.group(1), asString);
	    } else {
		throw new TextKernelParsingException(asString, asString);
	    }
	}
    }
}
