package com.elections.framework.businessLogic;

import java.util.List;
import java.util.ArrayList;

import com.elections.framework.dataAccess.CandidateDAO;

public class Election {

	private String name;
	private List<AbstractPlace> places;
	private List<Voter> voters;
	private List<ElectionRule> rules;

	public Election() {
		this.places = new ArrayList<AbstractPlace>();
	}
	
	public Election(String name) {
		this.name = name;
		this.places = new ArrayList<AbstractPlace>();
	}
	
	public void registerPlace(AbstractPlace place){
		places.add(place);
	}

	public void vote(Voter voter, int id) throws CandidateNotFoundException {
		
		Candidate candidate = findCandidate(id);
		
		Place placeVoter = voter.getPlace();
		
		Candidature candidature = findCandidature(placeVoter, candidate);
		
		candidature.setQttvotes(candidature.getQttvotes() + 1);
		
	}
	
	public Candidate findCandidate(int id) throws CandidateNotFoundException {
		Candidate candidate = CandidateDAO.getInstance().getCandidateById(id);
		
		if (candidate == null) {
			throw new CandidateNotFoundException();
		}
		
		return candidate;
	}

	private Candidature findCandidature(Place place, Candidate candidate) {
		Candidature result = null;
		
		for (Candidature candtt : place.getCandidatures()) {
			if (candtt.getCandidate().equals(candidate)) {
				result = candtt;
			}
		}
		
		return result;
	}

	private int findPlaceIndex(Place place) {
		
		boolean achou = false;
		int idx = -1;
		
		for (int i = 0; i < places.size() && !achou; i++) {
			if (places.get(i).equals(place)) {
				achou = true;
				idx = i;
			}
		}
		
		return idx;
	}

	public List<AbstractPlace> getPlaces() {
		return places;
	}

	public void setPlaces(List<AbstractPlace> places) {
		this.places = places;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Voter> getVoters() {
		return voters;
	}

	public void setVoters(ArrayList<Voter> voters) {
		this.voters = voters;
	}

	public List<ElectionRule> getRules() {
		return rules;
	}

	public void setRules(ArrayList<ElectionRule> rules) {
		this.rules = rules;
	}
}
