package it.medicina.poliambulatorio.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
@Data
@Entity
@Table(name="appuntamenti")
public class Appuntamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "dataAppuntamento")
    private LocalDateTime dataAppuntamento;
/*
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "medico", referencedColumnName = "idPersona")
    private Medico medico;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "paziente", referencedColumnName = "idPersona")
    private Paziente paziente;
*/

}
