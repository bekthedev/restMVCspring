package edu.bekthedev.restmvcspring.controller;

import edu.bekthedev.restmvcspring.model.Beer;
import edu.bekthedev.restmvcspring.service.BeerService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/beer")
public class BeerController {

    private final BeerService beerService;

    @PostMapping
    public ResponseEntity<Void> handlePost(@RequestBody Beer beer){

        Beer savedBeer = beerService.saveNewBeer(beer);

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .header("Location", "/api/v1/beer/" + savedBeer.getId())
                .build();
    }



    @RequestMapping(method = RequestMethod.GET)
    public List<Beer> listBeer(){

        return beerService.listBeers();
    }

    @RequestMapping(value = "{beerId}", method = RequestMethod.GET)
    public Beer getBeerById(@PathVariable("beerId") UUID beerId) {

        log.debug("Get Beer by Id - in controller");

        return beerService.getBeerById(beerId);
    }
}