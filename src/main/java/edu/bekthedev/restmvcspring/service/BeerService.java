package edu.bekthedev.restmvcspring.service;

import edu.bekthedev.restmvcspring.model.Beer;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;


public interface BeerService {

    List<Beer> listBeers();

    Beer getBeerById(UUID id);
}