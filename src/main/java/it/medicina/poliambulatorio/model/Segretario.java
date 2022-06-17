package it.medicina.poliambulatorio.model;

import java.util.ArrayList;
import java.util.List;

public class Segretario extends Persona{

    public Segretario(long id, String nome, String cognome, String indirizzo, String recapitoMobile, String mail) {
        super(id, nome, cognome, indirizzo, recapitoMobile, mail);
    }

    private List<Appuntamento> appuntamenti = new ArrayList<>();

    public void fissaAppuntamento(Appuntamento appuntamento){
        appuntamenti.add(appuntamento);
    }

    public void disdiciAppuntamentoPerData(String appuntamento) {
        for (int i = 0; i < appuntamenti.size(); i++) {
            if (appuntamento.equals(appuntamenti.get(i).getDataAppuntamento())) {
                appuntamenti.remove(appuntamenti.get(i));
                System.out.println("Prenotazione rimossa");
            }
        }
    }

    public void listaAppuntamenti(){
        for (Appuntamento appuntamento:appuntamenti) {
            System.out.println(appuntamento);
        }
    }

    public List<Appuntamento> getAppuntamenti() {
        return appuntamenti;
    }

    public void setAppuntamenti(List<Appuntamento> appuntamenti) {
        this.appuntamenti = appuntamenti;
    }
}
