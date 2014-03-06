package utilisateurs;

import java.util.ArrayList;

import medias.Media;

public class Enseignant extends Utilisateur {
	
	private ArrayList<emprunt.Emprunt> NotificationEmprunts;

	public Enseignant(int i, String n, String p, String t, int nbEM) {
		super(i, n, p, t, nbEM);
	}

	@Override
	protected int eligibilite(Media media) {
		// Si le nombre d'emprunt en cours est au max
		if(this.getNbEmpruntEnCours() == this.getNbEmpruntMax())
		{
			return 2;
		} 
		else if(media.isDisponible() == false)
		{
			return 4;
		}
		
		return 1;
	}

	@Override
	public int commenter(int idEmprunt, int n, String com) {
		this.emprunts.get(idEmprunt).setCommentaire(com);
		this.emprunts.get(idEmprunt).setNote(n);
		
		this.decrementerNbEmpruntEnCours();
		this.emprunts.get(idEmprunt).getMedia().setDisponible(true);
		
		return 1;
	}

	@Override
	public void VerifierLesEmprunts() {
		
	}

	public void addAlerteEmprunt(emprunt.Emprunt emprunt) {
		if(!this.NotificationEmprunts.contains(emprunt))
				this.NotificationEmprunts.add(emprunt);		
	}

	public ArrayList<emprunt.Emprunt> getNotificationEmprunts() {
		return NotificationEmprunts;
	}

	public void setNotificationEmprunts(
			ArrayList<emprunt.Emprunt> notificationEmprunts) {
		NotificationEmprunts = notificationEmprunts;
	}
	
	public String toString() {
		String res = "";

		res += getId() + " ";
		res += getNom() + " ";
		res += getPrenom() + " ";
		res += getType() + "\n";
		
		res += "cours : ";
		for (int i = 0; i < getCours().size(); i++)
			res += getCours().get(i) + " ";
		res += "\n";
		
		res += "emprunts : ";
		for (int i = 0; i < getEmprunts().size(); i++)
			res += getEmprunts().get(i) + " ";
		res += "\n";
		
		res += "nbEmpruntMax : " + getNbEmpruntMax() + "\n";
		res += "nbEmpruntEnCours : " + getNbEmpruntEnCours() + "\n";
		
		return res;
	}
	
}
