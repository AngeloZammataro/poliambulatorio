
package it.medicina.poliambulatorio.model;

import lombok.*;
import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "cartelle_mediche")
public class CartellaMedica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "medico", referencedColumnName = "id")
    private Medico medico;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "paziente", referencedColumnName = "id")
    private Paziente paziente;

    @Column(name = "data")
    private Date data;

    @Column(name = "referto")
    private String referto;

    @Column(name = "terapia")
    private String terapia;


}
