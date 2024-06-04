package com.example.spring6webapp3.controller;

import com.example.spring6webapp3.model.Beer;
import com.example.spring6webapp3.services.BeerService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;

import java.util.UUID;

@Slf4j
@AllArgsConstructor
@Controller
public class BeerController {
    private final BeerService beerService;

    public Beer getBeerById(UUID id) {

        log.debug("get beer by id - in controller");

        return beerService.getBeerById(id);
    }

}
