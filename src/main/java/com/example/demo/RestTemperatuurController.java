package com.example.demo;

import com.example.demo.entities.Temperatuur;
import com.example.demo.entities.TemperatuurRepository;
import net.bytebuddy.dynamic.DynamicType;
import org.springframework.web.bind.annotation.*;

import java.time.Instant;
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
    public Optional<Temperatuur> getById(@RequestParam long id) {
        Optional<Temperatuur> optTemperatuur = repository.findById(id);
        if(optTemperatuur.isPresent()){
            return repository.findById(id);
        } else{
            return new Optional<Temperatuur>;
        }
    }

    @PostMapping("/temperatuur")
    public Temperatuur addTemperatuur(@RequestBody Double gemetenTemperatuur) {
        repository.save(new Temperatuur(gemetenTemperatuur));
        return null;
    }
}
