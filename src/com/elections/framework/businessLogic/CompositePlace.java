package com.elections.framework.businessLogic;

import java.util.List;

public class CompositePlace implements IPlace{

	protected List<IPlace> childs;
	protected String typePlace;// must be unique
	protected String name;
	protected int idPlace;
	
	@Override
	public int countVotes() {
		int total = 0;
		for (IPlace place : childs) {
			total += place.countVotes();
		}
		return total;
	}	
	
	public CompositePlace() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param child
	 * @param name
	 * @param idPlace
	 * @param candidatures
	 */
	public CompositePlace(String name, String typePlace, int idPlace, List<IPlace> childs) {
		this.childs = childs;
		this.name = name;
		this.idPlace = idPlace;
		this.typePlace = typePlace;
	}
	
	public String getTypePlace() {
		return typePlace;
	}
	
	public void setTypePlace(String typePlace) {
		this.typePlace = typePlace;
	}
	

	public List<IPlace> getChilds() {
		// TODO Auto-generated method stub
		return childs;
	}
	
	public void setChild(List<IPlace> child) {
		this.childs = child;
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
	

	public void add(Place place) {
		childs.add(place);
	}

	


}
