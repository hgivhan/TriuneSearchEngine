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
    private String description;
    private List<OtherNames> otherNamesId;
    private List<Dosage> dosageId;
    private List<Energetics> energeticsId;
    private List<Effects> effectsId;

    public Herb(){}

    public Herb(String latinName, String commonName, String description, List<OtherNames> otherNamesId, List<Dosage> dosageId, List<Energetics> energeticsId, List<Effects> effectsId) {
        this.latinName = latinName;
        this.commonName = commonName;
        this.description = description;
        this.otherNamesId = otherNamesId;
        this.dosageId = dosageId;
        this.energeticsId = energeticsId;
        this.effectsId = effectsId;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<OtherNames> getOtherNamesId() {
        return otherNamesId;
    }

    public void setOtherNamesId(List<OtherNames> otherNames) {
        this.otherNamesId = otherNames;
    }

    public List<Dosage> getDosageId() {
        return dosageId;
    }

    public void setDosageId(List<Dosage> dosage) { this.dosageId = dosage; }

    public List<Energetics> getEnergeticsId() {
        return energeticsId;
    }

    public void setEnergeticsId(List<Energetics> energetics) {
        this.energeticsId = energetics;
    }

    public List<Effects> getEffectsId() { return effectsId; }

    public void setEffectsId(List<Effects> effects) {
        this.effectsId = effects;
    }
}
