package com.youcruit.textkernel.client;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URISyntaxException;

import com.youcruit.textkernel.client.objects.Profile;

public class TextKernelINTTest {

    public static void main(String[] args) throws IOException, URISyntaxException {
	if(args.length!=5){
	    System.out.println("Usage: java TextKernelINTTest url username account password path_to_cv");
	}
	String url = args[0];
	String username = args[1];
	String account = args[2];
	String password = args[3];
	String file = args[4];

	TextKernelClient tkclient = new TextKernelClient(url, username, account, password);
	Profile p = tkclient.getProfile(new FileInputStream(new File(file)));
	System.out.println(p.getRawHtml());
    }
}
