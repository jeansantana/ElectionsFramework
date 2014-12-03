package com.elections.framework.businessLogic;

import java.text.ParseException;

public abstract class Voter extends Person {
	// define weight to calculate result formula
	protected double influence;

	public Voter() {
		// TODO Auto-generated constructor stub
	}

	public Voter(String name, String cpf, String dateBirth, Place place, double influence) throws ParseException {
		super(name, cpf, dateBirth, place);
		this.influence = influence;
	}

	public double getInfluence() {
		return influence;
	}

	public void setInfluence(double influence) {
		this.influence = influence;
	}
}
