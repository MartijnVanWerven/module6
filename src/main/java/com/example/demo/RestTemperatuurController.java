package com.example.demo;

import com.example.demo.entities.Temperatuur;
import com.example.demo.entities.TemperatuurRepository;
import org.springframework.web.bind.annotation.*;

import java.time.Instant;
import java.util.List;

@org.springframework.web.bind.annotation.RestController
public class RestTemperatuurController {

    private final TemperatuurRepository repository;

    RestTemperatuurController(TemperatuurRepository repository) {
        this.repository = repository;

    }

    @GetMapping("/temperatuur")
    List<Temperatuur> all() {
        return repository.findAll();
    }

    @PostMapping("/temperatuur")
    Temperatuur replaceTemperatuur(@RequestBody Double gemetenTemperatuur) {
        repository.save(new Temperatuur(gemetenTemperatuur));
        return null;
    }
}
