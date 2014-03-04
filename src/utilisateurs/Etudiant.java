package utilisateurs;

import java.util.Calendar;
import java.util.Date;

import medias.Media;

public class Etudiant extends Utilisateur {
	
	public Etudiant(int i, String n, String p, String t, int nbEM) {
		super(i, n, p ,t, nbEM);		
	}

	@Override
	public int emprunter(Media media) {
		
		int valeurEligible = eligibilite(media);
		
		if(valeurEligible == 1)
		{
			// -> Création de l'emprunt
			
			// Récupère la date courante
			Date datedeb = new Date();
			Date datefin;
			
			Calendar cal = Calendar.getInstance();
			cal.add(Calendar.DATE, media.getGenre().getDureeEmprunt());
			datefin = cal.getTime();
			
			faireUnEmprunt(media, datedeb, datefin);			
						
			return 1;
		}
		else // Sinon
		{
			return valeurEligible;
		}		
	}

	@Override
	public int emprunter(Media media, int nbJour) {
		
		int valeurEligible = eligibilite(media);
		
		if(valeurEligible == 1)
		{
			// -> Création de l'emprunt
			
			// Récupère la date courante
			Date datedeb = new Date();
			Date datefin;
			
			Calendar cal = Calendar.getInstance();
			cal.add(Calendar.DATE, nbJour);
			datefin = cal.getTime();
			
			faireUnEmprunt(media, datedeb, datefin);			
						
			return 1;
		}
		else // Sinon
		{
			return valeurEligible;
		}
	}
	
	private void faireUnEmprunt(medias.Media media, Date deb, Date fin)
	{
		this.incrementerNbEmpruntEnCours();
		this.incrementerNbEmpruntNonCommente();
		
		this.addEmprunts(new mediatheque.Emprunt(this,media,deb,fin));
		media.setDisponible(false);
	}

	@Override
	protected int eligibilite(Media media) {
		// Si le nombre d'emprunt en cours est au max
		if(this.getNbEmpruntEnCours() == this.getNbEmpruntMax())
		{
			return 2;
		} // Si le nombre d'emprunt non commenté est au max
		else if(this.getNbEmpruntNonCommente()==this.getNbEmpruntMax())
		{
			return 3 ;
		} // Si le media n'est pas disponible
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
		this.decrementerNbEmpruntNonCommente();
		this.emprunts.get(idEmprunt).getMedia().setDisponible(true);
		
		return 1;
	}
	
	

}
