package utilisateurs;

import java.util.ArrayList;

public abstract class Utilisateur {
	
	private ArrayList<scolarite.Cours> cours;
	private int id;
	private String nom;
	private String prenom;
	
	
	public Utilisateur(int i, String n, String p) {
		id = i;
		nom = n;
		prenom = p;
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
	
	
	public abstract void emprunter(medias.Media media);

}
