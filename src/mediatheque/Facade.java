package mediatheque;

import java.util.Date;

import scolarite.Cycle;
import scolarite.Matiere;
import medias.Genre;

public interface Facade {

	
	public void addMedia(scolarite.Cours c, Genre g, int i, String n, String a, String r, int d);
	
	public void setMedia(int i, scolarite.Cours c, Genre g, String n, String a, String r, int d);
	
	public void removeMedia(int id);
	
	
	public void addGenre(int i, String n, int de);
	
	public void setGenre(int i, String n, int de);
	
	public void removeGenre(int id);
	
		
	
	public void addUser(int i, String n, String p, String t, int nbEM, int nbENC);
	
	public void setUser(int i, String n, String p, String t, int nbEM, int nbENC);
	
	public void removeUser(int id);
	
	
	public void addAdmin(int i, String n, String p);
	
	public void setAdmin(int i, String n, String p);
	
	public void removeAdmin(int id);
	
	
	public void addCours(Cycle c, Matiere m, utilisateurs.Enseignant p, int i, String n);
	
	public void 
}
