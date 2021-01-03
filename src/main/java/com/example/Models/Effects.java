package com.example.Models;

import javax.persistence.*;

@Entity
@Table
public class Effects {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long effectsId;
    private String effects;

    public Effects(){}

    public Effects(String effects) {
        this.effects = effects;

    }

    public Long getEffectsId() {
        return effectsId;
    }

    public void setEffectsId(Long effectsId) {
        this.effectsId = effectsId;
    }

    public String getEffects() {
        return effects;
    }

    public void setEffects(String effects) {
        this.effects = effects;
    }
}
