package com.example.spring6webapp3.services;

import com.example.spring6webapp3.model.Beer;
import com.example.spring6webapp3.model.BeerStyle;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Slf4j
@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public Beer getBeerById(UUID id) {

        log.debug("Get beer ID in service id: " + id.toString());

        return Beer.builder()
                .id(id)
                .version(1)
                .beerName("Galaxy Cat")
                .beerstyle(BeerStyle.PALE_ALE)
                .upc("12345")
                .price(new BigDecimal("12.99"))
                .quantityOnHand(122)
                .createdDate(LocalDateTime.now())
                .updatedDate(LocalDateTime.now())
                .build();
    }
}
