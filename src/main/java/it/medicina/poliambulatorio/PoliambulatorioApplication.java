package it.medicina.poliambulatorio;

import it.medicina.poliambulatorio.model.Appuntamento;
import it.medicina.poliambulatorio.model.Medico;
import it.medicina.poliambulatorio.model.Paziente;
import it.medicina.poliambulatorio.model.Segretario;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.time.LocalTime;

//@SpringBootApplication
public class PoliambulatorioApplication {

	public static void main(String[] args) {
		//SpringApplication.run(PoliambulatorioApplication.class, args);

		Segretario segretario = new Segretario(0, "Rocco","Tanika", "Via degli Alfieri, 4",
				"2224444444","roccoTanika@yahoo.it");

		Medico medico1 = new Medico(1,"Mario", "Rossi","Viale delle Palme, 12",
				"3331111111", "mariorossi@gmail.com","Fisiatria","MAR1ROS");
		Medico medico2 = new Medico(2,"Carla", "Neri","Viale delle Magnolie, 22",
				"3332222222", "carlaneri@gmail.com","Ortopedia","CAR2NER");
		Medico medico3 = new Medico(3,"Dario", "Verdi","Corso Vittoria, 1",
				"3333333333", "darioverdi@gmail.com","Cardiologia","DAR2VER");

		Paziente paziente1 = new Paziente(4, "Marco","Torre", "Via Libertà, 42",
				"5558888888","marcotorre@yahoo.com","meniscopatia ginocchio dx");
		Paziente paziente2 = new Paziente(5, "Carlo","Re", "Corso Italia, 1",
				"2236598741","carlore@yahoo.com","lombo-sciatalgia");
		Paziente paziente3 = new Paziente(6, "Claudio","Pedone", "Via Magellano, 30",
				"1112266987","marcopedone@yahoo.com","aritmia del miocardio");


		Appuntamento appuntamento1 = new Appuntamento(LocalDate.of(2022,07,1), LocalTime.of(9,0),medico1,paziente1);
		Appuntamento appuntamento2 = new Appuntamento(LocalDate.of(2022,07,1), LocalTime.of(10,0),medico2,paziente2);
		Appuntamento appuntamento3 = new Appuntamento(LocalDate.of(2022,07,1), LocalTime.of(11,0),medico3,paziente3);

		segretario.fissaAppuntamento(appuntamento1);
		segretario.fissaAppuntamento(appuntamento2);
		segretario.fissaAppuntamento(appuntamento3);

		//segretario.disdiciAppuntamentoPerData(appuntamento1.getDataAppuntamento());
		segretario.listaAppuntamenti();
		System.out.println("-----------------------------------------------------------------");
		segretario.stampaAppuntamento(appuntamento1);
		System.out.println("-----------------------------------------------------------------");
		segretario.modificaAppuntamento(paziente2);
		System.out.println("-----------------------------------------------------------------");
		segretario.listaAppuntamenti();
		System.out.println("-----------------------------------------------------------------");
		segretario.registraAnagraficaPaziente();
		System.out.println("-----------------------------------------------------------------");
		segretario.listaPazienti();
		System.out.println("-----------------------------------------------------------------");
		segretario.registraAnagraficaPaziente( "Ciccio", "Ingrassia",
				"Via dei Calzolai, 11", "3285698741",
				"ciccioingrassia@gmail.com", "Dolore alla spalla");
		segretario.listaPazienti();
		System.out.println("-----------------------------------------------------------------");
	}
}
