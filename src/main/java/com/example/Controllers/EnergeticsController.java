package com.example.Controllers;

import com.example.Services.EnergeticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EnergeticsController {

    @Autowired
    EnergeticsService energeticsService;
}
