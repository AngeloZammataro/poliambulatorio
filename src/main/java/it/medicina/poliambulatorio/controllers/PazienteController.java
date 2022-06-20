package it.medicina.poliambulatorio.controllers;

import it.medicina.poliambulatorio.model.Paziente;
import it.medicina.poliambulatorio.exception.ResourceNotFoundException;
import it.medicina.poliambulatorio.repository.PazienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@CrossOrigin("*")
@RestController
@RequestMapping("/pazienti")
public class PazienteController {
    @Autowired
    private PazienteRepository pazienteRepository;

    @GetMapping
    public List<Paziente> getAllPazienti(){
        return pazienteRepository.findAll();
    }

    // build create employee REST API
    @PostMapping
    public Paziente createPaziente(@RequestBody Paziente paziente) {
        return pazienteRepository.save(paziente);
    }

    // build get employee by id REST API
    @GetMapping("{id}")
    public ResponseEntity<Paziente> getPazienteById(@PathVariable  long id){
        Paziente paziente = pazienteRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id:" + id));
        return ResponseEntity.ok(paziente);
    }

    // build update employee REST API
    @PutMapping("{id}")
    public ResponseEntity<Paziente> updatePaziente(@PathVariable long id,@RequestBody Paziente pazienteDetails) {
        Paziente updatePaziente = pazienteRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id: " + id));

        updatePaziente.setFirstName(pazienteDetails.getFirstName());
        updatePaziente.setLastName(pazienteDetails.getLastName());
        updatePaziente.setAddress(pazienteDetails.getAddress());
        updatePaziente.setPhone(pazienteDetails.getPhone());
        updatePaziente.setEmailId(pazienteDetails.getEmailId());

        pazienteRepository.save(updatePaziente);

        return ResponseEntity.ok(updatePaziente);
    }

    // build delete employee REST API
    @DeleteMapping("{id}")
    public ResponseEntity<HttpStatus> deletePaziente(@PathVariable long id){

        Paziente paziente = pazienteRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id: " + id));

        pazienteRepository.delete(paziente);

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
