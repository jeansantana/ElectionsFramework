package com.elections.framework.dataAccess;

import java.util.ArrayList;

import com.elections.framework.businessLogic.Election;


public class ElectionDAO implements IElectionDAO {
	private static ElectionDAO instance;
	private ArrayList<Election> elections;
	
	public Election getElectionByName(String name){
		for(Election election : elections){
			if(election.getName().equals(name)) return election;
		}
		return null;
	}
	
	public ElectionDAO(){
		elections = new ArrayList<Election>();
	}
	
	public boolean registerElection(Election election){
		elections.add(election);
		return true;
	}
	
	public static ElectionDAO getInstance(){
		if(instance == null) instance = new ElectionDAO();
		return instance;
	}
}
