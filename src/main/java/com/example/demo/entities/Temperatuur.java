package com.example.demo.entities;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.Instant;
import java.util.Objects;

@Entity
@EqualsAndHashCode
public class Temperatuur {
    @Id
    @GeneratedValue
    @Getter
    private Long Id;
    @Setter @Getter
    private Instant meetTijdStip;
    @Setter @Getter
    private Double temperatuurWaarde;

    public Temperatuur() {
    }

    public Temperatuur(Double temperatuur) {
        this.meetTijdStip = Instant.now();
        this.temperatuurWaarde = temperatuur;
    }
}
