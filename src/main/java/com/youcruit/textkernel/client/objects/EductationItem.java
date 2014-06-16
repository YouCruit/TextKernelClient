package com.youcruit.textkernel.client.objects;

import java.util.Date;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class EductationItem {
    @JacksonXmlProperty(localName="EducationLevelCode")
    private int EducationLevelCode;
    @JacksonXmlProperty(localName="EducationLevelCodeDescription")
    private String educationLevelCodeDescription;
    @JacksonXmlProperty(localName="DegreeDirection")
    private String degreeDirection;
    @JacksonXmlProperty(localName="StartDate")
    private Date startDate;
    @JacksonXmlProperty(localName="EndDate")
    private Date EndDate;
    @JacksonXmlProperty(localName="InstituteName")
    private String InstituteName;
    @JacksonXmlProperty(localName="DiplomaCode")
    private int DiplomaCode;
    @JacksonXmlProperty(localName="DiplomaCodeDescription")
    private String DiplomaCodeDescription;
    public int getEducationLevelCode() {
        return EducationLevelCode;
    }
    public void setEducationLevelCode(int educationLevelCode) {
        EducationLevelCode = educationLevelCode;
    }
    public String getEducationLevelCodeDescription() {
        return educationLevelCodeDescription;
    }
    public void setEducationLevelCodeDescription(String educationLevelCodeDescription) {
        this.educationLevelCodeDescription = educationLevelCodeDescription;
    }
    public String getDegreeDirection() {
        return degreeDirection;
    }
    public void setDegreeDirection(String degreeDirection) {
        this.degreeDirection = degreeDirection;
    }
    public Date getStartDate() {
        return startDate;
    }
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
    public Date getEndDate() {
        return EndDate;
    }
    public void setEndDate(Date endDate) {
        EndDate = endDate;
    }
    public String getInstituteName() {
        return InstituteName;
    }
    public void setInstituteName(String instituteName) {
        InstituteName = instituteName;
    }
    public int getDiplomaCode() {
        return DiplomaCode;
    }
    public void setDiplomaCode(int diplomaCode) {
        DiplomaCode = diplomaCode;
    }
    public String getDiplomaCodeDescription() {
        return DiplomaCodeDescription;
    }
    public void setDiplomaCodeDescription(String diplomaCodeDescription) {
        DiplomaCodeDescription = diplomaCodeDescription;
    }
    @Override
    public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + DiplomaCode;
	result = prime * result + ((DiplomaCodeDescription == null) ? 0 : DiplomaCodeDescription.hashCode());
	result = prime * result + EducationLevelCode;
	result = prime * result + ((EndDate == null) ? 0 : EndDate.hashCode());
	result = prime * result + ((InstituteName == null) ? 0 : InstituteName.hashCode());
	result = prime * result + ((degreeDirection == null) ? 0 : degreeDirection.hashCode());
	result = prime * result + ((educationLevelCodeDescription == null) ? 0 : educationLevelCodeDescription.hashCode());
	result = prime * result + ((startDate == null) ? 0 : startDate.hashCode());
	return result;
    }
    @Override
    public boolean equals(Object obj) {
	if (this == obj) return true;
	if (obj == null) return false;
	if (!(obj instanceof EductationItem)) return false;
	EductationItem other = (EductationItem) obj;
	if (DiplomaCode != other.DiplomaCode) return false;
	if (DiplomaCodeDescription == null) {
	    if (other.DiplomaCodeDescription != null) return false;
	} else if (!DiplomaCodeDescription.equals(other.DiplomaCodeDescription)) return false;
	if (EducationLevelCode != other.EducationLevelCode) return false;
	if (EndDate == null) {
	    if (other.EndDate != null) return false;
	} else if (!EndDate.equals(other.EndDate)) return false;
	if (InstituteName == null) {
	    if (other.InstituteName != null) return false;
	} else if (!InstituteName.equals(other.InstituteName)) return false;
	if (degreeDirection == null) {
	    if (other.degreeDirection != null) return false;
	} else if (!degreeDirection.equals(other.degreeDirection)) return false;
	if (educationLevelCodeDescription == null) {
	    if (other.educationLevelCodeDescription != null) return false;
	} else if (!educationLevelCodeDescription.equals(other.educationLevelCodeDescription)) return false;
	if (startDate == null) {
	    if (other.startDate != null) return false;
	} else if (!startDate.equals(other.startDate)) return false;
	return true;
    }
    @Override
    public String toString() {
	return "EductationItem [EducationLevelCode=" + EducationLevelCode + ", educationLevelCodeDescription=" + educationLevelCodeDescription + ", degreeDirection=" + degreeDirection + ", startDate=" + startDate + ", EndDate=" + EndDate
		+ ", InstituteName=" + InstituteName + ", DiplomaCode=" + DiplomaCode + ", DiplomaCodeDescription=" + DiplomaCodeDescription + "]";
    }
}
