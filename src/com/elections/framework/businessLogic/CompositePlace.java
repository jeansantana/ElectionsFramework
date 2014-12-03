package com.elections.framework.businessLogic;

import java.util.ArrayList;
import java.util.List;

public class CompositePlace extends AbstractPlace{

	protected List<AbstractPlace> childs;
	
	public CompositePlace(String name, int idPlace) {
		childs = new ArrayList<AbstractPlace>();
		this.name = name;
		this.idPlace = idPlace;
	}
	
	public void add(Place place) {
		childs.add(place);
	}
	
	@Override
	public int countVotes(Candidate candidate) {
		int total = 0;
		for (AbstractPlace place : childs) {
			total += place.countVotes(candidate);
		}
		return total;
	}

	public List<AbstractPlace> getChilds() {
		// TODO Auto-generated method stub
		return childs;
	}
	
	public void setChild(List<AbstractPlace> child) {
		this.childs = child;
	}

}
