package com.elections.framework.businessLogic;

import com.elections.framework.dataAccess.CandidateDAO;
import com.elections.framework.dataAccess.ElectionDAO;

public class RegisterServices implements IRegisterServices{

	@Override
	public boolean electionRegister(Election election) {
		if(ElectionDAO.getInstance().registerElection(election)) return true;
		return false;
	}

	@Override
	public boolean voterRegister(Voter voter) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean candidateRegister(Candidate candidate) {
		if(CandidateDAO.getInstance().registerCandidate(candidate)) return true;
		return false;
	}

}
