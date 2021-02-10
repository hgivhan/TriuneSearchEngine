package com.example.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import javax.persistence.*;

@Data
@AllArgsConstructor
@Embeddable
public class Effects {

    private String bodySystem;
    private String actions;

    public Effects() {
    }
}
