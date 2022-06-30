
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
    @Column(name = "idCartella")
    private long id;
/*
    @OneToOne(mappedBy = "cartellaMedica")
    private Paziente paziente;
*/
    @Column(name = "dataCartella")
    private Date dataCartella;

    @Column(name = "referto")
    private String referto;

    @Column(name = "terapia")
    private String terapia;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "lastName", referencedColumnName = "lastName")
    private Paziente paziente;


}
