package com.youcruit.textkernel.client.objects;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class ExtraInfo {
    @JacksonXmlProperty(localName="TrxmlID")
    private String trxmlId;
    @JacksonXmlProperty(localName="ExtraInfo1")
    private String extraInfo1;
    @JacksonXmlProperty(localName="ExtraInfo2")
    private String extraInfo2;
    @JacksonXmlProperty(localName="ExtraInfo3")
    private String extraInfo3;
    @JacksonXmlProperty(localName="ExtraInfo4")
    private String extraInfo4;
    public String getTrxmlId() {
        return trxmlId;
    }
    public void setTrxmlId(String trxmlId) {
        this.trxmlId = trxmlId;
    }
    public String getExtraInfo1() {
        return extraInfo1;
    }
    public void setExtraInfo1(String extraInfo1) {
        this.extraInfo1 = extraInfo1;
    }
    public String getExtraInfo2() {
        return extraInfo2;
    }
    public void setExtraInfo2(String extraInfo2) {
        this.extraInfo2 = extraInfo2;
    }
    public String getExtraInfo3() {
        return extraInfo3;
    }
    public void setExtraInfo3(String extraInfo3) {
        this.extraInfo3 = extraInfo3;
    }
    public String getExtraInfo4() {
        return extraInfo4;
    }
    public void setExtraInfo4(String extraInfo4) {
        this.extraInfo4 = extraInfo4;
    }
    @Override
    public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((extraInfo1 == null) ? 0 : extraInfo1.hashCode());
	result = prime * result + ((extraInfo2 == null) ? 0 : extraInfo2.hashCode());
	result = prime * result + ((extraInfo3 == null) ? 0 : extraInfo3.hashCode());
	result = prime * result + ((extraInfo4 == null) ? 0 : extraInfo4.hashCode());
	result = prime * result + ((trxmlId == null) ? 0 : trxmlId.hashCode());
	return result;
    }
    @Override
    public boolean equals(Object obj) {
	if (this == obj) return true;
	if (obj == null) return false;
	if (!(obj instanceof ExtraInfo)) return false;
	ExtraInfo other = (ExtraInfo) obj;
	if (extraInfo1 == null) {
	    if (other.extraInfo1 != null) return false;
	} else if (!extraInfo1.equals(other.extraInfo1)) return false;
	if (extraInfo2 == null) {
	    if (other.extraInfo2 != null) return false;
	} else if (!extraInfo2.equals(other.extraInfo2)) return false;
	if (extraInfo3 == null) {
	    if (other.extraInfo3 != null) return false;
	} else if (!extraInfo3.equals(other.extraInfo3)) return false;
	if (extraInfo4 == null) {
	    if (other.extraInfo4 != null) return false;
	} else if (!extraInfo4.equals(other.extraInfo4)) return false;
	if (trxmlId == null) {
	    if (other.trxmlId != null) return false;
	} else if (!trxmlId.equals(other.trxmlId)) return false;
	return true;
    }
    @Override
    public String toString() {
	return "ExtraInfo [trxmlId=" + trxmlId + ", extraInfo1=" + extraInfo1 + ", extraInfo2=" + extraInfo2 + ", extraInfo3=" + extraInfo3 + ", extraInfo4=" + extraInfo4 + "]";
    }
}
