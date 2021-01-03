package com.example.Services;

import com.example.Repositories.OtherNamesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OtherNamesService {

    @Autowired
    OtherNamesRepository otherNamesRepository;
}
