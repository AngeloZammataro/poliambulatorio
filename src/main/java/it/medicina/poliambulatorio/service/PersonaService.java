package it.medicina.poliambulatorio.service;

import it.medicina.poliambulatorio.model.Persona;

import java.util.List;

    public interface PersonaService {

        public List<Persona> getAllPersone();

        public Persona getPersona(Long id);

        public void addPersona(Persona persona);

        public void updatePersona(Long id, Persona persona);

        public void deletePersona(Long id);

    }
