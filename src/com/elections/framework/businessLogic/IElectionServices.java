package com.elections.framework.businessLogic;

public interface IElectionServices {
	public Report getResult(Election election, AbstractPlace place);
}
