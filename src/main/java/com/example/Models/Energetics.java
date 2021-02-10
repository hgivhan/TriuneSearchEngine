package com.example.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import javax.persistence.*;


@Data
@AllArgsConstructor
@Embeddable
public class Energetics {

    private String temperature;
    private String moisture;

    public Energetics() {
    }
}
