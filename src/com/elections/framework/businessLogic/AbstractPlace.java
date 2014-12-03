package com.elections.framework.businessLogic;

public abstract class AbstractPlace {
	protected String name;
	protected int idPlace;

	abstract int countVotes(Candidate candidate);

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getIdPlace() {
		return idPlace;
	}

	public void setIdPlace(int idPlace) {
		this.idPlace = idPlace;
	}

}
