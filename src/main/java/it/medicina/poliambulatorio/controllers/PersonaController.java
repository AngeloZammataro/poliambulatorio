package it.medicina.poliambulatorio.controllers;
import java.util.List;

import it.medicina.poliambulatorio.model.Persona;
import it.medicina.poliambulatorio.service.PersonaServiceDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonaController {

    @Autowired
    private PersonaServiceDB personaService;

    @GetMapping("/persone")
    public List<Persona> getAllPersone() {
        return personaService.getAllPersone();
    }

    @GetMapping("/persone/{id}")
    public Persona getPersona(@PathVariable Long id) {
        return personaService.getPersona(id);
    }

    @PostMapping("/persone")
    //Alternative
    //@RequestMapping(value = "/players", method = RequestMethod.POST)
    public void addPersona(@RequestBody Persona persona) {
        personaService.addPersona(persona);
    }

    @RequestMapping(value = "/persone/{id}", method = RequestMethod.PUT)
    public void updatePersona(@PathVariable Long id, @RequestBody Persona persona) {
        personaService.updatePersona(id, persona);
    }

    @RequestMapping(value = "/persone/{id}", method = RequestMethod.DELETE)
    public void deletePersona(@PathVariable Long id) {
        personaService.deletePersona(id);
    }
}
