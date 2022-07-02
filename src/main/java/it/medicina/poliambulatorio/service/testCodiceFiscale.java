package it.medicina.poliambulatorio.service;

public class testCodiceFiscale {
    public static void main(String[] args) {

        CodiceFiscale codiceFiscale = new CodiceFiscale();
        codiceFiscale.setCognome("Zammataro");
        codiceFiscale.setNome("Angelo");
        codiceFiscale.setComuneDiNascita("Palermo");
        codiceFiscale.setAnnoDiNascita(1976);
        codiceFiscale.setMeseDiNascita(10);
        codiceFiscale.setGiornoDiNascita(4);
        codiceFiscale.setMale(true);

        System.out.println(codiceFiscale.getFirstThreeChar());
    }
}
