package com.youcruit.textkernel.client.objects;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.neovisionaries.i18n.CountryCode;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Address {
    @JacksonXmlProperty(localName = "StreetName")
    private String streetName;
    @JacksonXmlProperty(localName = "StreetNumberBase")
    private String streetNumberBase;
    @JacksonXmlProperty(localName = "PostalCode")
    private String postalCode;
    @JacksonXmlProperty(localName = "City")
    private String city;
    @JacksonXmlProperty(localName = "CountryCodeDescription")
    private String countryCodeDescription;
    @JacksonXmlProperty(localName = "CountryCode")
    private CountryCode countryCode;
    @JacksonXmlProperty(localName = "RegionCode")
    private String regionCode;
    @JacksonXmlProperty(localName = "RegionCodeDescription")
    private String regionCodeDescription;

    public String getStreetName() {
	return streetName;
    }

    public void setStreetName(String streetName) {
	this.streetName = streetName;
    }

    public String getStreetNumberBase() {
	return streetNumberBase;
    }

    public void setStreetNumberBase(String streetNumberBase) {
	this.streetNumberBase = streetNumberBase;
    }

    public String getPostalCode() {
	return postalCode;
    }

    public void setPostalCode(String postalCode) {
	this.postalCode = postalCode;
    }

    public String getCity() {
	return city;
    }

    public void setCity(String city) {
	this.city = city;
    }

    public String getCountryCodeDescription() {
	return countryCodeDescription;
    }

    public void setCountryCodeDescription(String countryCodeDescription) {
	this.countryCodeDescription = countryCodeDescription;
    }

    public CountryCode getCountryCode() {

	return countryCode;
    }

    public void setCountryCode(final CountryCode countryCode) {
	this.countryCode = countryCode;
    }

    public String getRegionCode() {
	return regionCode;
    }

    public void setRegionCode(final String regionCode) {
	this.regionCode = regionCode;
    }

    public String getRegionCodeDescription() {
	return regionCodeDescription;
    }

    public void setRegionCodeDescription(final String regionCodeDescription) {
	this.regionCodeDescription = regionCodeDescription;
    }

    @Override
    public boolean equals(final Object o) {
	if (this == o) {
	    return true;
	}
	if (!(o instanceof Address)) {
	    return false;
	}
	Address address = (Address) o;
	return Objects.equals(getStreetName(), address.getStreetName()) &&
		Objects.equals(getStreetNumberBase(), address.getStreetNumberBase()) &&
		Objects.equals(getPostalCode(), address.getPostalCode()) &&
		Objects.equals(getCity(), address.getCity()) &&
		Objects.equals(getCountryCodeDescription(), address.getCountryCodeDescription()) &&
		getCountryCode() == address.getCountryCode() &&
		Objects.equals(getRegionCode(), address.getRegionCode()) &&
		Objects.equals(getRegionCodeDescription(), address.getRegionCodeDescription());
    }

    @Override
    public int hashCode() {

	return Objects.hash(getStreetName(), getStreetNumberBase(), getPostalCode(), getCity(), getCountryCodeDescription(), getCountryCode(), getRegionCode(), getRegionCodeDescription());
    }

    @Override
    public String toString() {
	return "Address{" +
		"streetName='" + streetName + '\'' +
		", streetNumberBase='" + streetNumberBase + '\'' +
		", postalCode='" + postalCode + '\'' +
		", city='" + city + '\'' +
		", countryCodeDescription='" + countryCodeDescription + '\'' +
		", countryCode=" + countryCode +
		", regionCode='" + regionCode + '\'' +
		", regionCodeDescription='" + regionCodeDescription + '\'' +
		'}';
    }
}
