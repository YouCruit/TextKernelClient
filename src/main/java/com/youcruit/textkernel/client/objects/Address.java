package com.youcruit.textkernel.client.objects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Address {
    @JacksonXmlProperty(localName="StreetName")
    private String streetName;
    @JacksonXmlProperty(localName="StreetNumberBase")
    private String streetNumberBase;
    @JacksonXmlProperty(localName="PostalCode")
    private String postalCode;
    @JacksonXmlProperty(localName="City")
    private String city;
    @JacksonXmlProperty(localName="CountryCodeDescription")
    private String countryCodeDescription;
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
    @Override
    public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((city == null) ? 0 : city.hashCode());
	result = prime * result + ((countryCodeDescription == null) ? 0 : countryCodeDescription.hashCode());
	result = prime * result + ((postalCode == null) ? 0 : postalCode.hashCode());
	result = prime * result + ((streetName == null) ? 0 : streetName.hashCode());
	result = prime * result + ((streetNumberBase == null) ? 0 : streetNumberBase.hashCode());
	return result;
    }
    @Override
    public boolean equals(Object obj) {
	if (this == obj) return true;
	if (obj == null) return false;
	if (!(obj instanceof Address)) return false;
	Address other = (Address) obj;
	if (city == null) {
	    if (other.city != null) return false;
	} else if (!city.equals(other.city)) return false;
	if (countryCodeDescription == null) {
	    if (other.countryCodeDescription != null) return false;
	} else if (!countryCodeDescription.equals(other.countryCodeDescription)) return false;
	if (postalCode == null) {
	    if (other.postalCode != null) return false;
	} else if (!postalCode.equals(other.postalCode)) return false;
	if (streetName == null) {
	    if (other.streetName != null) return false;
	} else if (!streetName.equals(other.streetName)) return false;
	if (streetNumberBase == null) {
	    if (other.streetNumberBase != null) return false;
	} else if (!streetNumberBase.equals(other.streetNumberBase)) return false;
	return true;
    }
    @Override
    public String toString() {
	return "Address [streetName=" + streetName + ", streetNumberBase=" + streetNumberBase + ", postalCode=" + postalCode + ", city=" + city + ", countryCodeDescription=" + countryCodeDescription + "]";
    }
}
