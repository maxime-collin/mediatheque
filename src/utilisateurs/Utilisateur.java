package utilisateurs;

import java.util.ArrayList;

public abstract class Utilisateur {
	
	private ArrayList<scolarite.Cours> cours;
	private ArrayList<mediatheque.Emprunt> emprunts;
	
	private int id;
	private String nom;
	private String prenom;
	private String type;
	private int nbEmpruntMax;
	private int nbEmpruntNonCommente;
	
	public Utilisateur(int i, String n, String p, String t, int nbEM, int nbENC) {
		id = i;
		nom = n;
		prenom = p;
		type = t;
		nbEmpruntMax = nbEM;
		nbEmpruntNonCommente = nbENC;
	}
	
	public ArrayList<scolarite.Cours> getCours() {
		return cours;
	}

	public void setCours(ArrayList<scolarite.Cours> cours) {
		this.cours = cours;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public abstract void emprunter(medias.Media media);

	public int getNbEmpruntMax() {
		return nbEmpruntMax;
	}

	public void setNbEmpruntMax(int nbEmpruntMax) {
		this.nbEmpruntMax = nbEmpruntMax;
	}

	public int getNbEmpruntNonCommente() {
		return nbEmpruntNonCommente;
	}

	public void setNbEmpruntNonCommente(int nbEmpruntNonCommente) {
		this.nbEmpruntNonCommente = nbEmpruntNonCommente;
	}

	public ArrayList<mediatheque.Emprunt> getEmprunts() {
		return emprunts;
	}

	public void setEmprunts(ArrayList<mediatheque.Emprunt> emprunts) {
		this.emprunts = emprunts;
	}

}
