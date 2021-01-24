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

    @OneToOne (mappedBy = "energetics")
    private Herb herb;

    public Energetics() {
    }

    public Energetics(String temperature, String moisture, Herb herb) {
        this.temperature = temperature;
        this.moisture = moisture;
        this.herb = herb;
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

    public Herb getHerb() {
        return herb;
    }

    public void setHerb(Herb herb) {
        this.herb = herb;
    }
}
