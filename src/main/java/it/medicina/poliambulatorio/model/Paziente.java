package it.medicina.poliambulatorio.model;

public class Paziente extends Persona{

    private String patologia;
    private CartellaMedica cartellaMedica;


    public Paziente(long id, String nome, String cognome, String indirizzo, String recapitoMobile, String mail,
                    String patologia) {
        super(id, nome, cognome, indirizzo, recapitoMobile, mail);
        this.patologia = patologia;
    }

    public String getPatologia() {
        return patologia;
    }

    public void setPatologia(String patologia) {
        this.patologia = patologia;
    }

}
