package it.medicina.poliambulatorio.repository;

import it.medicina.poliambulatorio.model.Appuntamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppuntamentoRepository extends JpaRepository<Appuntamento, Long> {

}
