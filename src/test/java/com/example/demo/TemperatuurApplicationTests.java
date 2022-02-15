package com.example.demo;

import com.example.demo.controllers.RestTemperatuurController;
import com.example.demo.entities.Temperatuur;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.within;
import static org.junit.jupiter.api.Assertions.assertAll;

@SpringBootTest
class TemperatuurApplicationTests {

    @Autowired
    RestTemperatuurController restTemperatuurController;

    @Test
    void registreerTemperatuur() {
        Temperatuur temperatuur = restTemperatuurController.addTemperatuur(10.1);
        assertAll(
                () -> assertThat(temperatuur.getId()).isEqualTo(1),
                () -> assertThat(temperatuur.getTemperatuurWaarde()).isEqualTo(10.1),
                () -> assertThat(temperatuur.getMeetTijdStip()).isCloseTo(Instant.now(), within(100, ChronoUnit.MILLIS))
        );
    }

}
