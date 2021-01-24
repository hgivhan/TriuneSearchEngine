package com.example.Models;

import javax.persistence.*;

@Entity
@Table
public class Dosage {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long dosageId;
    private String dosage;

    @OneToOne (mappedBy = "dosage")
    private Herb herb;

    public Dosage(){}

    public Dosage(String dosage, Herb herb) {
        this.dosage = dosage;
        this.herb = herb;
    }

    public Long getDosageId() {
        return dosageId;
    }

    public void setDosageId(Long dosageId) {
        this.dosageId = dosageId;
    }

    public String getDosage() {
        return dosage;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
    }

    public Herb getHerb() {
        return herb;
    }

    public void setHerb(Herb herb) {
        this.herb = herb;
    }
}
