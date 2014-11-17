package com.elections.framework.businessLogic;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.Month;

public class Main {
	public static void main(String[] args) throws ParseException {
		Person c = new Candidate("Wendell", "31231507891", "12-05-2011");
		System.out.println(c.getStrDateBirth());
	}
}
