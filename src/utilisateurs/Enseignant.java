package utilisateurs;

import medias.Media;

public class Enseignant extends Utilisateur {

	public Enseignant(int i, String n, String p, String t, int nbEM) {
		super(i, n, p, t, nbEM);
	}

	@Override
	public int emprunter(Media media) {
		
		
		return 1;
	}

	@Override
	public int emprunter(Media media, int nbjour) {
		return emprunter(media);
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
	
}
