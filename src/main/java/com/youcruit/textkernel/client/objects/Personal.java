package com.youcruit.textkernel.client.objects;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Personal {
    @JacksonXmlProperty(localName="Title")
    private String title;
    @JacksonXmlProperty(localName="FirstName")
    private String firstName;
    @JacksonXmlProperty(localName="LastName")
    private String lastName;
    @JacksonXmlProperty(localName="DateOfBirth")
    @JsonDeserialize(using = TextKernelDateDeserializer.class)
    private Date dateOfBirth;
    @JacksonXmlProperty(localName="Address")
    private Address address;
    @JacksonXmlProperty(localName="NationalityCodeDescription")
    private String nationalityCodeDescription;
    @JacksonXmlProperty(localName="MobilePhones")
    private List<String> mobilePhones;
    @JacksonXmlProperty(localName="HomePhones")
    private List<String> homePhones;
    @JacksonXmlProperty(localName="Emails")
    private List<String> emails;
    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
        this.address = address;
    }
    public String getNationalityCodeDescription() {
        return nationalityCodeDescription;
    }
    public void setNationalityCodeDescription(String nationalityCodeDescription) {
        this.nationalityCodeDescription = nationalityCodeDescription;
    }
    public List<String> getMobilePhones() {
	if(mobilePhones == null){
	    mobilePhones = new ArrayList<>();
	}
        return mobilePhones;
    }
    public void setMobilePhones(List<String> mobilePhones) {
        this.mobilePhones = mobilePhones;
    }
    public List<String> getHomePhones() {
	if(homePhones == null){
	    homePhones = new ArrayList<>();
	}
        return homePhones;
    }
    public void setHomePhones(List<String> homePhones) {
        this.homePhones = homePhones;
    }
    public List<String> getEmails() {
	if(emails == null){
	    emails = new ArrayList<>();
	}
        return emails;
    }
    public void setEmails(List<String> emails) {
        this.emails = emails;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public Date getDateOfBirth() {
        return dateOfBirth;
    }
    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public String getTitle() {
	return title;
    }
    public void setTitle(String title) {
	this.title = title;
    }
    public String getFirstName() {
	return firstName;
    }
    public void setFirstName(String firstName) {
	this.firstName = firstName;
    }
    @Override
    public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((address == null) ? 0 : address.hashCode());
	result = prime * result + ((dateOfBirth == null) ? 0 : dateOfBirth.hashCode());
	result = prime * result + ((emails == null) ? 0 : emails.hashCode());
	result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
	result = prime * result + ((homePhones == null) ? 0 : homePhones.hashCode());
	result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
	result = prime * result + ((mobilePhones == null) ? 0 : mobilePhones.hashCode());
	result = prime * result + ((nationalityCodeDescription == null) ? 0 : nationalityCodeDescription.hashCode());
	result = prime * result + ((title == null) ? 0 : title.hashCode());
	return result;
    }
    @Override
    public boolean equals(Object obj) {
	if (this == obj) return true;
	if (obj == null) return false;
	if (!(obj instanceof Personal)) return false;
	Personal other = (Personal) obj;
	if (address == null) {
	    if (other.address != null) return false;
	} else if (!address.equals(other.address)) return false;
	if (dateOfBirth == null) {
	    if (other.dateOfBirth != null) return false;
	} else if (!dateOfBirth.equals(other.dateOfBirth)) return false;
	if (emails == null) {
	    if (other.emails != null) return false;
	} else if (!emails.equals(other.emails)) return false;
	if (firstName == null) {
	    if (other.firstName != null) return false;
	} else if (!firstName.equals(other.firstName)) return false;
	if (homePhones == null) {
	    if (other.homePhones != null) return false;
	} else if (!homePhones.equals(other.homePhones)) return false;
	if (lastName == null) {
	    if (other.lastName != null) return false;
	} else if (!lastName.equals(other.lastName)) return false;
	if (mobilePhones == null) {
	    if (other.mobilePhones != null) return false;
	} else if (!mobilePhones.equals(other.mobilePhones)) return false;
	if (nationalityCodeDescription == null) {
	    if (other.nationalityCodeDescription != null) return false;
	} else if (!nationalityCodeDescription.equals(other.nationalityCodeDescription)) return false;
	if (title == null) {
	    if (other.title != null) return false;
	} else if (!title.equals(other.title)) return false;
	return true;
    }
    @Override
    public String toString() {
	return "Personal [title=" + title + ", firstName=" + firstName + ", lastName=" + lastName + ", dateOfBirth=" + dateOfBirth + ", address=" + address + ", nationalityCodeDescription=" + nationalityCodeDescription + ", mobilePhones="
		+ mobilePhones + ", homePhones=" + homePhones + ", emails=" + emails + "]";
    }
}
