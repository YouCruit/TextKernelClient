package com.youcruit.textkernel.client;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.mime.HttpMultipartMode;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.EntityUtils;

import com.youcruit.textkernel.client.objects.Profile;

public class TextKernelClient {

    private static final String FORM_PART_NAME_PASSWORD = "password";
    private static final String FORM_PART_NAME_ACCOUNT = "account";
    private static final String FORM_PART_NAME_USERNAME = "username";
    private static final String FORM_PART_NAME_FILE = "uploaded_file";
    private final String textKernelUrl;
    private final String username;
    private final String account;
    private final String password;
    private final ProfileParser p;
    private final CloseableHttpClient client;


    public TextKernelClient(final String textKernelUrl, final String username, final String account, final String password){
	this.username = username;
	this.account = account;
	this.password = password;
	this.textKernelUrl = textKernelUrl;
	p = new ProfileParser();
	client = HttpClients.createDefault();
    }

    public Profile getProfile(File file) throws IOException, URISyntaxException{
	try (InputStream fis = new FileInputStream(file)) {
	    return getProfile(fis);
	}
    }

    public Profile getProfile(InputStream is) throws IOException, URISyntaxException{
	    return p.parse(upload(is));
    }

    public Profile getProfile(URI uri) throws IOException, URISyntaxException{
	HttpGet httpGet = new HttpGet(uri);
	HttpEntity entity = client.execute(httpGet).getEntity();
	try (InputStream dis = entity.getContent()) {
	    return getProfile(dis);
	}
    }

    private byte[] upload(InputStream content) throws IOException, URISyntaxException{
	HttpContext localContext = new BasicHttpContext();
	URI upload_url = new URI(textKernelUrl);
	HttpPost upload = new HttpPost(upload_url);

	HttpEntity entity = MultipartEntityBuilder.create().setMode(HttpMultipartMode.BROWSER_COMPATIBLE).
		addBinaryBody(FORM_PART_NAME_FILE, content, ContentType.APPLICATION_OCTET_STREAM, "").
		addTextBody(FORM_PART_NAME_USERNAME, username).
		addTextBody(FORM_PART_NAME_ACCOUNT, account).
		addTextBody(FORM_PART_NAME_PASSWORD, password).
		build();
	upload.setEntity(entity);
	HttpResponse response = client.execute(upload, localContext);

	int status = response.getStatusLine().getStatusCode();
	if(status != HttpStatus.SC_OK){
	    String responseString = EntityUtils.toString(response.getEntity());
	    throw new IOException("TextKernel returned a non expected response code: " + status + " \nResponse was:\n " + responseString);
	}

	return EntityUtils.toByteArray(response.getEntity());
    }
}
