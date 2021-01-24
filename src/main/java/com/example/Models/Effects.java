package com.example.Models;

import javax.persistence.*;

@Entity
@Table
public class Effects {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long effectsId;
    private String bodySystem;
    private String actions;

    @OneToOne (mappedBy = "effects")
    private Herb herb;

    public Effects() {
    }

    public Effects(String bodySystem, String actions, Herb herb) {
        this.bodySystem = bodySystem;
        this.actions = actions;
        this.herb = herb;
    }

    public Long getEffectsId() {
        return effectsId;
    }

    public void setEffectsId(Long effectsId) {
        this.effectsId = effectsId;
    }

    public String getBodySystem() {
        return bodySystem;
    }

    public void setBodySystem(String bodySystem) {
        this.bodySystem = bodySystem;
    }

    public String getActions() {
        return actions;
    }

    public void setActions(String actions) {
        this.actions = actions;
    }

    public Herb getHerb() {
        return herb;
    }

    public void setHerb(Herb herb) {
        this.herb = herb;
    }
}
