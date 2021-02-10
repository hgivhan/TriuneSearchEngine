package com.example.Models;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@Embeddable
public class OtherNames {

    String otherName;

    public OtherNames(){}

}
