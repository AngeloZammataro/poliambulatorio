package it.medicina.poliambulatorio.model;

import java.time.LocalDate;
import java.time.LocalTime;

public class CartellaMedica {
    private Paziente paziente;
    private LocalDate dataCartella;
    private String referto;
    private String terapia;

    public CartellaMedica(Paziente paziente, LocalDate dataCartella, String referto, String terapia) {
        this.paziente = paziente;
        this.dataCartella = dataCartella;
        this.referto = referto;
        this.terapia = terapia;
    }

    public Paziente getPaziente() {
        return paziente;
    }

    public void setPaziente(Paziente paziente) {
        this.paziente = paziente;
    }

    public LocalDate getDataCartella() {
        return dataCartella;
    }

    public void setDataCartella(LocalDate dataCartella) {
        this.dataCartella = dataCartella;
    }

    public String getReferto() {
        return referto;
    }

    public void setReferto(String referto) {
        this.referto = referto;
    }

    public String getTerapia() {
        return terapia;
    }

    public void setTerapia(String terapia) {
        this.terapia = terapia;
    }
}
