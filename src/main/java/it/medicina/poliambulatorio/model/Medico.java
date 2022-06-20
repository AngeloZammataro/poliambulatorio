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

    @Column(name = "medical_specialization")
    private String medical_specialization;

    @Column(name = "badgeNumber")
    private String badgeNumber;

    @Column(name = "login_id")
    private String login_id;

    @Column(name = "password")
    private String password;
}
