package controleurs;

import java.util.Date;

import utilisateurs.Utilisateur;
import mediatheque.Facade;


public class Controleur implements Facade {

	ControleurMedia 	controleurMedia 	= new ControleurMedia();
	ControleurGenre 	controleurGenre 	= new ControleurGenre();
	ControleurUser 		controleurUser 		= new ControleurUser();
	ControleurAdmin 	controleurAdmin 	= new ControleurAdmin();
	ControleurCours 	controleurCours 	= new ControleurCours();
	ControleurCycle 	controleurCycle 	= new ControleurCycle();
	ControleurMatiere 	controleurMatiere 	= new ControleurMatiere();
	ControleurProjet 	controleurProjet 	= new ControleurProjet();
	ControleurStage 	controleurStage 	= new ControleurStage();
	
	@Override
	public Boolean addMedia(int idCours, int idGenre, int idMedia, String n, String a, String r, int d) {
		return controleurMedia.addMedia(idCours, idGenre, idMedia, n, a, r, d);
	}

	@Override
	public Boolean setMedia(int idCours, int idGenre, int idMedia, String n, String a, String r, int d) {
		return controleurMedia.setMedia(idCours, idGenre, idMedia, n, a, r, d);
	}

	@Override
	public Boolean removeMedia(int idMedia) {
		return controleurMedia.removeMedia(idMedia);
	}

	@Override
	public String getMedia() {
		return controleurMedia.getMedia();
	}

	@Override
	public String getMedia(int idMedia) {
		return controleurMedia.getMedia(idMedia);
	}

	
	@Override
	public Boolean addGenre(int idGenre, String n, int de) {
		return controleurGenre.addGenre(idGenre, n, de);
	}

	@Override
	public Boolean setGenre(int idGenre, String n, int de) {
		return controleurGenre.setGenre(idGenre, n, de);
	}

	@Override
	public Boolean removeGenre(int idGenre) {
		return controleurGenre.removeGenre(idGenre);
	}

	@Override
	public String getGenre() {
		return controleurGenre.getGenre();
	}

	@Override
	public String getGenre(int idGenre) {
		return controleurGenre.getGenre(idGenre);
	}

	
	@Override
	public Boolean addUser(int idUser, String n, String p, String t, int nbEM, int nbENC) {
		return controleurUser.addUser(idUser, n, p, t, nbEM, nbENC);
	}

	@Override
	public Boolean setUser(int idUser, String n, String p, String t, int nbEM, int nbENC) {
		return controleurUser.setUser(idUser, n, p, t, nbEM, nbENC);
	}

	@Override
	public Boolean removeUser(int idUser) {
		return controleurUser.removeUser(idUser);
	}

	@Override
	public String getUser() {
		return controleurUser.getUser();
	}

	@Override
	public String getUser(int idUser) {
		return controleurUser.getUser(idUser);
	}

	
	@Override
	public Boolean addAdmin(int idAdmin, String n, String p) {
		return null;
	}

	@Override
	public Boolean setAdmin(int idAdmin, String n, String p) {
		return null;
	}

	@Override
	public Boolean removeAdmin(int idAdmin) {
		return null;
	}

	@Override
	public String getAdmin() {
		return null;
	}

	@Override
	public String getAdmin(int idAdmin) {
		return null;
	}

	
	@Override
	public Boolean addCours(int idCycle, int idMatiere, int idEnseignant, int idCours, String n) {
		return null;
	}

	@Override
	public Boolean setCours(int idCycle, int idMatiere, int idEnseignant, int idCours, String n) {
		return null;
	}

	@Override
	public Boolean removeCours(int idCours) {
		return null;
	}

	@Override
	public String getCours() {
		return null;
	}

	@Override
	public String getCours(int idCours) {
		return null;
	}

	@Override
	public Boolean inscrireUserCours(int idUser, int idCours) {
		return null;
	}

	@Override
	public Boolean desinscrireUserCours(int idUser, int idCours) {
		return null;
	}

	
	@Override
	public Boolean addCycle(int idCycle, String n) {
		return null;
	}

	@Override
	public Boolean setCycle(int idCycle, String n) {
		return null;
	}

	@Override
	public Boolean removeCycle(int idCycle) {
		return null;
	}

	@Override
	public String getCycle() {
		return null;
	}

	@Override
	public String getCycle(int idCycle) {
		return null;
	}

	
	@Override
	public Boolean addMatiere(int idMatiere, String n) {
		return null;
	}

	@Override
	public Boolean setMatiere(int idMatiere, String n) {
		return null;
	}

	@Override
	public Boolean removeMatiere(int idMatiere) {
		return null;
	}

	@Override
	public String getMatiere() {
		return null;
	}

	@Override
	public String getMatiere(int idMatiere) {
		return null;
	}

	
	@Override
	public Boolean addProjet(int idCours, int idProject, String n, String d,
			Date dd, Date df) {
		return null;
	}

	@Override
	public Boolean setProject(int idCours, int idProject, String n, String d,
			Date dd, Date df) {
		return null;
	}

	@Override
	public Boolean removeProject(int idProject) {
		return null;
	}

	@Override
	public String getProject() {
		return null;
	}

	@Override
	public String getProject(int idProject) {
		return null;
	}

	@Override
	public Boolean addEtudiantProject(int idEtudiant, int idProject) {
		return null;
	}

	@Override
	public Boolean removeEtudiantProject(int idEtudiant, int idProject) {
		return null;
	}
	

	@Override
	public Boolean addStage(int idProject, int i, String n, Date dd, Date df) {
		return null;
	}

	@Override
	public Boolean setStage(int idProject, int i, String n, Date dd, Date df) {
		return null;
	}

	@Override
	public Boolean removeStage(int idStage) {
		return null;
	}

	@Override
	public String getStage() {
		return null;
	}

	@Override
	public String getStage(int idStage) {
		return null;
	}

	
	@Override
	public Boolean emprunter(int idUser, int idMedia, Date de, Date dr) {
		return null;
	}
	
	@Override
	public Boolean emprunter(int idUser, int idMedia, Date de, Date dr, int nbJours) {
		return null;
	}

	@Override
	public Boolean commenter(int idUser, int idMedia, int n, String c) {
		return null;
	}

	
}
