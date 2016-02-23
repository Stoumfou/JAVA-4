package fr.ece.pambourg.exo3.model;

public class Model {
	
	private int nbStudent;
	private String Majeur;
	
	
	
	public Model(int nbStudent, String majeur) {
		super();
		this.nbStudent = nbStudent;
		Majeur = majeur;
	}
	public int getNbStudent() {
		return nbStudent;
	}
	public String getMajeur() {
		return Majeur;
	}
	
	

}
