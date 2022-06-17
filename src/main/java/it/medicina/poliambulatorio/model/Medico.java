package it.medicina.poliambulatorio.model;

public class Medico extends Persona{

    private String specializzazione;
    private String badgeId;


    public Medico(long id, String nome, String cognome, String indirizzo, String recapitoMobile, String mail,
                  String specializzazione, String badgeId) {
        super(id, nome, cognome, indirizzo, recapitoMobile, mail);
        this.specializzazione = specializzazione;
        this.badgeId = badgeId;
    }

    public String getSpecializzazione() {
        return specializzazione;
    }

    public void setSpecializzazione(String specializzazione) {
        this.specializzazione = specializzazione;
    }

    public String getBadgeId() {
        return badgeId;
    }

    public void setBadgeId(String badgeId) {
        this.badgeId = badgeId;
    }

    @Override
    public String toString() {
        return super.toString() +
                "specializzazione='" + specializzazione + '\'' +
                ", badgeId='" + badgeId + '\'' +
                '}';
    }
}
