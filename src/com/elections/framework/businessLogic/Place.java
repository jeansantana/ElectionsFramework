package com.elections.framework.businessLogic;

import java.util.List;

public abstract class Place implements IPlace {
	
	protected Place child;
	protected String typePlace;// must be unique
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
	public Place(String name, String typePlace, int idPlace, List<Candidature> candidatures, Place child) {
		this.child = child;
		this.name = name;
		this.idPlace = idPlace;
		this.candidatures = candidatures;
		this.typePlace = typePlace;
	}
	
	public String getTypePlace() {
		return typePlace;
	}
	
	public void setTypePlace(String typePlace) {
		this.typePlace = typePlace;
	}
	
	public List<Candidature> getCandidatures() {
		return candidatures;
	}
	
	public void setCandidatures(List<Candidature> candidatures) {
		this.candidatures = candidatures;
	}
	
	@Override
	public Place getChild() {
		// TODO Auto-generated method stub
		return child;
	}
	
	public void setChild(Place child) {
		this.child = child;
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

}
