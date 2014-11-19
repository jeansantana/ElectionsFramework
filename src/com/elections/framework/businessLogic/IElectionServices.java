package com.elections.framework.businessLogic;

import java.util.List;

public interface IElectionServices {
	public List<Candidate> doResult(Election election);
}
