package com.elections.framework.businessLogic;

public class CandidateNotFoundException extends Exception {
	public CandidateNotFoundException() {
		super("Candidate Not Found.");
	}
}
