package com.elections.framework.businessLogic;

public interface IRegisterServices {
	public boolean electionRegister(Election election);
	public boolean voterRegister(Voter voter);
	public boolean candidateRegister(Candidate candidate);
}
