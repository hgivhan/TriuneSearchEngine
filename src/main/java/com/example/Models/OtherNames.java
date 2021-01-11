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

    @ManyToMany (targetEntity = Herb.class)
    @JoinColumn (name = "Herb", referencedColumnName = "herbId") //name- name of this column in the joined table, refcolumnname is the foreign key from the other table
    private List<Herb> herb;

    public OtherNames(Long otherNameId, String otherName, List<Herb> herb) {
        this.otherNameId = otherNameId;
        this.otherName = otherName;
        this.herb = herb;
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

    public List<Herb> getHerb() {
        return herb;
    }

    public void setHerb(List<Herb> herb) {
        this.herb = herb;
    }
}
