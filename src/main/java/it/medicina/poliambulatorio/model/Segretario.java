package it.medicina.poliambulatorio.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "segretari")
public class Segretario extends Persona {
/*
    public Segretario(long id, String nome, String cognome, String indirizzo, String recapitoMobile, String mail) {
        super(id, nome, cognome, indirizzo, recapitoMobile, mail);
    }

    private List<Appuntamento> listaAppuntamenti = new ArrayList<>();
    private List<Paziente> listaPazienti = new ArrayList<>();

    public void fissaAppuntamento(Appuntamento appuntamento) {
        listaAppuntamenti.add(appuntamento);
        System.out.println("Prenotazione effettuata");
    }

    public void disdiciAppuntamentoPerData(String appuntamento) {
        for (int i = 0; i < listaAppuntamenti.size(); i++) {
            if (appuntamento.equals(listaAppuntamenti.get(i).getDataAppuntamento())) {
                listaAppuntamenti.remove(listaAppuntamenti.get(i));
                System.out.println("Prenotazione rimossa");
            }
        }
    }

    public void stampaAppuntamento(Appuntamento appuntamento) {
        System.out.println("Appuntamento");
        System.out.println("Data " + appuntamento.getDataAppuntamento() +
                " - Ora: " + appuntamento.getOrario() +
                " - Medico: " + appuntamento.getMedico().getCognome() +
                " - Paziente: " + appuntamento.getPaziente().getCognome());
    }

    public void modificaAppuntamento(Paziente paziente) {
        for (int i = 0; i < listaAppuntamenti.size(); i++) {
            if (listaAppuntamenti.get(i).getPaziente().equals(paziente)){
                listaAppuntamenti.set(i,new Appuntamento(LocalDate.of(2022,7,2), LocalTime.of(17,0), listaAppuntamenti.get(i).getMedico(), paziente));
                System.out.printf("------ L'appuntamento %d è stato modificato -----%n",i);
            }
        }
    }
    public void modificaAppuntamento(Medico medico, Paziente paziente) {
        for (int i = 0; i < listaAppuntamenti.size(); i++) {
            if (listaAppuntamenti.get(i).getPaziente().equals(paziente) && (listaAppuntamenti.get(i).getMedico().equals(medico))){
                listaAppuntamenti.set(i,new Appuntamento(LocalDate.of(2022,7,3),LocalTime.of(18,0), medico, paziente));
                System.out.printf("------ L'appuntamento %d è stato modificato -----%n",i);
            }
        }
    }

    public void listaAppuntamenti() {
        System.out.println("Lista appuntamenti");
        for (Appuntamento appuntamento : listaAppuntamenti) {
            System.out.println("Data " + appuntamento.getDataAppuntamento() +
                               " - Ora: " + appuntamento.getOrario() +
                               " - Medico: " + appuntamento.getMedico().getCognome() +
                               " - Paziente: " + appuntamento.getPaziente().getCognome());
        }
    }

    public void registraAnagraficaPaziente(){
        int count = 0;
        listaPazienti.add((new Paziente(count, "Franco", "Franchi",
                        "Via dei Tigli, 101", "3256699887",
                        "francofranchi@gmail.com", "Dolore all'anca")));
    }
    public void registraAnagraficaPaziente(String nome, String cognome, String indirizzo, String recapitoTelefonico, String email, String patologia){
        int count = 0;
        listaPazienti.add((new Paziente(count, nome, cognome,
                indirizzo, recapitoTelefonico,
                email, patologia)));
    }

    public void modificaAnagraficaPaziente(){

    }

    public void listaPazienti() {
        System.out.println("Lista pazienti");
        for (Paziente paziente : listaPazienti) {
            System.out.println("Nome: " + paziente.getNome() +
                    " - Cognome: " + paziente.getCognome() +
                    " - Indirizzo: " + paziente.getIndirizzo() +
                    " - Cellulare: " + paziente.getRecapitoMobile() +
                    " - @mail: " + paziente.getMail() +
                    " - Patologia: " + paziente.getPatologia());
        }
    }

    public List<Appuntamento> getListaAppuntamenti() {
        return listaAppuntamenti;
    }

    public void setListaAppuntamenti(List<Appuntamento> listaAppuntamenti) {
        this.listaAppuntamenti = listaAppuntamenti;
    }

    public List<Paziente> getListaPazienti() {
        return listaPazienti;
    }

    public void setListaPazienti(List<Paziente> listaPazienti) {
        this.listaPazienti = listaPazienti;
    }
    */

    @Column(name = "role")
    private String role;

    @Column(name = "badgeNumber")
    private String badgeNumber;

    @Column(name = "login")
    private String login;

    @Column(name = "password")
    private String password;

}
