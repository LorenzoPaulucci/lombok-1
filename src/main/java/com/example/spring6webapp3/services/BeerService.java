package com.example.spring6webapp3.services;

import com.example.spring6webapp3.model.Beer;

import java.util.UUID;

public interface BeerService {
    Beer getBeerById(UUID id);
}
