package com.fashionhouse.controller;

import com.fashionhouse.service.ClothesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class ClothesController {

    @Autowired
    private ClothesService clothesService;

    public  getx(){
        clothesService.
    }

}
