package com.elections.framework.businessLogic;

import java.text.ParseException;

public class Candidate extends Person{
	
	protected double pontuation; //score on election according to formula's role 
	protected int identifier;
	private Role role;
	
	public Candidate() {}
	
	public Candidate(String name, String cpf, String dateBirth, int identifier) throws ParseException {
		super(name, cpf, dateBirth);
		this.pontuation = 0.0;
		this.identifier = identifier;
	}
	
	public double getPontuation() {
		return pontuation;
	}
	
	public void setPontuation(double pontuation) {
		this.pontuation = pontuation;
	}
	
	public int getIdentifier() {
		return identifier;
	}
	
	public void setIdentifier(int identifier) {
		this.identifier = identifier;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}
}
