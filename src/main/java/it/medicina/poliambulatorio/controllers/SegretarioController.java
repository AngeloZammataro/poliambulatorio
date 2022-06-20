package it.medicina.poliambulatorio.controllers;

import it.medicina.poliambulatorio.exception.ResourceNotFoundException;
import it.medicina.poliambulatorio.model.Segretario;
import it.medicina.poliambulatorio.repository.SegretarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin("*")
@RestController
@RequestMapping("/segretari")
public class SegretarioController {
    @Autowired
    private SegretarioRepository segretarioRepository;

    @GetMapping
    public List<Segretario> getAllsegretari(){
        return segretarioRepository.findAll();
    }

    // build create employee REST API
    @PostMapping
    public Segretario createSegretario(@RequestBody Segretario segretario) {
        return segretarioRepository.save(segretario);
    }

    // build get employee by id REST API
    @GetMapping("{id}")
    public ResponseEntity<Segretario> getSegretarioById(@PathVariable  long id){
        Segretario segretario = segretarioRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id:" + id));
        return ResponseEntity.ok(segretario);
    }

    // build update employee REST API
    @PutMapping("{id}")
    public ResponseEntity<Segretario> updateSegretario(@PathVariable long id,@RequestBody Segretario segretarioDetails) {
        Segretario updateSegretario = segretarioRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id: " + id));

        updateSegretario.setFirstName(segretarioDetails.getFirstName());
        updateSegretario.setLastName(segretarioDetails.getLastName());
        updateSegretario.setAddress(segretarioDetails.getAddress());
        updateSegretario.setPhone(segretarioDetails.getPhone());
        updateSegretario.setEmailId(segretarioDetails.getEmailId());


        segretarioRepository.save(updateSegretario);

        return ResponseEntity.ok(updateSegretario);
    }

    // build delete employee REST API
    @DeleteMapping("{id}")
    public ResponseEntity<HttpStatus> deleteSegretario(@PathVariable long id){

        Segretario segretario = segretarioRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id: " + id));

        segretarioRepository.delete(segretario);

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
