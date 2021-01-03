package com.example.Models;

import javax.persistence.*;


@Entity
@Table
public class Energetics {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long energeticsId;
    private String energetics;

    public Energetics(){}

    public Energetics(String energetics) {
        this.energetics = energetics;
    }

    public Long getEnergeticsId() {
        return energeticsId;
    }

    public void setEnergeticsId(Long energeticsId) {
        this.energeticsId = energeticsId;
    }

    public String getEnergetics() {
        return energetics;
    }

    public void setEnergetics(String energetics) {
        this.energetics = energetics;
    }
}
