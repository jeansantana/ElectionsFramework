package com.elections.framework.businessLogic;

public class Identifier <T> {
	
	private T value;
	
	public Identifier(T value) throws InvalidIdentifierException {
		if (isValidIdentifier(value)) {
			this.value = value;
		} else {
			throw new InvalidIdentifierException();
		}
	}
	
	public T getValue() {
		return value;
	}
	
	public void setValue(T value) throws InvalidIdentifierException {
		if (isValidIdentifier(value)) {
			this.value = value;
		} else {
			throw new InvalidIdentifierException();
		}
	}
	
	@Override
	public boolean equals(Object value) {
		boolean response = false;
		if (isValidIdentifier( (T) value ) ) {
			if (this.value == value) {
				response = true;
			}
		} else {
			try {
				throw new InvalidIdentifierException();
			} catch (InvalidIdentifierException e) {
				e.printStackTrace();
			}
		}
		return response;
	}
	
	@Override
	public String toString() {
		return "" + value;
	}
	
	private boolean isValidIdentifier(T value) {
		return value instanceof Integer || value instanceof Character || value instanceof String;
	}
}
