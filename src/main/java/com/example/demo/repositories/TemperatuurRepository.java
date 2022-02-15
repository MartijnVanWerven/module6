package com.example.demo.repositories;

import com.example.demo.entities.Temperatuur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TemperatuurRepository extends JpaRepository<Temperatuur,Long>{
}
