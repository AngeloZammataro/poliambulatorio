package it.medicina.poliambulatorio.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "persone")
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "address")
    private String address;

    @Column(name = "city")
    private String city;

    @Column(name = "phone")
    private String phone;

    @Column(name = "email_id")
    private String emailId;

    @Column(name = "role")
    private String role;

    @Column(name = "medical_specialization")
    private String medical_specialization;

    @Column(name = "badgeNumber")
    private String badgeNumber;

    @Column(name = "medical_pathology")
    private String medical_pathology;

    @Column(name = "login_id")
    private String login_id;

    @Column(name = "password")
    private String password;

    @Column(name = "is_male")
    private boolean is_male;

    @Column(name = "medical_record_number")
    private long medical_record_number;
}