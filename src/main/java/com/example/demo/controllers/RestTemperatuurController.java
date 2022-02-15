package com.example.demo.controllers;

import com.example.demo.entities.Temperatuur;
import com.example.demo.repositories.TemperatuurRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@org.springframework.web.bind.annotation.RestController
public class RestTemperatuurController {

    private final TemperatuurRepository repository;

    RestTemperatuurController(TemperatuurRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/temperatuur")
    public List<Temperatuur> returnAllTemps() {
        return repository.findAll();
    }

    @GetMapping("/temperatuur/{id}")
    public Optional<Temperatuur> getTemperatuurById(@PathVariable long id) {
        Optional<Temperatuur> optTemperatuur = repository.findById(id);
        if (optTemperatuur.isPresent()) {
            return repository.findById(id);
        } else {
            return Optional.empty();
        }
    }

    @PostMapping("/temperatuur")
    public Temperatuur addTemperatuur(@RequestBody Double gemetenTemperatuur) {
        repository.save(new Temperatuur(gemetenTemperatuur));
        return null;
    }
}
