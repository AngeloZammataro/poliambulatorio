package it.medicina.poliambulatorio.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import it.medicina.poliambulatorio.model.Persona;
import org.springframework.stereotype.Service;

@Service
public class PersonaServiceMock implements PersonaService {

    private List<Persona> persone = new ArrayList<>(Arrays.asList(new Persona(Long.valueOf(1), "Francesco", "Totti", "Via Roma, 115", "3336589741","tottino@libero.it"),
            new Persona(Long.valueOf(2), "Gonzalo", "Higuain", "Via dei Galli, 12","3336589741","gonzi@alice.it"),
            new Persona(Long.valueOf(3), "Mauro", "Icardi", "Via Carducci, 15", "3335845214","icaro@gmail.com")));

    public List<Persona> getAllPersone() {
        return persone;
    }

    public Persona getPersona(Long id) {

        return persone.stream()
                .filter(p -> p.getId() == id)
                .findFirst()
                .get();
    }

    public void addPersona(Persona persona) {
        persone.add(persona);
    }

    public void updatePersona(Long id, Persona persona) {
        for (int i = 0; i < persone.size(); i++) {
            Persona p = persone.get(i);
            if (p.getId() == id) {
                persone.set(i, persona);
            }
        }

    }

    public void deletePersona(Long id) {
        persone.removeIf(p -> p.getId() == id);

    }

}
