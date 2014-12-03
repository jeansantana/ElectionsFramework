package com.elections.application;

import java.text.ParseException;

import com.elections.framework.businessLogic.Place;
import com.elections.framework.businessLogic.Voter;

public class Citizen extends Voter {

	public Citizen(String name, String cpf, String dateBirth, Place place, double influence) throws ParseException {
		super(name, cpf, dateBirth, place, influence);
	}
	
}
