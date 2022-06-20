package it.medicina.poliambulatorio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="persona")
public class Persona {

    @Id
    @GeneratedValue
    private Long id;
    private String nome;
    private String cognome;
    private String indirizzo;
    private String recapitoMobile;
    private String mail;

    public Persona() {
    }

    public Persona(Long id, String nome, String cognome, String indirizzo, String recapitoMobile, String mail) {
        this.id = id;
        this.nome = nome;
        this.cognome = cognome;
        this.indirizzo = indirizzo;
        this.recapitoMobile = recapitoMobile;
        this.mail = mail;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public String getRecapitoMobile() {
        return recapitoMobile;
    }

    public void setRecapitoMobile(String recapitoMobile) {
        this.recapitoMobile = recapitoMobile;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

}
