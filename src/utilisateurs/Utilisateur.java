package utilisateurs;

import java.util.ArrayList;
import java.util.Date;

public abstract class Utilisateur {
	
	protected ArrayList<scolarite.Cours> cours;
	protected ArrayList<mediatheque.Emprunt> emprunts;
	
	private int id;
	private String nom;
	private String prenom;
	private String type;
	private int nbEmpruntMax;
	private int nbEmpruntNonCommente;
	private int nbEmpruntEnCours;
	
	public Utilisateur(int i, String n, String p, String t, int nbEM) {
		id = i;
		nom = n;
		prenom = p;
		type = t;
		nbEmpruntMax = nbEM;
		nbEmpruntNonCommente = 0;
		nbEmpruntEnCours = 0;
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
	
	public abstract int emprunter(medias.Media media);
	
	public abstract int emprunter(medias.Media media, int nbjour);
	
	protected abstract int eligibilite(medias.Media media);
	
	public abstract int commenter(int idEmprunt, int n, String com);
	
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

	public int getNbEmpruntEnCours() {
		return nbEmpruntEnCours;
	}

	public void setNbEmpruntEnCours(int nbEmpruntEnCours) {
		this.nbEmpruntEnCours = nbEmpruntEnCours;
	}
	
	public void incrementerNbEmpruntEnCours(){
		this.nbEmpruntEnCours ++;
	}
	
	public void decrementerNbEmpruntEnCours(){
		this.nbEmpruntEnCours --;
	}
	
	public void incrementerNbEmpruntNonCommente(){
		this.nbEmpruntNonCommente ++;
	}
	
	public void decrementerNbEmpruntNonCommente(){
		this.nbEmpruntNonCommente --;
	}
	
	public void addEmprunts(mediatheque.Emprunt emprunt)
	{
		this.emprunts.add(emprunt);
	}
	

}
