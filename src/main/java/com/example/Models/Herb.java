package com.example.Models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class Herb {

    @Id
    @GeneratedValue (strategy= GenerationType.IDENTITY)

    private Long herbId;
    private String latinName;
    private String commonName;

    @ManyToMany (targetEntity = OtherNames.class)
    @JoinColumn (name = "OtherNames") //name- name of this column in the joined table, refcolumnname is the foreign key from the other table
    private List<OtherNames> otherNames; // ^^ must match fk name in othernames table

    @OneToMany (targetEntity = Dosage.class)
    @JoinColumn (name = "Dosage")
    private List<Dosage> dosage;

    //referencedColumnName = "dosageId" <= don't need this in source class

    @OneToMany (targetEntity = Energetics.class)
    @JoinColumn (name = "Energetics")
    private List<Energetics> energetics;

    @OneToMany (targetEntity = Effects.class)
    @JoinColumn (name = "Effects")
    private List<Effects> effects;

    public Herb(){}

    public Herb(String latinName, String commonName, List<OtherNames> otherNames, List<Dosage> dosage, List<Energetics> energetics, List<Effects> effects) {
        this.latinName = latinName;
        this.commonName = commonName;
        this.otherNames = otherNames;
        this.dosage = dosage;
        this.energetics = energetics;
        this.effects = effects;
    }

    public Long getHerbId() {
        return herbId;
    }

    public void setHerbId(Long herbId) {
        this.herbId = herbId;
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

    public List<OtherNames> getOtherNames() {
        return otherNames;
    }

    public void setOtherNames(List<OtherNames> otherNames) {
        this.otherNames = otherNames;
    }

    public List<Dosage> getDosage() {
        return dosage;
    }

    public void setDosage(List<Dosage> dosage) { this.dosage = dosage; }

    public List<Energetics> getEnergetics() {
        return energetics;
    }

    public void setEnergetics(List<Energetics> energetics) {
        this.energetics = energetics;
    }

    public List<Effects> getEffects() { return effects; }

    public void setEffects(List<Effects> effects) {
        this.effects = effects;
    }
}
