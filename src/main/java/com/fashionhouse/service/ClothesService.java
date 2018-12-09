package com.fashionhouse.service;

import com.fashionhouse.repository.ClothesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClothesService {

    @Autowired
    private ClothesRepository clothesRepository;

    public x(){
    return clothesRepository.findAll();
    }

}
