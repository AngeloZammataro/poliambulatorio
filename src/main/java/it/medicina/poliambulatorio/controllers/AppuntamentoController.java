package it.medicina.poliambulatorio.controllers;

import it.medicina.poliambulatorio.exception.ResourceNotFoundException;
import it.medicina.poliambulatorio.model.Appuntamento;
import it.medicina.poliambulatorio.repository.AppuntamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@CrossOrigin("*")
@RestController
@RequestMapping("/appuntamenti")
public class AppuntamentoController {
    @Autowired
    private AppuntamentoRepository appuntamentoRepository;

    @GetMapping
    public List<Appuntamento> getAllAppuntamenti(){
        return appuntamentoRepository.findAll();
    }

    @PostMapping
    public Appuntamento createAppuntamento(@RequestBody Appuntamento appuntamento) {
        return appuntamentoRepository.save(appuntamento);
    }

    @GetMapping("{id}")
    public ResponseEntity<Appuntamento> getAppuntamentoById(@PathVariable  long id){
        Appuntamento appuntamento = appuntamentoRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("L'appuntamento non esiste id: " + id));
        return ResponseEntity.ok(appuntamento);
    }

    @PutMapping("{id}")
    public ResponseEntity<Appuntamento> updateAppuntamento(@PathVariable long id,@RequestBody Appuntamento appuntamentoDetails) {
        Appuntamento updateAppuntamento = appuntamentoRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("L'appuntamento non esiste id: " + id));

        updateAppuntamento.setDataAppuntamento(appuntamentoDetails.getDataAppuntamento());

        appuntamentoRepository.save(updateAppuntamento);

        return ResponseEntity.ok(updateAppuntamento);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<HttpStatus> deleteAppuntamento(@PathVariable long id){

        Appuntamento appuntamento = appuntamentoRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("L'appuntamento non esiste id: " + id));

        appuntamentoRepository.delete(appuntamento);

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}



