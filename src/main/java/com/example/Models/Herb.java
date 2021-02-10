package com.example.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import javax.persistence.*;

@Data
@AllArgsConstructor
@Entity
public class Herb {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long herbId;
    private String latinName;
    private String commonName;

    @Embedded
    private OtherNames otherName;
    @Embedded
    private Dosage dosage;
    @Embedded
    private Energetics energetics;
    @Embedded
    private Effects effects;

    public Herb() {}
}
