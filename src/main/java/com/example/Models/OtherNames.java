package com.example.Models;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@Embeddable
public class OtherNames {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long otherNameId;
    String otherName;

//    @ManyToOne
//    private Herb herb;

//    public OtherNames(Long otherNameId, String otherName, Herb herb) {
//        this.otherNameId = otherNameId;
//        this.otherName = otherName;
////        this.herb = herb;
//}


    public OtherNames() {
    }

}
//    public Long getOtherNameId() {
//        return otherNameId;
//    }
//
//    public void setOtherNameId(Long otherNameId) {
//        this.otherNameId = otherNameId;
//    }
//
//    public String getOtherName() {
//        return otherName;
//    }
//
//    public void setOtherName(String otherName) {
//        this.otherName = otherName;
//    }

//    public Herb getHerb() {
//        return herb;
//    }
//
//    public void setHerb(Herb herb) {
//        this.herb = herb;
//    }

