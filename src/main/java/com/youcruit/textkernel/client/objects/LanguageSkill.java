package com.youcruit.textkernel.client.objects;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class LanguageSkill {
    @JacksonXmlProperty(localName="LanguageSkillCode")
    private String languageSkillCode;
    @JacksonXmlProperty(localName="LanguageSkillCodeDescription")
    private String languageSkillCodeDescription;
    @JacksonXmlProperty(localName="LanguageProficiencyCode")
    private int languageProficiencyCode;
    @JacksonXmlProperty(localName="LanguageProficiencyCodeDescription")
    private String languageProficiencyCodeDescription;
    public String getLanguageSkillCode() {
        return languageSkillCode;
    }
    public void setLanguageSkillCode(String languageSkillCode) {
        this.languageSkillCode = languageSkillCode;
    }
    public String getLanguageSkillCodeDescription() {
        return languageSkillCodeDescription;
    }
    public void setLanguageSkillCodeDescription(String languageSkillCodeDescription) {
        this.languageSkillCodeDescription = languageSkillCodeDescription;
    }
    public int getLanguageProficiencyCode() {
        return languageProficiencyCode;
    }
    public void setLanguageProficiencyCode(int languageProficiencyCode) {
        this.languageProficiencyCode = languageProficiencyCode;
    }
    public String getLanguageProficiencyCodeDescription() {
        return languageProficiencyCodeDescription;
    }
    public void setLanguageProficiencyCodeDescription(String languageProficiencyCodeDescription) {
        this.languageProficiencyCodeDescription = languageProficiencyCodeDescription;
    }
    @Override
    public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + languageProficiencyCode;
	result = prime * result + ((languageProficiencyCodeDescription == null) ? 0 : languageProficiencyCodeDescription.hashCode());
	result = prime * result + ((languageSkillCode == null) ? 0 : languageSkillCode.hashCode());
	result = prime * result + ((languageSkillCodeDescription == null) ? 0 : languageSkillCodeDescription.hashCode());
	return result;
    }
    @Override
    public boolean equals(Object obj) {
	if (this == obj) return true;
	if (obj == null) return false;
	if (!(obj instanceof LanguageSkill)) return false;
	LanguageSkill other = (LanguageSkill) obj;
	if (languageProficiencyCode != other.languageProficiencyCode) return false;
	if (languageProficiencyCodeDescription == null) {
	    if (other.languageProficiencyCodeDescription != null) return false;
	} else if (!languageProficiencyCodeDescription.equals(other.languageProficiencyCodeDescription)) return false;
	if (languageSkillCode == null) {
	    if (other.languageSkillCode != null) return false;
	} else if (!languageSkillCode.equals(other.languageSkillCode)) return false;
	if (languageSkillCodeDescription == null) {
	    if (other.languageSkillCodeDescription != null) return false;
	} else if (!languageSkillCodeDescription.equals(other.languageSkillCodeDescription)) return false;
	return true;
    }
    @Override
    public String toString() {
	return "LanguageSkill [languageSkillCode=" + languageSkillCode + ", languageSkillCodeDescription=" + languageSkillCodeDescription + ", languageProficiencyCode=" + languageProficiencyCode + ", languageProficiencyCodeDescription="
		+ languageProficiencyCodeDescription + "]";
    }
}
