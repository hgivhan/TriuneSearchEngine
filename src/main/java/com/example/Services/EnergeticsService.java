package com.example.Services;

import com.example.Repositories.EnergeticsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnergeticsService {

    @Autowired
    EnergeticsRepository energeticsRepository;
}
