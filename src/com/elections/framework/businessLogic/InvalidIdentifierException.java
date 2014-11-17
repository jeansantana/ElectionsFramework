package com.elections.framework.businessLogic;

public class InvalidIdentifierException extends Exception {
	public InvalidIdentifierException() {
		super("Invalid Identifer. Identifier must be Interger, Character or String type");
	}
}
