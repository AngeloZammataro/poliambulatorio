package it.medicina.poliambulatorio.model;

import lombok.*;

import javax.persistence.*;

@Data
@Entity
@Table(name = "pazienti")
public class Paziente extends Persona{
/*
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idPaziente")
    private long id;
*/
    @Column(name = "medicalPathology")
    private String medicalPathology;

/*
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idCartella", referencedColumnName = "idCartella")
    private CartellaMedica cartellaMedica;
*/
    @OneToOne(mappedBy = "paziente")
    private CartellaMedica cartellaMedica;

}
