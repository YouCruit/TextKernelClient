package com.youcruit.textkernel.client.objects;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class SoftSkill {
    @JacksonXmlProperty(localName="SoftSkillName")
    private String softSkillName;

    public String getSoftSkillName() {
        return softSkillName;
    }

    public void setSoftSkillName(String softSkillName) {
        this.softSkillName = softSkillName;
    }

    @Override
    public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((softSkillName == null) ? 0 : softSkillName.hashCode());
	return result;
    }

    @Override
    public boolean equals(Object obj) {
	if (this == obj) return true;
	if (obj == null) return false;
	if (!(obj instanceof SoftSkill)) return false;
	SoftSkill other = (SoftSkill) obj;
	if (softSkillName == null) {
	    if (other.softSkillName != null) return false;
	} else if (!softSkillName.equals(other.softSkillName)) return false;
	return true;
    }

    @Override
    public String toString() {
	return "SoftSkill [softSkillName=" + softSkillName + "]";
    }
}
