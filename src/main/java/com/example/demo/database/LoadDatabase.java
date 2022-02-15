package com.example.demo.database;

import com.example.demo.entities.Temperatuur;
import com.example.demo.entities.TemperatuurRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.Instant;

@Configuration
class LoadDatabase {

    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(TemperatuurRepository repository) {

        return args -> {
            log.info("Preloading " + repository.save(new Temperatuur(46d)));
            log.info("Preloading " + repository.save(new Temperatuur(6d)));
        };
    }
}