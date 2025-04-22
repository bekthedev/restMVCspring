package edu.bekthedev.restmvcspring.controller;

import edu.bekthedev.restmvcspring.service.BeerService;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

@RequiredArgsConstructor
@Controller
public class BeerController {

    public final BeerService beerService;
}