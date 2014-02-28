package medias;

public class Genre {
	private int id;
	private String nom;
	private int dureeEmprunt;
	
	
	public Genre(int i, String n, int de) {
		id = i;
		nom = n;
		dureeEmprunt = de;
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


	public int getDureeEmprunt() {
		return dureeEmprunt;
	}


	public void setDureeEmprunt(int dureeEmprunt) {
		this.dureeEmprunt = dureeEmprunt;
	}
}
