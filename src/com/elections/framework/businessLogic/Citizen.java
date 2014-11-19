package com.elections.framework.businessLogic;

import java.text.ParseException;

public class Citizen extends Voter{

	public Citizen(String name, String cpf, String dateBirth, double influence) throws ParseException {
		super(name, cpf, dateBirth, influence);
	}
	
}
