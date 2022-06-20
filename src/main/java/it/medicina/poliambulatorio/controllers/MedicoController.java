package it.medicina.poliambulatorio.controllers;

import it.medicina.poliambulatorio.model.Medico;
import it.medicina.poliambulatorio.exception.ResourceNotFoundException;
import it.medicina.poliambulatorio.repository.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@CrossOrigin("*")
@RestController
@RequestMapping("/medici")
public class MedicoController {
    @Autowired
    private MedicoRepository medicoRepository;

    @GetMapping
    public List<Medico> getAllmedici(){
        return medicoRepository.findAll();
    }

    // build create employee REST API
    @PostMapping
    public Medico createMedico(@RequestBody Medico medico) {
        return medicoRepository.save(medico);
    }

    // build get employee by id REST API
    @GetMapping("{id}")
    public ResponseEntity<Medico> getMedicoById(@PathVariable  long id){
        Medico medico = medicoRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id:" + id));
        return ResponseEntity.ok(medico);
    }

    // build update employee REST API
    @PutMapping("{id}")
    public ResponseEntity<Medico> updateMedico(@PathVariable long id,@RequestBody Medico medicoDetails) {
        Medico updateMedico = medicoRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id: " + id));

        updateMedico.setFirstName(medicoDetails.getFirstName());
        updateMedico.setLastName(medicoDetails.getLastName());
        updateMedico.setAddress(medicoDetails.getAddress());
        updateMedico.setPhone(medicoDetails.getPhone());
        updateMedico.setEmailId(medicoDetails.getEmailId());


        medicoRepository.save(updateMedico);

        return ResponseEntity.ok(updateMedico);
    }

    // build delete employee REST API
    @DeleteMapping("{id}")
    public ResponseEntity<HttpStatus> deleteMedico(@PathVariable long id){

        Medico medico = medicoRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id: " + id));

        medicoRepository.delete(medico);

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
