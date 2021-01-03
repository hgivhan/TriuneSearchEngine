package com.example.Controllers;

import com.example.Services.DosageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DosageController {

    @Autowired
    DosageService dosageService;

}
