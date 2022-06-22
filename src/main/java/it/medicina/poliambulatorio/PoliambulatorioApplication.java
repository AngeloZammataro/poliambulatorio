package it.medicina.poliambulatorio;

import it.medicina.poliambulatorio.model.*;
import it.medicina.poliambulatorio.repository.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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
	private PazienteRepository pazienteRepository;
	private SegretarioRepository segretarioRepository;
	private CartellaMedicaRepository cartellaMedicaRepository;

	@Override
	public void run(String... args) throws Exception {
/*
		Medico medico = new Medico();
		medico.setFirstName("Gregory");
		medico.setLastName("House");
		medico.setAddress("Via dei Pazzi,0");
		medico.setCity("Torino");
		medico.setPhone("3331992564");
		medico.setEmailId("house@gmail.com");
		medico.setRole("Medico");
		medico.setMedical_specialization("cardiologist");
		medico.setBadgeNumber("GRE-xyz-HOU");
		medico.setLogin_id("gregoryhouse");
		medico.setPassword("password");
		medico.set_male(true);
		medicoRepository.save(medico);

		Segretario segretario = new Segretario();
		segretario.setFirstName("Erlik");
		segretario.setLastName("Khan");
		segretario.setAddress("Via Pakistan,1");
		segretario.setCity("Palermo");
		segretario.setPhone("3331122564");
		segretario.setEmailId("khan@gmail.com");
		segretario.setRole("Segretario");
		medico.setBadgeNumber("ERL-xyz-KHA");
		medico.setLogin_id("erlikkhan");
		medico.setPassword("password");
		medico.set_male(true);
		segretarioRepository.save(segretario);

		Paziente paziente = new Paziente();
		paziente.setFirstName("Bruce");
		paziente.setLastName("Banner");
		paziente.setAddress("Via Verdi,7");
		paziente.setCity("Roma");
		paziente.setPhone("3337722564");
		paziente.setEmailId("hulk@gmail.com");
		paziente.setMedical_pathology("cervicalgia");
		paziente.set_male(true);
		paziente.setMedical_record_number(1);
		pazienteRepository.save(paziente);

 */
	}
}
