package com.elections.framework.businessLogic;

public class InvalidIdentifierException extends Exception {
	public InvalidIdentifierException() {
		super("Invalid Identifer. Identifier must be Integer, Character or String type");
	}
}
