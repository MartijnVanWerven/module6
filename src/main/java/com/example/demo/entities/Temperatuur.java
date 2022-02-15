package com.example.demo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.Instant;
import java.util.Objects;

@Entity
public class Temperatuur {
    @Id
    @GeneratedValue
    private Long Id;
    private Instant meetTijdStip;
    private Double temperatuur;

    public Temperatuur() {
    }

    public Temperatuur(Double temperatuur) {
        this.meetTijdStip = Instant.now();
        this.temperatuur = temperatuur;
    }

    public Long getId() {
        return Id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Temperatuur temp)) {
            return false;
        }
        return Objects.equals(this.getId(), temp.Id) && Objects.equals(this.getTemperatuur(), temp.getTemperatuur())
                && Objects.equals(this.getMeetTijdStip(), temp.getMeetTijdStip());
    }

    public Instant getMeetTijdStip() {
        return meetTijdStip;
    }

    public Double getTemperatuur() {
        return temperatuur;
    }

    public void setTemperatuur(Double temperatuur) {
        this.temperatuur = temperatuur;
    }
}
