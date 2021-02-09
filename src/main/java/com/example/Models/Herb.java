package com.example.Models;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@Entity
public class Herb {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long herbId;
    private String latinName;
    private String commonName;

    //    @OneToMany (targetEntity = OtherNames.class)
//    @JoinColumn (name = "otherNameId", referencedColumnName = "otherNameId" ) //name- name of this column in the joined table, refcolumnname is the foreign key from the other table
    @Embedded
    private OtherNames otherName; // ^^ must match fk name in othernames table

    //    @OneToOne (targetEntity = Dosage.class)
//    @JoinColumn (name = "dosageId", referencedColumnName = "dosageId")
    @Embedded
    private Dosage dosage;

    //referencedColumnName = "dosageId" <= don't need this in source class

    //    @OneToOne (targetEntity = Energetics.class)
//    @JoinColumn (name = "energeticsId", referencedColumnName = "energeticsId")
    @Embedded
    private Energetics energetics;

    //    @OneToOne (targetEntity = Effects.class)
//    @JoinColumn (name = "effectsId", referencedColumnName = "effectsId")
    @Embedded
    private Effects effects;

    public Herb() {}
}

//    public Herb(String latinName, String commonName, Dosage dosage, OtherNames otherNames, Energetics energeticsId, Effects effects) {
//        this.latinName = latinName;
//        this.commonName = commonName;
//        this.otherName = otherNames;
//        this.dosage = dosage;
//        this.energetics = energeticsId;
//        this.effects = effects;
//    }
//
//    public Long getHerbId() {
//        return herbId;
//    }
//
//    public void setHerbId(Long herbId) {
//        this.herbId = herbId;
//    }
//
//    public String getLatinName() {
//        return latinName;
//    }
//
//    public void setLatinName(String latinName) {
//        this.latinName = latinName;
//    }
//
//    public String getCommonName() {
//        return commonName;
//    }
//
//    public void setCommonName(String commonName) {
//        this.commonName = commonName;
//    }
//
//    public OtherNames getOtherNames() {
//        return otherName;
//    }
//
//    public void setOtherNames(OtherNames otherNames) {
//        this.otherName = otherNames;
//    }
//
//    public Dosage getDosage() {
//        return dosage;
//    }
//
//    public void setDosage(Dosage dosage) { this.dosage = dosage; }
//
//    public Energetics getEnergetics() {
//        return energetics;
//    }
//
//    public void setEnergetics(Energetics energetics) {
//        this.energetics = energetics;
//    }
//
//    public Effects getEffects() { return effects; }
//
//    public void setEffects(Effects effects) {
//        this.effects = effects;
//    }
//}
