package com.example.Controllers;

import com.example.Repositories.EffectsRepository;
import com.example.Services.EffectsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EffectsController {

    @Autowired
    EffectsService effectsService;
}
