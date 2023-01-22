package org.example;

import org.example.types.ExperienceType;

public class Dealer {
    private String name;

    private ExperienceType experienceType;

    public Dealer(String name, ExperienceType experienceType) {
        this.name = name;
        this.experienceType = experienceType;
    }

    public ExperienceType getExperienceType() {
        return experienceType;
    }
}
