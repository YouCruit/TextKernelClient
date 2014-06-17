package com.youcruit.textkernel.client;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.entity.mime.FormBodyPart;
import org.apache.http.entity.mime.HttpMultipartMode;
import org.apache.http.entity.mime.MultipartEntity;
import org.apache.http.entity.mime.content.FileBody;
import org.apache.http.entity.mime.content.StringBody;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.HttpContext;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.youcruit.textkernel.client.objects.Profile;

public class TextKernelClient {

    private static final String FORM_PART_NAME_PASSWORD = "password";
    private static final String FORM_PART_NAME_ACCOUNT = "account";
    private static final String FORM_PART_NAME_USERNAME = "username";
    private static final String FORM_PART_NAME_FILE = "uploaded_file";
    private static final String textKernelUrl = "https://home.textkernel.nl/sourcebox/processAtomicPost.do";
    private final String username;
    private final String account;
    private final String password;
    private final ProfileParser p;
    
    public TextKernelClient(final String username, final String account, final String password){
	this.username = username;
	this.account = account;
	this.password = password;
	p = new ProfileParser();
    }
    
    public Profile getProfile(File file) throws JsonParseException, JsonMappingException, IOException, URISyntaxException{
	return p.parse(upload(file));
    }

    private InputStream upload(File file) throws IOException, URISyntaxException {
	DefaultHttpClient client = getClientInstance();
	HttpContext localContext = new BasicHttpContext();
	URI upload_url = new URI(textKernelUrl);
	HttpPost upload = new HttpPost(upload_url);

	MultipartEntity entity = new MultipartEntity(HttpMultipartMode.BROWSER_COMPATIBLE);

	FileBody fileBody = new FileBody(file, "application/octet-stream");
	entity.addPart(FORM_PART_NAME_FILE, fileBody);
	entity.addPart(new FormBodyPart(FORM_PART_NAME_USERNAME, new StringBody(username)));
	entity.addPart(new FormBodyPart(FORM_PART_NAME_ACCOUNT, new StringBody(account)));
	entity.addPart(new FormBodyPart(FORM_PART_NAME_PASSWORD, new StringBody(password)));
	upload.setEntity(entity);
	HttpResponse response = client.execute(upload, localContext);

	HttpEntity responseEntity = response.getEntity();
	return responseEntity.getContent();
    }

    private DefaultHttpClient getClientInstance() {

	DefaultHttpClient client = new DefaultHttpClient();
	ClientConnectionManager mgr = client.getConnectionManager();

	HttpParams params = client.getParams();
	client = new DefaultHttpClient(new ThreadSafeClientConnManager(mgr.getSchemeRegistry()), params);
	return client;
    }
}
