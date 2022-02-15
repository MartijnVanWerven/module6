package com.example.demo;

import com.example.demo.entities.Temperatuur;
import com.example.demo.entities.TemperatuurRepository;
import org.springframework.web.bind.annotation.*;

import java.time.Instant;

@org.springframework.web.bind.annotation.RestController
public class RestTestController {

    private final TemperatuurRepository repository;

    RestTestController(TemperatuurRepository repository) {
        this.repository = repository;

    }

    @GetMapping("/test")
    String all() {
        return "YAY!!";
    }


    @PostMapping("/temperatuur")
    Temperatuur replaceTemperatuur(@RequestBody Double gemetenTemperatuur) {

        Temperatuur tmp = new Temperatuur(gemetenTemperatuur);

        System.out.println(tmp.getTemperatuur());
        return null;
//        return repository.findById(id)
//                .map(temperatuur -> {
//                    temperatuur.setTemperatuur(newTemperatuur.getTemperatuur());
//                    return repository.save(temperatuur);
//                })
//                .orElseGet(() -> {
//                    newTemperatuur.setId(id);
//                    return repository.save(newTemperatuur);
//                });
    }
}
