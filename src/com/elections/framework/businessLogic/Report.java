package com.elections.framework.businessLogic;

import java.util.List;
import java.util.Map;

public class Report {
	private int id;
	protected String title;
	protected Map<Integer, Candidate> candidatesVotes;
	
	public Report() {
		// TODO Auto-generated constructor stub
	}

	public Report(String title, Map<Integer, Candidate> candidatesVotes) {
		this.title = title;
		this.candidatesVotes = candidatesVotes;
	}
	
	public Report(Map<Integer, Candidate> candidatesVotes) {
		this.candidatesVotes = candidatesVotes;
	}

	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public Map<Integer, Candidate> getCandidatesVotes() {
		return candidatesVotes;
	}
	
	public void setCandidatesVotes(Map<Integer, Candidate> candidatesVotes) {
		this.candidatesVotes = candidatesVotes;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
