package it.medicina.poliambulatorio.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Appuntamento {

    private LocalDate dataAppuntamento;
    private LocalTime orario;
    private Medico medico;
    private Paziente paziente;



    public Appuntamento(LocalDate dataAppuntamento, LocalTime orario, Medico medico, Paziente paziente) {
        this.dataAppuntamento = dataAppuntamento;
        this.orario = orario;
        this.medico = medico;
        this.paziente = paziente;
    }

    public LocalDate getDataAppuntamento() {
        return dataAppuntamento;
    }

    public void setDataAppuntamento(LocalDate dataAppuntamento) {
        this.dataAppuntamento = dataAppuntamento;
    }

    public LocalTime getOrario() {
        return orario;
    }

    public void setOrario(LocalTime orario) {
        this.orario = orario;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Paziente getPaziente() {
        return paziente;
    }

    public void setPaziente(Paziente paziente) {
        this.paziente = paziente;
    }
}
