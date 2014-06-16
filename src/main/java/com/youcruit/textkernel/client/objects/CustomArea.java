package com.youcruit.textkernel.client.objects;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class CustomArea {
    @JacksonXmlProperty(localName="CVTitle")
    private String cvTitle;
    @JacksonXmlProperty(localName="TotalExperienceYears")
    private int totalExperienceYears;
    @JacksonXmlProperty(localName="CurrentJob")
    private String currentJob;
    @JacksonXmlProperty(localName="CurrentEmployer")
    private String currentEmployer;
    @JacksonXmlProperty(localName="Last3Experiences")
    private String last3Experiences;
    @JacksonXmlProperty(localName="HighestEducationLevelCode")
    private int highestEducationLevelCode;
    @JacksonXmlProperty(localName="HighestEducationLevelCodeDescription")
    private String highestEducationLevelCodeDescription;
    @JacksonXmlProperty(localName="SalaryCode")
    private int salaryCode;
    @JacksonXmlProperty(localName="SalaryCodeDescription")
    private String salaryCodeDescription;
    @JacksonXmlProperty(localName="CandidateStatusCode")
    private int candidateStatusCode;
    @JacksonXmlProperty(localName="CandidateStatusCodeDescription")
    private String candidateStatusCodeDescription;
    @JacksonXmlProperty(localName="AvailabilityCode")
    private int availabilityCode;
    @JacksonXmlProperty(localName="AvailabilityCodeDescription")
    private String availabilityCodeDescription;
    @JacksonXmlProperty(localName="CVComment")
    private String cvComment;
    @JacksonXmlProperty(localName="CandidatePermission")
    private String candidatePermission;
    @JacksonXmlProperty(localName="ExternalID")
    private String externalId;
    @JacksonXmlProperty(localName="ProfilePicture")
    private ProfilePicture profilePicture;
    @JacksonXmlProperty(localName="ExtraInfo")
    private ExtraInfo extraInfo;
    public String getCvTitle() {
        return cvTitle;
    }
    public void setCvTitle(String cvTitle) {
        this.cvTitle = cvTitle;
    }
    public int getTotalExperienceYears() {
        return totalExperienceYears;
    }
    public void setTotalExperienceYears(int totalExperienceYears) {
        this.totalExperienceYears = totalExperienceYears;
    }
    public String getCurrentJob() {
        return currentJob;
    }
    public void setCurrentJob(String currentJob) {
        this.currentJob = currentJob;
    }
    public String getCurrentEmployer() {
        return currentEmployer;
    }
    public void setCurrentEmployer(String currentEmployer) {
        this.currentEmployer = currentEmployer;
    }
    public String getLast3Experiences() {
        return last3Experiences;
    }
    public void setLast3Experiences(String last3Experiences) {
        this.last3Experiences = last3Experiences;
    }
    public int getHighestEducationLevelCode() {
        return highestEducationLevelCode;
    }
    public void setHighestEducationLevelCode(int highestEducationLevelCode) {
        this.highestEducationLevelCode = highestEducationLevelCode;
    }
    public String getHighestEducationLevelCodeDescription() {
        return highestEducationLevelCodeDescription;
    }
    public void setHighestEducationLevelCodeDescription(String highestEducationLevelCodeDescription) {
        this.highestEducationLevelCodeDescription = highestEducationLevelCodeDescription;
    }
    public int getSalaryCode() {
        return salaryCode;
    }
    public void setSalaryCode(int salaryCode) {
        this.salaryCode = salaryCode;
    }
    public String getSalaryCodeDescription() {
        return salaryCodeDescription;
    }
    public void setSalaryCodeDescription(String salaryCodeDescription) {
        this.salaryCodeDescription = salaryCodeDescription;
    }
    public int getCandidateStatusCode() {
        return candidateStatusCode;
    }
    public void setCandidateStatusCode(int candidateStatusCode) {
        this.candidateStatusCode = candidateStatusCode;
    }
    public String getCandidateStatusCodeDescription() {
        return candidateStatusCodeDescription;
    }
    public void setCandidateStatusCodeDescription(String candidateStatusCodeDescription) {
        this.candidateStatusCodeDescription = candidateStatusCodeDescription;
    }
    public int getAvailabilityCode() {
        return availabilityCode;
    }
    public void setAvailabilityCode(int availabilityCode) {
        this.availabilityCode = availabilityCode;
    }
    public String getAvailabilityCodeDescription() {
        return availabilityCodeDescription;
    }
    public void setAvailabilityCodeDescription(String availabilityCodeDescription) {
        this.availabilityCodeDescription = availabilityCodeDescription;
    }
    public String getCvComment() {
        return cvComment;
    }
    public void setCvComment(String cvComment) {
        this.cvComment = cvComment;
    }
    public String getCandidatePermission() {
        return candidatePermission;
    }
    public void setCandidatePermission(String candidatePermission) {
        this.candidatePermission = candidatePermission;
    }
    public String getExternalId() {
        return externalId;
    }
    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }
    public ProfilePicture getProfilePicture() {
        return profilePicture;
    }
    public void setProfilePicture(ProfilePicture profilePicture) {
        this.profilePicture = profilePicture;
    }
    public ExtraInfo getExtraInfo() {
        return extraInfo;
    }
    public void setExtraInfo(ExtraInfo extraInfo) {
        this.extraInfo = extraInfo;
    }
    @Override
    public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + availabilityCode;
	result = prime * result + ((availabilityCodeDescription == null) ? 0 : availabilityCodeDescription.hashCode());
	result = prime * result + ((candidatePermission == null) ? 0 : candidatePermission.hashCode());
	result = prime * result + candidateStatusCode;
	result = prime * result + ((candidateStatusCodeDescription == null) ? 0 : candidateStatusCodeDescription.hashCode());
	result = prime * result + ((currentEmployer == null) ? 0 : currentEmployer.hashCode());
	result = prime * result + ((currentJob == null) ? 0 : currentJob.hashCode());
	result = prime * result + ((cvComment == null) ? 0 : cvComment.hashCode());
	result = prime * result + ((cvTitle == null) ? 0 : cvTitle.hashCode());
	result = prime * result + ((externalId == null) ? 0 : externalId.hashCode());
	result = prime * result + ((extraInfo == null) ? 0 : extraInfo.hashCode());
	result = prime * result + highestEducationLevelCode;
	result = prime * result + ((highestEducationLevelCodeDescription == null) ? 0 : highestEducationLevelCodeDescription.hashCode());
	result = prime * result + ((last3Experiences == null) ? 0 : last3Experiences.hashCode());
	result = prime * result + ((profilePicture == null) ? 0 : profilePicture.hashCode());
	result = prime * result + salaryCode;
	result = prime * result + ((salaryCodeDescription == null) ? 0 : salaryCodeDescription.hashCode());
	result = prime * result + totalExperienceYears;
	return result;
    }
    @Override
    public boolean equals(Object obj) {
	if (this == obj) return true;
	if (obj == null) return false;
	if (!(obj instanceof CustomArea)) return false;
	CustomArea other = (CustomArea) obj;
	if (availabilityCode != other.availabilityCode) return false;
	if (availabilityCodeDescription == null) {
	    if (other.availabilityCodeDescription != null) return false;
	} else if (!availabilityCodeDescription.equals(other.availabilityCodeDescription)) return false;
	if (candidatePermission == null) {
	    if (other.candidatePermission != null) return false;
	} else if (!candidatePermission.equals(other.candidatePermission)) return false;
	if (candidateStatusCode != other.candidateStatusCode) return false;
	if (candidateStatusCodeDescription == null) {
	    if (other.candidateStatusCodeDescription != null) return false;
	} else if (!candidateStatusCodeDescription.equals(other.candidateStatusCodeDescription)) return false;
	if (currentEmployer == null) {
	    if (other.currentEmployer != null) return false;
	} else if (!currentEmployer.equals(other.currentEmployer)) return false;
	if (currentJob == null) {
	    if (other.currentJob != null) return false;
	} else if (!currentJob.equals(other.currentJob)) return false;
	if (cvComment == null) {
	    if (other.cvComment != null) return false;
	} else if (!cvComment.equals(other.cvComment)) return false;
	if (cvTitle == null) {
	    if (other.cvTitle != null) return false;
	} else if (!cvTitle.equals(other.cvTitle)) return false;
	if (externalId == null) {
	    if (other.externalId != null) return false;
	} else if (!externalId.equals(other.externalId)) return false;
	if (extraInfo == null) {
	    if (other.extraInfo != null) return false;
	} else if (!extraInfo.equals(other.extraInfo)) return false;
	if (highestEducationLevelCode != other.highestEducationLevelCode) return false;
	if (highestEducationLevelCodeDescription == null) {
	    if (other.highestEducationLevelCodeDescription != null) return false;
	} else if (!highestEducationLevelCodeDescription.equals(other.highestEducationLevelCodeDescription)) return false;
	if (last3Experiences == null) {
	    if (other.last3Experiences != null) return false;
	} else if (!last3Experiences.equals(other.last3Experiences)) return false;
	if (profilePicture == null) {
	    if (other.profilePicture != null) return false;
	} else if (!profilePicture.equals(other.profilePicture)) return false;
	if (salaryCode != other.salaryCode) return false;
	if (salaryCodeDescription == null) {
	    if (other.salaryCodeDescription != null) return false;
	} else if (!salaryCodeDescription.equals(other.salaryCodeDescription)) return false;
	if (totalExperienceYears != other.totalExperienceYears) return false;
	return true;
    }
    @Override
    public String toString() {
	return "CustomArea [cvTitle=" + cvTitle + ", totalExperienceYears=" + totalExperienceYears + ", currentJob=" + currentJob + ", currentEmployer=" + currentEmployer + ", last3Experiences=" + last3Experiences
		+ ", highestEducationLevelCode=" + highestEducationLevelCode + ", highestEducationLevelCodeDescription=" + highestEducationLevelCodeDescription + ", salaryCode=" + salaryCode + ", salaryCodeDescription="
		+ salaryCodeDescription + ", candidateStatusCode=" + candidateStatusCode + ", candidateStatusCodeDescription=" + candidateStatusCodeDescription + ", availabilityCode=" + availabilityCode + ", availabilityCodeDescription="
		+ availabilityCodeDescription + ", cvComment=" + cvComment + ", candidatePermission=" + candidatePermission + ", externalId=" + externalId + ", profilePicture=" + profilePicture + ", extraInfo=" + extraInfo + "]";
    }
}
