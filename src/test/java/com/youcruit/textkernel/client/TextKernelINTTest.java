package com.youcruit.textkernel.client;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

public class TextKernelINTTest {

    public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException, URISyntaxException {
	if(args.length!=5){
	    System.out.println("Usage: java TextKernelINTTest url username account password path_to_cv");
	}
	TextKernelClient tkclient = new TextKernelClient(args[0], args[1], args[2], args[3]);
	System.out.println(tkclient.getProfile(new File(args[4])));
    }

}
