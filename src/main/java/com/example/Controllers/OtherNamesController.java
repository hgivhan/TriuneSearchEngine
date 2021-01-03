package com.example.Controllers;

import com.example.Services.OtherNamesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OtherNamesController {

    @Autowired
    OtherNamesService otherNamesService;
}
