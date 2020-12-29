package com.example.Models;

import javax.persistence.*;

@Entity
@Table
public class Herb {

    @Id
    @GeneratedValue (strategy= GenerationType.IDENTITY)

    private Long id;
    private String latinName;
    private String commonName;
    private String otherCommonNames;
    private String dosageParts;
    private String description;
    private String energetics;
    private String bodySystems;
    private String actions;

    public Herb(){}

    public Herb(String latinName, String commonName, String otherCommonNames, String dosageParts, String description, String energetics, String bodySystems, String actions) {
        this.latinName = latinName;
        this.commonName = commonName;
        this.otherCommonNames = otherCommonNames;
        this.dosageParts = dosageParts;
        this.description = description;
        this.energetics = energetics;
        this.bodySystems = bodySystems;
        this.actions = actions;
    }

    public Long getHerbId() {
        return id;
    }

    public void setHerbId(Long iD) {
        this.id = iD;
    }

    public String getLatinName() {
        return latinName;
    }

    public void setLatinName(String latinName) {
        this.latinName = latinName;
    }

    public String getCommonName() {
        return commonName;
    }

    public void setCommonName(String commonName) {
        this.commonName = commonName;
    }

    public String getOtherCommonNames() {
        return otherCommonNames;
    }

    public void setOtherCommonNames(String otherCommonNames) {
        this.otherCommonNames = otherCommonNames;
    }

    public String getDosageParts() {
        return dosageParts;
    }

    public void setDosageParts(String dosage) {
        this.dosageParts = dosage;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEnergetics() {
        return energetics;
    }

    public void setEnergetics(String energetics) {
        this.energetics = energetics;
    }

    public String getBodySystems() {
        return bodySystems;
    }

    public void setBodySystems(String bodySystems) {
        this.bodySystems = bodySystems;
    }

    public String getActions() {
        return actions;
    }

    public void setActions(String actions) {
        this.actions = actions;
    }
}
