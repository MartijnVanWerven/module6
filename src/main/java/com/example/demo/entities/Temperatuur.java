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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Temperatuur temp)) {
            return false;
        }
        return Objects.equals(this.getId(), temp.Id) && Objects.equals(this.getTemperatuurWaarde(), temp.getTemperatuurWaarde())
                && Objects.equals(this.getMeetTijdStip(), temp.getMeetTijdStip());
    }
}
