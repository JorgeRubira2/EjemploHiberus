package com.example.ejemplohiberus.repositories;

import com.example.ejemplohiberus.entities.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface PersonaRepository extends JpaRepository<Persona, Integer>{
}
