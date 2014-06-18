package com.youcruit.textkernel.client.objects;

import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Skills {
    @JacksonXmlProperty(localName="ComputerSkills")
    private List<ComputerSkill> computerSkills;
    @JacksonXmlProperty(localName="LanguageSkills")
    private List<LanguageSkill> languageSkills;
    @JacksonXmlProperty(localName="SoftSkills")
    private List<SoftSkill> softSkills;
    public List<ComputerSkill> getComputerSkills() {
        return computerSkills;
    }
    public void setComputerSkills(List<ComputerSkill> computerSkills) {
        this.computerSkills = computerSkills;
    }
    public List<LanguageSkill> getLanguageSkills() {
        return languageSkills;
    }
    public void setLanguageSkills(List<LanguageSkill> languageSkills) {
        this.languageSkills = languageSkills;
    }
    public List<SoftSkill> getSoftSkills() {
        return softSkills;
    }
    public void setSoftSkills(List<SoftSkill> softSkills) {
        this.softSkills = softSkills;
    }
    @Override
    public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((computerSkills == null) ? 0 : computerSkills.hashCode());
	result = prime * result + ((languageSkills == null) ? 0 : languageSkills.hashCode());
	result = prime * result + ((softSkills == null) ? 0 : softSkills.hashCode());
	return result;
    }
    @Override
    public boolean equals(Object obj) {
	if (this == obj) return true;
	if (obj == null) return false;
	if (!(obj instanceof Skills)) return false;
	Skills other = (Skills) obj;
	if (computerSkills == null) {
	    if (other.computerSkills != null) return false;
	} else if (!computerSkills.equals(other.computerSkills)) return false;
	if (languageSkills == null) {
	    if (other.languageSkills != null) return false;
	} else if (!languageSkills.equals(other.languageSkills)) return false;
	if (softSkills == null) {
	    if (other.softSkills != null) return false;
	} else if (!softSkills.equals(other.softSkills)) return false;
	return true;
    }
    @Override
    public String toString() {
	return "Skills [computerSkills=" + computerSkills + ", languageSkills=" + languageSkills + ", softSkills=" + softSkills + "]";
    }
}
