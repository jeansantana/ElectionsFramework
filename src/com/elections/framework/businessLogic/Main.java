package com.elections.framework.businessLogic;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import com.elections.framework.dataAccess.CandidateDAO;
import com.elections.framework.dataAccess.ElectionDAO;



public class Main {
	public static void main(String[] args) throws ParseException {
		//Person c = new Candidate("Wendell", "31231507891", "12-05-2011");
		//System.out.println(c.getStrDateBirth());
		ElectionServices electionServices = new ElectionServices();
		Election election = new Election();
		election.setName("Votacao para prefeito");
		ElectionDAO.getInstance().registerElection(election);
		Citizen jean = new Citizen("Jean", "076.408.264-04", "28-12-1991", 1.0);
		Citizen gabriel = new Citizen("Gabriel", "097.268.694-04", "14-01-1993", 1.0);
		Citizen uira = new Citizen("Uira", "127.000.000-01", "15-10-1980", 1.0);
		
		
		try {
			Candidate joao = new Candidate("Joao Doido", "09840743791", "28-12-1881", new Identifier<Integer>(40));
			Candidate ronaldo = new Candidate("Ronaldo", "09840745791", "28-12-1885", new Identifier<Integer>(15));
			
			ArrayList<Candidate> candidates = new ArrayList<Candidate>();
			candidates.add(joao);
			candidates.add(ronaldo);
			CandidateDAO.getInstance().setCandidates(candidates);
			election.setCandidates(candidates);
			election.vote(gabriel, new Identifier<Integer>(15));
			election.vote(jean, new Identifier<Integer>(40));
			election.vote(uira, new Identifier<Integer>(15));
			List<Candidate> result = electionServices.doResult(election);
			Candidate winner = result.get(0);
			System.out.println("Winner: " + winner.getName());
		} 
		catch (InvalidIdentifierException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}