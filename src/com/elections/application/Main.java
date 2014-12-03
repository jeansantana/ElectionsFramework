package com.elections.application;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.elections.framework.businessLogic.Candidate;
import com.elections.framework.businessLogic.CandidateNotFoundException;
import com.elections.framework.businessLogic.Candidature;
import com.elections.framework.businessLogic.CompositePlace;
import com.elections.framework.businessLogic.Election;
import com.elections.framework.businessLogic.ElectionServices;
import com.elections.framework.businessLogic.Place;
import com.elections.framework.businessLogic.Report;
import com.elections.framework.dataAccess.CandidateDAO;
import com.elections.framework.dataAccess.ElectionDAO;

public class Main {
	public static void main(String[] args) throws ParseException {
		// Person c = new Candidate("Wendell", "31231507891", "12-05-2011");
		// System.out.println(c.getStrDateBirth());
		ElectionServices electionServices = new ElectionServices();
		Election election = new Election("Votacao para governador");
		ElectionDAO.getInstance().registerElection(election);

		CompositePlace Nordeste = new CompositePlace("Nordeste", 0);

		Place Natal = new Place("Natal", 1);
		Place Guamare = new Place("Guamaré", 2);

		Nordeste.add(Natal);
		Nordeste.add(Guamare);
		
		election.registerPlace(Nordeste);
		
		Citizen jean = new Citizen("Jean", "076.408.264-04", "28-12-1991", Guamare, 1.0);
		Citizen gabriel = new Citizen("Gabriel", "097.268.694-04", "14-01-1993", Natal, 1.0);
		Citizen uira = new Citizen("Uira", "127.000.000-01", "15-10-1980", Natal, 1.0);

		Candidate joao = new Candidate("Joao Doido", "09840743791", "28-12-1881", 40);
		Candidate ronaldo = new Candidate("Ronaldo", "09840745791", "28-12-1885", 15);
		
		CandidateDAO.getInstance().registerCandidate(joao);
		CandidateDAO.getInstance().registerCandidate(ronaldo);
		
		List<Candidate> c = CandidateDAO.getInstance().getCandidates();
		
		Candidature chapa1 = new Candidature(joao);
		Candidature chapa2 = new Candidature(ronaldo);
		
		List<Candidature> candidatures = new ArrayList<Candidature>();
		candidatures.add(chapa1);
		candidatures.add(chapa2);
		
		Natal.setCandidatures(candidatures);
		Guamare.setCandidatures(candidatures);
		
		try {
			
			election.vote(gabriel, joao.getIdentifier());
			election.vote(jean, ronaldo.getIdentifier());
			election.vote(uira, joao.getIdentifier());
			
		} catch (CandidateNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Report report = electionServices.getResult(election, Nordeste);
		printMap(report.getCandidatesVotes());


	}

	public static void printMap(Map<Integer, Candidate> map) {
		for (Map.Entry<Integer, Candidate> entry : map.entrySet()) {
			System.out.println("Key : " + entry.getKey() + " Value : "
					+ entry.getValue().getName());
		}
	}
}