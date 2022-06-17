package it.medicina.poliambulatorio.model;

public class CartellaMedica {
    private Paziente paziente;
    private String dataCartella;
    private String referto;
    private String terapia;

    public CartellaMedica(Paziente paziente, String dataCartella, String referto, String terapia) {
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

    public String getDataCartella() {
        return dataCartella;
    }

    public void setDataCartella(String dataCartella) {
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
