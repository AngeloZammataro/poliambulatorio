package it.medicina.poliambulatorio.model;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "medici")
public class Medico extends Employee{

    @Column(name = "medicalSpecialization")
    private String medicalSpecialization;

}
