package com.example.demo.entities;

import java.time.Instant;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Temperatuur {
    private @Id
    @GeneratedValue
    Long Id;
    final private Instant meetTijdStip;
    final private Double temperatuur;

    Temperatuur(Instant meetTijdStip, Double temperatuur) {
        this.meetTijdStip = meetTijdStip;
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
        if (!(o instanceof Temperatuur)) {
            return false;
        }
        Temperatuur temp = (Temperatuur) o;
        return Objects.equals(this.getId(), temp.Id) && Objects.equals(this.getTemperatuur(), temp.getTemperatuur())
                && Objects.equals(this.getMeetTijdStip(), temp.getMeetTijdStip());
    }

    public Instant getMeetTijdStip() {
        return meetTijdStip;
    }

    public Double getTemperatuur() {
        return temperatuur;
    }
}
