package it.medicina.poliambulatorio;

import it.medicina.poliambulatorio.model.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import it.medicina.poliambulatorio.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import java.time.LocalDate;
import java.time.LocalTime;

@SpringBootApplication
public class PoliambulatorioApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(PoliambulatorioApplication.class, args);
	}

	@Autowired
	private PersonaRepository personaRepository;

	@Override
	public void run(String... args) throws Exception {
		Persona persona = new Persona();
		persona.setFirstName("Erlik");
		persona.setLastName("Khan");
		persona.setAddress("Via Pakistan,1");
		persona.setPhone("3331122564");
		persona.setEmailId("khan@gmail.com");
		personaRepository.save(persona);

		Persona persona1 = new Persona();
		persona1.setFirstName("Kem");
		persona1.setLastName("Ric");
		persona1.setAddress("Via Aristeo,25");
		persona1.setPhone("3265569887");
		persona1.setEmailId("kem@gmail.com");
		personaRepository.save(persona1);
	}
}
