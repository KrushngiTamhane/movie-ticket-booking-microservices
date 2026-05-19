package com.movieticket.theater.controller;

import com.movieticket.entity.Theater;
import com.movieticket.repository.TheaterRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/theaters")
@CrossOrigin(origins = "http://localhost:4200")
public class TheaterController {

    private final TheaterRepository theaterRepository;

    public TheaterController(TheaterRepository theaterRepository) {
        this.theaterRepository = theaterRepository;
    }

    @GetMapping
    public List<Theater> getTheaters() {
        return theaterRepository.findAll();
    }

    @PostMapping
    public Theater addTheater(@RequestBody Theater theater) {
        return theaterRepository.save(theater);
    }
}