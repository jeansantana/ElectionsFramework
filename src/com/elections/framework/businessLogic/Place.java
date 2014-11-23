package com.elections.framework.businessLogic;

public abstract class Place implements IPlace {
	
	protected IPlace parent;
	protected String name;
	protected int idPlace;
	
	public Place() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param parent
	 * @param name
	 * @param idPlace
	 */
	public Place(IPlace parent, String name, int idPlace) {
		this.parent = parent;
		this.name = name;
		this.idPlace = idPlace;
	}

	/**
	 * @return the parent
	 */
	public IPlace getParent() {
		return parent;
	}

	/**
	 * @param parent the parent to set
	 */
	public void setParent(IPlace parent) {
		this.parent = parent;
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

}
