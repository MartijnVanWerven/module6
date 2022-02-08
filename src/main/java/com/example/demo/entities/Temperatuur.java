package com.example.demo.entities;

import java.time.Instant;

public class Temperatuur {
    final Instant meetTijdStip;
    final Double temperatuur;


    Temperatuur(Instant tijdStip, Double gemetenTemperatuur){
        meetTijdStip = tijdStip;
        temperatuur = gemetenTemperatuur;
    }
}
