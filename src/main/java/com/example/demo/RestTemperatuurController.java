package com.example.demo;

import com.example.demo.entities.Temperatuur;
import com.example.demo.entities.TemperatuurRepository;
import org.springframework.web.bind.annotation.*;

import java.time.Instant;

@org.springframework.web.bind.annotation.RestController
public class RestTemperatuurController {

    private final TemperatuurRepository repository;

    RestTemperatuurController(TemperatuurRepository repository) {
        this.repository = repository;

    }

    @GetMapping("/temperatuur")
    String all() {
        return "YAY!!";
    }


    @PostMapping("/temperatuur")
    Temperatuur replaceTemperatuur(@RequestBody Double gemetenTemperatuur) {

        Temperatuur temperatuur = new Temperatuur(gemetenTemperatuur);

        repository.save(temperatuur);
        System.out.println(temperatuur.getTemperatuur());
        return null;
    }
}
