package com.elections.framework.businessLogic;

import java.util.List;
import java.util.Map;

public class Report {
	
	protected String title;
	protected Map<Candidate, Integer> candidatesVotes;
	
	public Report() {
		// TODO Auto-generated constructor stub
	}

	public Report(String title, Map<Candidate, Integer> candidatesVotes) {
		this.title = title;
		this.candidatesVotes = candidatesVotes;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public Map<Candidate, Integer> getCandidatesVotes() {
		return candidatesVotes;
	}
	
	public void setCandidatesVotes(Map<Candidate, Integer> candidatesVotes) {
		this.candidatesVotes = candidatesVotes;
	}
}
