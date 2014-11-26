package com.elections.framework.businessLogic;

public interface IPlace {
	void add(Place place);
	Place remove();
	Place getChild();
	int getCountVotes();
}
