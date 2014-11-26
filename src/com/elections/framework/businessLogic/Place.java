package com.elections.framework.businessLogic;

import java.util.List;

public abstract class Place implements IPlace {
	
	protected Place child;
	protected String name;
	protected int idPlace;
	protected List<Candidature> candidatures;//chapas
	
	public Place() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param child
	 * @param name
	 * @param idPlace
	 * @param candidatures
	 */
	public Place(Place child, String name, int idPlace, List<Candidature> candidatures) {
		this.child = child;
		this.name = name;
		this.idPlace = idPlace;
		this.candidatures = candidatures;
	}
	
	public List<Candidature> getCandidatures() {
		return candidatures;
	}
	
	public void setCandidatures(List<Candidature> candidatures) {
		this.candidatures = candidatures;
	}

	/**
	 * @return the parent
	 */
	public Place getParent() {
		return child;
	}

	/**
	 * @param parent the parent to set
	 */
	public void setParent(Place parent) {
		this.child = parent;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the idPlace
	 */
	public int getIdPlace() {
		return idPlace;
	}

	/**
	 * @param idPlace the idPlace to set
	 */
	public void setIdPlace(int idPlace) {
		this.idPlace = idPlace;
	}
	
	@Override
	public void add(Place place) {
				
	}
	//The simplest place has nulll child. The places that have child 
	@Override
	public int getCountVotes() {
		// TODO Auto-generated method stub
		return 0;
	}

}
