package scolarite;

import java.util.ArrayList;

public class Cours {
	
	private Cycle cycle;
	private Matiere matiere;
	private ArrayList<Projet> projets;
	private utilisateurs.Enseignant prof;
	private ArrayList<utilisateurs.Etudiant> etudiants;
	
	private int id;
	private String nom;

	
	public Cours(Cycle c, Matiere m, utilisateurs.Enseignant p, int i, String n) {
		cycle = c;
		matiere = m;
		projets = new ArrayList<Projet>();
		prof = p;
		etudiants = new ArrayList<utilisateurs.Etudiant>();
		
		id = i;
		nom = n;
	}


	public Cycle getCycle() {
		return cycle;
	}


	public void setCycle(Cycle cycle) {
		this.cycle = cycle;
	}


	public Matiere getMatiere() {
		return matiere;
	}


	public void setMatiere(Matiere matiere) {
		this.matiere = matiere;
	}


	public ArrayList<Projet> getProjets() {
		return projets;
	}


	public void setProjets(ArrayList<Projet> projets) {
		this.projets = projets;
	}


	public utilisateurs.Enseignant getProf() {
		return prof;
	}


	public void setProf(utilisateurs.Enseignant prof) {
		this.prof = prof;
	}


	public ArrayList<utilisateurs.Etudiant> getEtudiants() {
		return etudiants;
	}


	public void setEtudiants(ArrayList<utilisateurs.Etudiant> etudiants) {
		this.etudiants = etudiants;
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
	
	
}
