package com.example.Services;

import com.example.Repositories.EffectsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EffectsService {

    @Autowired
    EffectsRepository effectsRepository;
}
