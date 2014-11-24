package com.elections.framework.businessLogic;

public abstract class RegisterCandidateRule implements IRegisterCandidateRule {
	
	public boolean validate(Candidate candidate){
		return true;
	}
}
