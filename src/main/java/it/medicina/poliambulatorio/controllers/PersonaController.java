package it.medicina.poliambulatorio.controllers;
import java.util.List;

import it.medicina.poliambulatorio.model.Persona;

import it.medicina.poliambulatorio.exception.ResourceNotFoundException;
import it.medicina.poliambulatorio.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@CrossOrigin("*")
@RestController
@RequestMapping("/persone")
public class PersonaController {
    @Autowired
    private PersonaRepository personaRepository;

    @GetMapping
    public List<Persona> getAllPersone(){
        return personaRepository.findAll();
    }

    // build create employee REST API
    @PostMapping
    public Persona createPersona(@RequestBody Persona persona) {
        return personaRepository.save(persona);
    }

    // build get employee by id REST API
    @GetMapping("{id}")
    public ResponseEntity<Persona> getPersonaById(@PathVariable  long id){
        Persona persona = personaRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id:" + id));
        return ResponseEntity.ok(persona);
    }

    // build update employee REST API
    @PutMapping("{id}")
    public ResponseEntity<Persona> updatePersona(@PathVariable long id,@RequestBody Persona personaDetails) {
        Persona updatePersona = personaRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id: " + id));

        updatePersona.setFirstName(personaDetails.getFirstName());
        updatePersona.setLastName(personaDetails.getLastName());
        updatePersona.setAddress(personaDetails.getAddress());
        updatePersona.setPhone(personaDetails.getPhone());
        updatePersona.setEmailId(personaDetails.getEmailId());


        personaRepository.save(updatePersona);

        return ResponseEntity.ok(updatePersona);
    }

    // build delete employee REST API
    @DeleteMapping("{id}")
    public ResponseEntity<HttpStatus> deletePersona(@PathVariable long id){

        Persona persona = personaRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id: " + id));

        personaRepository.delete(persona);

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
