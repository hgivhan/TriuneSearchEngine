package com.example.Models;

import javax.persistence.*;

@Entity
@Table
public class Dosage {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)

    private Long dosageID;
    private String dosage;

    public Dosage(){}

    public Dosage(String dosage) {
        this.dosage = dosage;
    }

    public Long getDosageID() {
        return dosageID;
    }

    public void setDosageID(Long dosageID) {
        this.dosageID = dosageID;
    }

    public String getDosage() {
        return dosage;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
    }
}
