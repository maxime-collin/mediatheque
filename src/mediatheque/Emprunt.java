package mediatheque;

import java.util.Date;

public class Emprunt {

	private utilisateurs.Utilisateur emprunteur;
	private medias.Media media;
	
	private int note;
	private String commentaire;
	private Date dateEmprunt;
	private Date dateRetour;
	
	public Emprunt(utilisateurs.Utilisateur e, medias.Media m, int n, String c, Date de, Date dr) {
		emprunteur = e;
		media = m;
		
		note = n;
		commentaire = c;
		dateEmprunt = de;
		dateRetour = dr;
	}

	public utilisateurs.Utilisateur getEmprunteur() {
		return emprunteur;
	}

	public void setEmprunteur(utilisateurs.Utilisateur emprunteur) {
		this.emprunteur = emprunteur;
	}

	public medias.Media getMedia() {
		return media;
	}

	public void setMedia(medias.Media media) {
		this.media = media;
	}

	public int getNote() {
		return note;
	}

	public void setNote(int note) {
		this.note = note;
	}

	public String getCommentaire() {
		return commentaire;
	}

	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}

	public Date getDateEmprunt() {
		return dateEmprunt;
	}

	public void setDateEmprunt(Date dateEmprunt) {
		this.dateEmprunt = dateEmprunt;
	}

	public Date getDateRetour() {
		return dateRetour;
	}

	public void setDateRetour(Date dateRetour) {
		this.dateRetour = dateRetour;
	}
}
