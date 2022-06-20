package it.medicina.poliambulatorio.repository;

import it.medicina.poliambulatorio.model.Paziente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository //specializzazione di component
public interface PazienteRepository extends JpaRepository<Paziente, Long> {
}
