package com.elections.framework.businessLogic;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Person {
	
	protected String name;
	protected String cpf;
	protected Date dateBirth;
	protected Place place;

	public Person() {
		
	}

	public Person(String name, String cpf, String dateBirth) throws ParseException {
		this.name = name;
		this.cpf = cpf;
		formatDate(dateBirth);
		this.place = null;
	}

	public Person(String name, String cpf, String dateBirth, Place place) throws ParseException {
		this.name = name;
		this.cpf = cpf;
		formatDate(dateBirth);
		this.place = place;
	}
	
	public Place getPlace() {
		return place;
	}
	
	public void setPlace(Place place) {
		this.place = place;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Date getDateBirth() {
		return dateBirth;
	}
	
	public String getStrDateBirth() {
		return new SimpleDateFormat("dd-MM-yyyy").format(dateBirth);
	}

	public void setDateBirth(Date dateBirth) {
		this.dateBirth = dateBirth;
	}

	public boolean cpfValidation() {

		boolean isValid = true;
		if (cpf.length() == 11 || cpf == null) {

			for (int i = 0; i < cpf.length() && isValid; i++) {
				if (!isNumber(cpf.charAt(i))) {
					isValid = false;
				}
			}
			
		} else {
			isValid = false;
		}
		return isValid;
	}

	private boolean isNumber(char c) {
		return Character.getNumericValue(c) >= Character.getNumericValue('0')
				&& Character.getNumericValue(c) <= Character.getNumericValue('9');
	}
	
	protected void formatDate(String date) throws ParseException {
		DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
		this.dateBirth = df.parse(date);		
	}

}
