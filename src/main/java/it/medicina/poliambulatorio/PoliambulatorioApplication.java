package it.medicina.poliambulatorio;

import it.medicina.poliambulatorio.model.*;
import it.medicina.poliambulatorio.repository.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

@SpringBootApplication
public class PoliambulatorioApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(PoliambulatorioApplication.class, args);
	}

	@Autowired
	private PersonaRepository personaRepository;
	@Autowired
	private MedicoRepository medicoRepository;
	@Autowired
	private SegretarioRepository segretarioRepository;
	@Autowired
	private PazienteRepository pazienteRepository;
	/*
	@Autowired
	private CartellaMedicaRepository cartellaMedicaRepository;
	@Autowired
	private Appuntamento appuntamentoRepository;
*/
	@Override
	public void run(String... args) throws Exception {

		Medico medico = new Medico();
		medico.setFirstName("Gregory");
		medico.setLastName("House");
		medico.setNationality("Ita");
		medico.setPlaceOfBirth("Roma");
		medico.setDateOfBirth(new Date(1970, 1, 20));
		medico.setDocumentNumber("RM5265489");
		medico.setAddress("Via dei Pazzi,100");
		medico.setCity("Torino");
		medico.setPhone("3331992564");
		medico.setEmail("house@gmail.com");
		medico.setGender(Gender.MALE);

		medico.setRole("Medico");
		medico.setMedicalSpecialization("cardiologist");
		medico.setBadgeNumber("GRE-xyz-HOU");
		medico.setLogin("gregoryhouse");
		medico.setPassword("password");

		medicoRepository.save(medico);

		Segretario segretario = new Segretario();
		segretario.setFirstName("Anna");
		segretario.setLastName("Rossi");
		segretario.setNationality("Ita");
		segretario.setPlaceOfBirth("Roma");
		segretario.setDateOfBirth(new Date(1980, 10, 12));
		segretario.setDocumentNumber("RM2256988");
		segretario.setAddress("Corso Italia,15");
		segretario.setCity("Milano");
		segretario.setPhone("3285699874");
		segretario.setEmail("annarossi@gmail.com");
		segretario.setGender(Gender.FEMALE);

		segretario.setRole("Segretario");
		segretario.setSecretaryPosition(SecretaryPosition.FRONT_OFFICE);
		segretario.setBadgeNumber("ANN-xyz-ROS");
		segretario.setLogin("annarossi");
		segretario.setPassword("password2");

		segretarioRepository.save(segretario);

		Paziente paziente = new Paziente();
		paziente.setFirstName("Mario");
		paziente.setLastName("Verdi");
		paziente.setNationality("Ita");
		paziente.setPlaceOfBirth("Roma");
		paziente.setDateOfBirth(new Date(1990, 2, 19));
		paziente.setDocumentNumber("RM11226658");
		paziente.setAddress("Corso Mattei,150");
		paziente.setCity("Padova");
		paziente.setPhone("3315666987");
		paziente.setEmail("marioverdi@gmail.com");
		paziente.setGender(Gender.MALE);
		paziente.setMedicalPathology("Emicrania");

		pazienteRepository.save(paziente);


	}
}
