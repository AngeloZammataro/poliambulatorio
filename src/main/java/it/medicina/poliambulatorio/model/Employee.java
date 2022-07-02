package it.medicina.poliambulatorio.model;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
public class Employee extends Persona{

    @Column(name = "role")
    private String role;

    @Column(name = "badgeNumber")
    private String badgeNumber;

    @Column(name = "login")
    private String login;

    @Column(name = "password")
    private String password;
}
