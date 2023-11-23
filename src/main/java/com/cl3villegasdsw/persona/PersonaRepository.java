package com.cl3villegasdsw.persona;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PersonaRepository extends 
JpaRepository<Persona, Long> {

    Optional<Persona> findPersonaByDni(String dni);
}
