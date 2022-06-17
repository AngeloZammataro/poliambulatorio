package it.medicina.poliambulatorio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PoliambulatorioApplication {

	public static void main(String[] args) {
		SpringApplication.run(PoliambulatorioApplication.class, args);
/*
		Medico medico = new Medico(1,"Mario", "Rossi","Viale delle Palme, 12",
				"3331111111", "marioRossi@gmail.com","Ortopedia","MAR1ROS");

		Segretario segretario = new Segretario(2, "Rocco","Tanika", "Via degli Alfieri, 4",
				"2224444444","roccoTanika@yahoo.it");

		Paziente paziente1 = new Paziente(3, "Marco","Verdi", "Via Libertà, 42",
				"5558888888","marcoGreen@yahoo.com","Cervicalgia");
		Paziente paziente2 = new Paziente(4, "Carlo","Bianchi", "Corso Italia, 1",
				"2236598741","carlo@yahoo.com","Sciatalgia");

		Appuntamento appuntamento1 = new Appuntamento("24/07/2022","09:30",medico,paziente1);
		Appuntamento appuntamento2 = new Appuntamento("24/07/2022","11:30",medico,paziente2);
		Appuntamento appuntamento3 = new Appuntamento("25/07/2022","08:30",medico,paziente2);

		segretario.fissaAppuntamento(appuntamento1);
		segretario.fissaAppuntamento(appuntamento2);
		segretario.fissaAppuntamento(appuntamento3);

		//segretario.disdiciAppuntamentoPerData(appuntamento1.getDataAppuntamento());
		segretario.listaAppuntamenti();
 */
	}
}
