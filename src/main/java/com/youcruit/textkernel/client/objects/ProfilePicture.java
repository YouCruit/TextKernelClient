package com.youcruit.textkernel.client.objects;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class ProfilePicture {
    @JacksonXmlProperty(localName="Base64Content")
    private String base64Content;
    @JacksonXmlProperty(localName="Filename")
    private String filename;
    @JacksonXmlProperty(localName="ContentType")
    private String contentType;
    public String getBase64Content() {
        return base64Content;
    }
    public void setBase64Content(String base64Content) {
        this.base64Content = base64Content;
    }
    public String getFilename() {
        return filename;
    }
    public void setFilename(String fileName) {
        this.filename = fileName;
    }
    public String getContentType() {
        return contentType;
    }
    public void setContentType(String contentType) {
        this.contentType = contentType;
    }
    @Override
    public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((base64Content == null) ? 0 : base64Content.hashCode());
	result = prime * result + ((contentType == null) ? 0 : contentType.hashCode());
	result = prime * result + ((filename == null) ? 0 : filename.hashCode());
	return result;
    }
    @Override
    public boolean equals(Object obj) {
	if (this == obj) return true;
	if (obj == null) return false;
	if (!(obj instanceof ProfilePicture)) return false;
	ProfilePicture other = (ProfilePicture) obj;
	if (base64Content == null) {
	    if (other.base64Content != null) return false;
	} else if (!base64Content.equals(other.base64Content)) return false;
	if (contentType == null) {
	    if (other.contentType != null) return false;
	} else if (!contentType.equals(other.contentType)) return false;
	if (filename == null) {
	    if (other.filename != null) return false;
	} else if (!filename.equals(other.filename)) return false;
	return true;
    }
    @Override
    public String toString() {
	return "ProfilePicture [base64Content=" + base64Content + ", filename=" + filename + ", contentType=" + contentType + "]";
    }
}
