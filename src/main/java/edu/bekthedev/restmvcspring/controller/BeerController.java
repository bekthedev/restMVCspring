package edu.bekthedev.restmvcspring.controller;

import edu.bekthedev.restmvcspring.model.Beer;
import edu.bekthedev.restmvcspring.service.BeerService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;

import java.util.UUID;

@Slf4j
@RequiredArgsConstructor
@Controller
public class BeerController {

    public final BeerService beerService;

    public Beer getBeerById(UUID id) {

        log.debug("Getting beer by id in controller was called");

        return beerService.getBeerById(id);
    }
}