package com.youcruit.textkernel.client.objects;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Profile {
    private String lang;
    @JacksonXmlProperty(localName="Personal")
    private Personal personal;
    @JacksonXmlProperty(localName="EducationHistory")
    private List<EductationItem> educationHistory;
    @JacksonXmlProperty(localName="EmploymentHistory")
    private List<EmploymentItem> employmentHistory;
    @JacksonXmlProperty(localName="Skills")
    private Skills skills;
    @JacksonXmlProperty(localName="Other")
    private Other other;
    @JacksonXmlProperty(localName="CustomArea")
    private CustomArea customArea;
    @JacksonXmlProperty(localName="DocumentHtml")
    private String rawHtml;
    @JacksonXmlProperty(localName="DocumentText")
    private String rawText;
    
    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public Personal getPersonal() {
	return personal;
    }

    public void setPersonal(Personal personal) {
	this.personal = personal;
    }

    public List<EductationItem> getEducationHistory() {
	if(educationHistory==null){
	    educationHistory = new ArrayList<EductationItem>();
	}
        return educationHistory;
    }

    public void setEducationHistory(List<EductationItem> educationHistory) {
        this.educationHistory = educationHistory;
    }

    public List<EmploymentItem> getEmploymentHistory() {
	if(employmentHistory == null){
	    employmentHistory = new ArrayList<EmploymentItem>();
	}
        return employmentHistory;
    }

    public void setEmploymentHistory(List<EmploymentItem> employmentHistory) {
        this.employmentHistory = employmentHistory;
    }

    public Skills getSkills() {
        return skills;
    }

    public void setSkills(Skills skills) {
        this.skills = skills;
    }

    public Other getOther() {
        return other;
    }

    public void setOther(Other other) {
        this.other = other;
    }

    public CustomArea getCustomArea() {
        return customArea;
    }

    public void setCustomArea(CustomArea customArea) {
        this.customArea = customArea;
    }

    public String getRawHtml() {
	return rawHtml;
    }

    public void setRawHtml(String rawHtml) {
	this.rawHtml = rawHtml;
    }

    public String getRawText() {
        return rawText;
    }

    public void setRawText(final String rawText) {
        this.rawText = rawText;
    }

    @Override
    public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((customArea == null) ? 0 : customArea.hashCode());
	result = prime * result + ((educationHistory == null) ? 0 : educationHistory.hashCode());
	result = prime * result + ((employmentHistory == null) ? 0 : employmentHistory.hashCode());
	result = prime * result + ((lang == null) ? 0 : lang.hashCode());
	result = prime * result + ((other == null) ? 0 : other.hashCode());
	result = prime * result + ((personal == null) ? 0 : personal.hashCode());
	result = prime * result + ((skills == null) ? 0 : skills.hashCode());
	return result;
    }

    @Override
    public boolean equals(Object obj) {
	if (this == obj) return true;
	if (obj == null) return false;
	if (!(obj instanceof Profile)) return false;
	Profile other = (Profile) obj;
	if (customArea == null) {
	    if (other.customArea != null) return false;
	} else if (!customArea.equals(other.customArea)) return false;
	if (educationHistory == null) {
	    if (other.educationHistory != null) return false;
	} else if (!educationHistory.equals(other.educationHistory)) return false;
	if (employmentHistory == null) {
	    if (other.employmentHistory != null) return false;
	} else if (!employmentHistory.equals(other.employmentHistory)) return false;
	if (lang == null) {
	    if (other.lang != null) return false;
	} else if (!lang.equals(other.lang)) return false;
	if (this.other == null) {
	    if (other.other != null) return false;
	} else if (!this.other.equals(other.other)) return false;
	if (personal == null) {
	    if (other.personal != null) return false;
	} else if (!personal.equals(other.personal)) return false;
	if (skills == null) {
	    if (other.skills != null) return false;
	} else if (!skills.equals(other.skills)) return false;
	return true;
    }

    @Override
    public String toString() {
	return "Profile [lang=" + lang + ", personal=" + personal + ", educationHistory=" + educationHistory + ", employmentHistory=" + employmentHistory + ", skills=" + skills + ", other=" + other
		+ ", customArea=" + customArea + "]";
    }
}
