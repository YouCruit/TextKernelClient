package com.youcruit.textkernel.client.objects;

import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Skills {
    @JacksonXmlProperty(localName="ComputerSkills")
    private List<ComputerSkill> computerSkills;
    @JacksonXmlProperty(localName="LanguageSkills")
    private List<LanguageSkill> languageSkills;
    @JacksonXmlProperty(localName="SoftSkills")
    private List<SoftSkill> softSkills;
}
