package com.elections.framework.businessLogic;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.Month;

public class Main {
	public static void main(String[] args) throws ParseException {
		//Person c = new Candidate("Wendell", "31231507891", "12-05-2011");
		//System.out.println(c.getStrDateBirth());
		Identifier<Character> id = null;
		try {
			id = new Identifier<Character>('c');
		} catch (InvalidIdentifierException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(id);
		
		Candidate d = new Candidate("João Doido", "09840743791", "28-12-1881", id);
		Identifier<Character> ch = (Identifier<Character>) d.getIdentifier();
	}
}