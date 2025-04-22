package edu.bekthedev.restmvcspring.service;

import edu.bekthedev.restmvcspring.model.Beer;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public interface BeerService {

    Beer getBeerById(UUID id);
}