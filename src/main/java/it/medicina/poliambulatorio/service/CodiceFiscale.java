package it.medicina.poliambulatorio.service;

import it.medicina.poliambulatorio.model.Persona;
import lombok.Data;

@Data
public class CodiceFiscale {

    private String cognome;
    private String nome;
    private String comuneDiNascita;
    private int annoDiNascita;
    private int meseDiNascita;
    private int giornoDiNascita;
    private boolean isMale;

    private char consonantichar[] = {'b', 'c', 'd', 'f', 'g',
            'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't',
            'v', 'w', 'x', 'y', 'z'};

    private char vocaliChar[] = {'a', 'e', 'i', 'o', 'u'};

    private String consonanti = "bcdfghjklmnpqrstvwxyz";
    private String vocali = "aeiou";


    public char[] getFirstThreeChar() {
        String cognomeCapitalize = cognome.toUpperCase();

        char[] firstThreeChar = new char[3];

        for (int i = 0; i < vocali.length(); i++) {
            if(cognomeCapitalize.charAt(0) != vocaliChar[i]){
                firstThreeChar[0] = cognomeCapitalize.charAt(0);
            }
        }
/*
        if(cognomeCapitalize.charAt(0) != 'A'){
            firstThreeChar[0] = cognomeCapitalize.charAt(0);
        }
        if(cognomeCapitalize.charAt(1) != 'A'){
            firstThreeChar[1] = cognomeCapitalize.charAt(1);
        }
        if(cognomeCapitalize.charAt(2) != 'A'){
            firstThreeChar[2] = cognomeCapitalize.charAt(2);
        }

 */
        return firstThreeChar;
    }
}
