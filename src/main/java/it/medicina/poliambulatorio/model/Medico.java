package it.medicina.poliambulatorio.model;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "medici")
public class Medico extends Persona{


    @Column(name = "role")
    private String role;

    @Column(name = "medicalSpecialization")
    private String medicalSpecialization;

    @Column(name = "badgeNumber")
    private String badgeNumber;

    @Column(name = "login")
    private String login;

    @Column(name = "password")
    private String password;
}
