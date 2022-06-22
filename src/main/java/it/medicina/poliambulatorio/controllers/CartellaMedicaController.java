package it.medicina.poliambulatorio.controllers;

import it.medicina.poliambulatorio.exception.ResourceNotFoundException;
import it.medicina.poliambulatorio.model.CartellaMedica;
import it.medicina.poliambulatorio.repository.CartellaMedicaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@CrossOrigin("*")
@RestController
@RequestMapping("/cartelle_mediche")
public class CartellaMedicaController {
    @Autowired
    private CartellaMedicaRepository cartellaMedicaRepository;

    @GetMapping
    public List<CartellaMedica> getAllCartelleMediche(){
        return cartellaMedicaRepository.findAll();
    }

    @PostMapping
    public CartellaMedica createCartellaMedica(@RequestBody CartellaMedica cartellaMedica) {
        return cartellaMedicaRepository.save(cartellaMedica);
    }

    @GetMapping("{id}")
    public ResponseEntity<CartellaMedica> getCartellaMedicaById(@PathVariable  long id){
        CartellaMedica cartellaMedica = cartellaMedicaRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("La cartella non esiste id: " + id));
        return ResponseEntity.ok(cartellaMedica);
    }

    @PutMapping("{id}")
    public ResponseEntity<CartellaMedica> updatecartellaMedica(@PathVariable long id,@RequestBody CartellaMedica cartellaMedicaDetails) {
        CartellaMedica updateCartellaMedica = cartellaMedicaRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("La cartella non esiste id: " + id));

        updateCartellaMedica.setPaziente(cartellaMedicaDetails.getPaziente());
        updateCartellaMedica.setMedico(cartellaMedicaDetails.getMedico());
        updateCartellaMedica.setData(cartellaMedicaDetails.getData());
        updateCartellaMedica.setReferto(cartellaMedicaDetails.getReferto());
        updateCartellaMedica.setTerapia(cartellaMedicaDetails.getTerapia());

        cartellaMedicaRepository.save(updateCartellaMedica);

        return ResponseEntity.ok(updateCartellaMedica);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<HttpStatus> deleteCartellaMedica(@PathVariable long id){

        CartellaMedica cartellaMedica = cartellaMedicaRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Folder not exist with id: " + id));

        cartellaMedicaRepository.delete(cartellaMedica);

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}


