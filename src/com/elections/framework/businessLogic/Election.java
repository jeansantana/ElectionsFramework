package com.elections.framework.businessLogic;

import java.util.ArrayList;

import com.elections.framework.dataAccess.CandidateDAO;


public class Election {
	private String name;
	private ArrayList<Candidate> candidates;
	private ArrayList<Voter> voters;
	private ArrayList<IElectionRule> rules;
	
	public boolean vote(Voter voter, Identifier<?> id){
		//Search for the candidate in the DAO and increment its qttVotes
		Candidate candidate = CandidateDAO.getInstance().getCandidateById(id.getValue());
		if(candidate == null){
			return false;
		}
		
		candidate.setQttVotes(candidate.getQttVotes() + 1);
		return true;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Candidate> getCandidates() {
		return candidates;
	}

	public void setCandidates(ArrayList<Candidate> candidates) {
		this.candidates = candidates;
	}

	public ArrayList<Voter> getVoters() {
		return voters;
	}

	public void setVoters(ArrayList<Voter> voters) {
		this.voters = voters;
	}


	public ArrayList<IElectionRule> getRules() {
		return rules;
	}


	public void setRules(ArrayList<IElectionRule> rules) {
		this.rules = rules;
	}
}
