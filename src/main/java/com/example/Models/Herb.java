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

    @OneToOne (targetEntity = OtherNames.class)
    @JoinColumn (name = "otherName", referencedColumnName = "otherNameId" ) //name- name of this column in the joined table, refcolumnname is the foreign key from the other table
    private OtherNames otherNames; // ^^ must match fk name in othernames table

    @OneToOne (targetEntity = Dosage.class)
    @JoinColumn (name = "dosage", referencedColumnName = "dosageId")
    private Dosage dosage;

    //referencedColumnName = "dosageId" <= don't need this in source class

    @OneToOne (targetEntity = Energetics.class)
    @JoinColumn (name = "energetics", referencedColumnName = "energeticsId")
    private Energetics energetics;

    @OneToOne (targetEntity = Effects.class)
    @JoinColumn (name = "effects", referencedColumnName = "effectsId")
    private Effects effects;

    public Herb(){}

    public Herb(String latinName, String commonName, Dosage dosage, OtherNames otherNames, Energetics energetics, Effects effects) {
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

    public OtherNames getOtherNames() {
        return otherNames;
    }

    public void setOtherNames(OtherNames otherNames) {
        this.otherNames = otherNames;
    }

    public Dosage getDosage() {
        return dosage;
    }

    public void setDosage(Dosage dosage) { this.dosage = dosage; }

    public Energetics getEnergetics() {
        return energetics;
    }

    public void setEnergetics(Energetics energetics) {
        this.energetics = energetics;
    }

    public Effects getEffects() { return effects; }

    public void setEffects(Effects effects) {
        this.effects = effects;
    }
}
