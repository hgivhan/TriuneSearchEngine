package com.example.Models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class OtherNames {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long otherNameId;
    String otherName;

    @OneToOne (mappedBy = "otherName")
    private Herb herb;

    public OtherNames(Long otherNameId, String otherName, Herb herb) {
        this.otherNameId = otherNameId;
        this.otherName = otherName;
        this.herb = herb;
    }

    public OtherNames() {
    }

    public Long getOtherNameId() {
        return otherNameId;
    }

    public void setOtherNameId(Long otherNameId) {
        this.otherNameId = otherNameId;
    }

    public String getOtherName() {
        return otherName;
    }

    public void setOtherName(String otherName) {
        this.otherName = otherName;
    }

    public Herb getHerb() {
        return herb;
    }

    public void setHerb(Herb herb) {
        this.herb = herb;
    }
}
