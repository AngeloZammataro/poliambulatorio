package it.medicina.poliambulatorio.model;

public class Appuntamento {

    private String dataAppuntamento;
    private String orario;
    private Medico medico;
    private Paziente paziente;



    public Appuntamento(String dataAppuntamento, String orario, Medico medico, Paziente paziente) {
        this.dataAppuntamento = dataAppuntamento;
        this.orario = orario;
        this.medico = medico;
        this.paziente = paziente;
    }

    public String getDataAppuntamento() {
        return dataAppuntamento;
    }

    public void setDataAppuntamento(String dataAppuntamento) {
        this.dataAppuntamento = dataAppuntamento;
    }

    public String getOrario() {
        return orario;
    }

    public void setOrario(String orario) {
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

    @Override
    public String toString() {
        return "Appuntamento{" +
                "dataAppuntamento='" + dataAppuntamento + '\'' +
                ", orario='" + orario + '\'' +
                ", medico=" + medico +
                ", paziente=" + paziente +
                '}';
    }
}
