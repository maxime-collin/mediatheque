package utilisateurs;

public class Etudiant extends Utilisateur {
	
	public Etudiant(int i, String n, String p, String t, int nbEM, int nbENC) {
		super(i, n, p ,t, nbEM, nbENC);		
	}

	@Override
	public void emprunter(medias.Media media) {
		// TODO Auto-generated method stub
		
	}

}
