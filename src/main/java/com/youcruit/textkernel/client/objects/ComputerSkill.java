package com.youcruit.textkernel.client.objects;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class ComputerSkill {
    @JacksonXmlProperty(localName="ComputerSkillName")
    private String computerSkillName;
    @JacksonXmlProperty(localName="ComputerSkillDuration")
    private int computerSkillDuration;
    public String getComputerSkillName() {
        return computerSkillName;
    }
    public void setComputerSkillName(String computerSkillName) {
        this.computerSkillName = computerSkillName;
    }
    public int getComputerSkillDuration() {
        return computerSkillDuration;
    }
    public void setComputerSkillDuration(int computerSkillDuration) {
        this.computerSkillDuration = computerSkillDuration;
    }
    @Override
    public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + computerSkillDuration;
	result = prime * result + ((computerSkillName == null) ? 0 : computerSkillName.hashCode());
	return result;
    }
    @Override
    public boolean equals(Object obj) {
	if (this == obj) return true;
	if (obj == null) return false;
	if (!(obj instanceof ComputerSkill)) return false;
	ComputerSkill other = (ComputerSkill) obj;
	if (computerSkillDuration != other.computerSkillDuration) return false;
	if (computerSkillName == null) {
	    if (other.computerSkillName != null) return false;
	} else if (!computerSkillName.equals(other.computerSkillName)) return false;
	return true;
    }
    @Override
    public String toString() {
	return "ComputerSkill [computerSkillName=" + computerSkillName + ", computerSkillDuration=" + computerSkillDuration + "]";
    }
}
