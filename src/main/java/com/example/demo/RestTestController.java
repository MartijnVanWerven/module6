package com.example.demo;

import com.example.demo.entities.Temperatuur;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@org.springframework.web.bind.annotation.RestController
public class RestTestController {

    RestTestController(TemperatuurRepository repository) {
        this.repository = repository;

    }

    @GetMapping("/test")
    String all() {
        return "YAY!!";
    }


    @PutMapping("/temperatuur/{id}")
    Temperatuur replaceEmployee(@RequestBody Temperatuur newTemperatuur, @PathVariable Long id) {

        return repository.findById(id)
                .map(temperatuur -> {
                    temperatuur.setTemperatuur(newTemperatuur.getName());
                    return repository.save(temperatuur);
                })
                .orElseGet(() -> {
                    newTemperatuur.setId(id);
                    return repository.save(newTemperatuur);
                });
    }
}
