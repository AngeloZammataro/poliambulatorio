package it.medicina.poliambulatorio.service;

import java.util.List;
import java.util.Optional;

import it.medicina.poliambulatorio.model.Persona;
import it.medicina.poliambulatorio.repositories.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaServiceDB implements PersonaService {

    @Autowired
    private PersonaRepository personaRepository;

    public List<Persona> getAllPersone() {
        return personaRepository.findAll();
    }

    public Persona getPersona(Long id) {
        Optional<Persona> persona = this.personaRepository.findById(id);
        if (persona.isPresent()) {
            return persona.get();
        } else {
            return null;
        }
    }

    public void addPersona(Persona persona) {
        personaRepository.save(persona);
    }

    public void updatePersona(Long id, Persona persona) {
        personaRepository.save(persona);
    }

    public void deletePersona(Long id) {
        personaRepository.deleteById(id);
    }

}
