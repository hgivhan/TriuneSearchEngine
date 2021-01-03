package com.example.Models;

import javax.persistence.*;

@Entity
@Table
public class OtherNames {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)

    private Long otherNameId;
    String otherName;

    public OtherNames(){}

    public OtherNames(String otherName) {
        this.otherName = otherName;
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
}
