package com.elections.framework.businessLogic;

import java.util.List;

public abstract class Place implements IPlace {
	
	protected List<Candidature> candidatures;//chapas
	
	public List<Candidature> getCandidatures() {
		return candidatures;
	}
	
	public void setCandidatures(List<Candidature> candidatures) {
		this.candidatures = candidatures;
	}
	
}
