package it.medicina.poliambulatorio.repository;

import it.medicina.poliambulatorio.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//Interfaccia che estende JpaRepository dove Persona è il tipo di oggetti che verranno trattati, e Long è la Id
@Repository //specializzazione di component
public interface PersonaRepository extends JpaRepository<Persona, Long> {
}
