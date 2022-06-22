package it.medicina.poliambulatorio.model;

import lombok.*;

import javax.persistence.*;

@Data
@Entity
@Table(name = "pazienti")
public class Paziente extends Persona{

    @Column(name = "medical_pathology")
    private String medical_pathology;

    @Column(name = "medical_record_number")
    private long medical_record_number;
}
