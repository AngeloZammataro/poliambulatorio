package it.medicina.poliambulatorio;

import it.medicina.poliambulatorio.model.*;
import it.medicina.poliambulatorio.repository.MedicoRepository;
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
	private MedicoRepository medicoRepository;

	@Override
	public void run(String... args) throws Exception {

		Medico medico = new Medico();
		medico.setFirstName("Erlik");
		medico.setLastName("Khan");
		medico.setAddress("Via Pakistan,1");
		medico.setCity("Palermo");
		medico.setPhone("3331122564");
		medico.setEmailId("khan@gmail.com");
		medico.setRole("Medico");
		medico.setMedical_specialization("cardiologist");
		medico.setBadgeNumber("ERL-xyz-KHA");
		medico.setMedical_pathology(null);
		medico.setLogin_id("erlikkhan");
		medico.setPassword("password");
		medico.set_male(true);
		medico.setMedical_record_number(0);
		personaRepository.save(medico);

		Persona persona1 = new Persona();
		persona1.setFirstName("Kem");
		persona1.setLastName("Ric");
		persona1.setAddress("Via Arsenio,7");
		persona1.setCity("Palermo");
		persona1.setPhone("3334622564");
		persona1.setEmailId("kem@gmail.com");
		persona1.setRole("Paziente");
		persona1.setMedical_specialization(null);
		persona1.setBadgeNumber("KEM-xyz-RIC");
		persona1.setMedical_pathology("mal di pancia");
		persona1.setLogin_id(null);
		persona1.setPassword(null);
		persona1.set_male(false);
		persona1.setMedical_record_number(1);
		personaRepository.save(persona1);
	}

}
