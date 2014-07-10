package com.youcruit.textkernel.client.objects;

import java.util.Date;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class EmploymentItem {
    @JacksonXmlProperty(localName="JobTitle")
    private String jobTitle;
    @JacksonXmlProperty(localName="StartDate")
    @JsonDeserialize(using = TextKernelDateDeserializer.class)
    private Date startDate;
    @JacksonXmlProperty(localName="EndDate")
    @JsonDeserialize(using = TextKernelDateDeserializer.class)
    private Date endDate;
    @JacksonXmlProperty(localName="ExperienceYears")
    private int experienceYears;
    @JacksonXmlProperty(localName="EmployerName")
    private String employerName;
    @JacksonXmlProperty(localName="Description")
    private String description;
    public String getJobTitle() {
        return jobTitle;
    }
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
    public Date getStartDate() {
        return startDate;
    }
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
    public Date getEndDate() {
        return endDate;
    }
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
    public int getExperienceYears() {
        return experienceYears;
    }
    public void setExperienceYears(int experienceYears) {
        this.experienceYears = experienceYears;
    }
    public String getEmployerName() {
        return employerName;
    }
    public void setEmployerName(String employerName) {
        this.employerName = employerName;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    @Override
    public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((description == null) ? 0 : description.hashCode());
	result = prime * result + ((employerName == null) ? 0 : employerName.hashCode());
	result = prime * result + ((endDate == null) ? 0 : endDate.hashCode());
	result = prime * result + experienceYears;
	result = prime * result + ((jobTitle == null) ? 0 : jobTitle.hashCode());
	result = prime * result + ((startDate == null) ? 0 : startDate.hashCode());
	return result;
    }
    @Override
    public boolean equals(Object obj) {
	if (this == obj) return true;
	if (obj == null) return false;
	if (!(obj instanceof EmploymentItem)) return false;
	EmploymentItem other = (EmploymentItem) obj;
	if (description == null) {
	    if (other.description != null) return false;
	} else if (!description.equals(other.description)) return false;
	if (employerName == null) {
	    if (other.employerName != null) return false;
	} else if (!employerName.equals(other.employerName)) return false;
	if (endDate == null) {
	    if (other.endDate != null) return false;
	} else if (!endDate.equals(other.endDate)) return false;
	if (experienceYears != other.experienceYears) return false;
	if (jobTitle == null) {
	    if (other.jobTitle != null) return false;
	} else if (!jobTitle.equals(other.jobTitle)) return false;
	if (startDate == null) {
	    if (other.startDate != null) return false;
	} else if (!startDate.equals(other.startDate)) return false;
	return true;
    }
    @Override
    public String toString() {
	return "EmploymentItem [jobTitle=" + jobTitle + ", startDate=" + startDate + ", endDate=" + endDate + ", experienceYears=" + experienceYears + ", employerName=" + employerName + ", description=" + description + "]";
    }
}
