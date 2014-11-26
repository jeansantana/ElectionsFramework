package com.elections.framework.businessLogic;

import java.util.List;

public class Report {
	
	protected String title;
	protected List<Place> places;
	
	public Report() {
		// TODO Auto-generated constructor stub
	}

	public Report(String title, List<Place> places) {
		this.title = title;
		this.places = places;
	}

	/**
	 * @return the places
	 */
	public List<Place> getPlaces() {
		return places;
	}

	/**
	 * @param places the places to set
	 */
	public void setPlaces(List<Place> places) {
		this.places = places;
	}
	
	
}
