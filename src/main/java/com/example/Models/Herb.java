package com.example.Models;

import javax.persistence.*;

@Entity
@Table
public class Herb {

    @Id
    @GeneratedValue (strategy= GenerationType.IDENTITY)

    private Long herbID;
    private String latinName;
    private String commonName;
    private String dosage;
    private String description;
    private String energetics;
    private String bodySystemsAffected;

    public Herb(){}

    public Herb(String latinName, String commonName, String dosage, String description, String energetics, String bodySystemsAffected) {
        this.latinName = latinName;
        this.commonName = commonName;
        this.dosage = dosage;
        this.description = description;
        this.energetics = energetics;
        this.bodySystemsAffected = bodySystemsAffected;
    }

    public Long getHerbID() {
        return herbID;
    }

    public void setHerbID(Long herbID) {
        this.herbID = herbID;
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

    public String getDosage() {
        return dosage;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
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

    public String getBodySystemsAffected() {
        return bodySystemsAffected;
    }

    public void setBodySystemsAffected(String bodySystemsAffected) {
        this.bodySystemsAffected = bodySystemsAffected;
    }

}
