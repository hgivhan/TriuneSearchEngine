package com.example.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import javax.persistence.*;

@Data
@AllArgsConstructor
@Embeddable
public class Dosage {

    private String dosage;

    public Dosage() {}

}
