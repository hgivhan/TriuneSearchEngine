package com.example.Models;

import javax.persistence.*;

@Entity
@Table
public class Effects {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long effectsId;
    private String bodySystem;
    private String action;

    public Effects(){}

    public Effects(String bodySystem, String action) {
        this.bodySystem = bodySystem;
        this.action = action;
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

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }
}
