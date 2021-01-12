package com.example.Models;

import javax.persistence.*;


@Entity
@Table
public class Energetics {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long energeticsId;
    private String temperature;
    private String moisture;

    public Energetics() {
    }

    public Energetics(String temperature, String moisture) {
        this.temperature = temperature;
        this.moisture = moisture;
    }

    public Long getEnergeticsId() {
        return energeticsId;
    }

    public void setEnergeticsId(Long energeticsId) {
        this.energeticsId = energeticsId;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getMoisture() {
        return moisture;
    }

    public void setMoisture(String moisture) {
        this.moisture = moisture;
    }
}
