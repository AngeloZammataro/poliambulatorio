package it.medicina.poliambulatorio.repository;

import it.medicina.poliambulatorio.model.Medico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository //specializzazione di component
public interface MedicoRepository extends JpaRepository<Medico, Long> {
}
