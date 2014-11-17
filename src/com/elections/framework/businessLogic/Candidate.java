package com.elections.framework.businessLogic;

import java.text.ParseException;

public class Candidate extends Person {
	
	protected int qttVotes;
	protected double pontuation; //score on election according to formula's role 
	
	public Candidate() {
	}
	
	public Candidate(String name, String cpf, String dateBirth) throws ParseException {
		super(name, cpf, dateBirth);
		this.qttVotes = 0;
		this.pontuation = 0.0;
	}
	
	public int getQttVotes() {
		return qttVotes;
	}
	
	public void setQttVotes(int qttVotes) {
		this.qttVotes = qttVotes;
	}
	
	public double getPontuation() {
		return pontuation;
	}
	
	public void setPontuation(double pontuation) {
		this.pontuation = pontuation;
	}
	
}
