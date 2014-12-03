package com.elections.framework.businessLogic;

public class Candidature {
	
	private Candidate candidate;
	private Candidate viceCandidate;
	private int qttvotes;
	
	public Candidature() {}
	
	/**
	 * Use this when candidate have vice-candidate
	 * */
	public Candidature(Candidate candidate, Candidate viceCandidate) {
		this.candidate = candidate;
		this.viceCandidate = viceCandidate;
		this.qttvotes = 0;
	}
	/**
	 * Use this when candidate don't have vice-candidate
	 * */
	public Candidature(Candidate candidate) {
		this.candidate = candidate;
		this.qttvotes = 0;
		this.viceCandidate = null;
	}

	/**
	 * @return the candidate
	 */
	public Candidate getCandidate() {
		return candidate;
	}

	/**
	 * @param candidate the candidate to set
	 */
	public void setCandidate(Candidate candidate) {
		this.candidate = candidate;
	}

	/**
	 * @return the viceCandidate
	 */
	public Candidate getViceCandidate() {
		return viceCandidate;
	}

	/**
	 * @param viceCandidate the viceCandidate to set
	 */
	public void setViceCandidate(Candidate viceCandidate) {
		this.viceCandidate = viceCandidate;
	}

	/**
	 * @return the qttvotes
	 */
	public int getQttvotes() {
		return qttvotes;
	}

	/**
	 * @param qttvotes the qttvotes to set
	 */
	public void setQttvotes(int qttvotes) {
		this.qttvotes = qttvotes;
	}
	
}
