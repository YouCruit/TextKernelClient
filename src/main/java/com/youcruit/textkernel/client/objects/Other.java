package com.youcruit.textkernel.client.objects;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Other {
    @JacksonXmlProperty(localName="Hobbies")
    private List<String> hobbies;
    @JacksonXmlProperty(localName="References")
    private List<String> references;
    public List<String> getHobbies() {
	if(hobbies == null){
	    hobbies = new ArrayList<String>();
	}
        return hobbies;
    }
    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }
    public List<String> getReferences() {
	if(references == null){
	    references = new ArrayList<String>();
	}
        return references;
    }
    public void setReferences(List<String> references) {
        this.references = references;
    }
    @Override
    public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((hobbies == null) ? 0 : hobbies.hashCode());
	result = prime * result + ((references == null) ? 0 : references.hashCode());
	return result;
    }
    @Override
    public boolean equals(Object obj) {
	if (this == obj) return true;
	if (obj == null) return false;
	if (!(obj instanceof Other)) return false;
	Other other = (Other) obj;
	if (hobbies == null) {
	    if (other.hobbies != null) return false;
	} else if (!hobbies.equals(other.hobbies)) return false;
	if (references == null) {
	    if (other.references != null) return false;
	} else if (!references.equals(other.references)) return false;
	return true;
    }
    @Override
    public String toString() {
	return "Other [hobbies=" + hobbies + ", references=" + references + "]";
    }
}
