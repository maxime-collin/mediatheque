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
		return controleurAdmin.addAdmin(idAdmin, n, p);
	}

	@Override
	public Boolean setAdmin(int idAdmin, String n, String p) {
		return controleurAdmin.setAdmin(idAdmin, n, p);
	}

	@Override
	public Boolean removeAdmin(int idAdmin) {
		return controleurAdmin.removeAdmin(idAdmin);
	}

	@Override
	public String getAdmin() {
		return controleurAdmin.getAdmin();
	}

	@Override
	public String getAdmin(int idAdmin) {
		return controleurAdmin.getAdmin(idAdmin);
	}

	
	@Override
	public Boolean addCours(int idCycle, int idMatiere, int idEnseignant, int idCours, String n) {
		return controleurCours.addCours(idCycle, idMatiere, idEnseignant, idCours, n);
	}

	@Override
	public Boolean setCours(int idCycle, int idMatiere, int idEnseignant, int idCours, String n) {
		return controleurCours.setCours(idCycle, idMatiere, idEnseignant, idCours, n);
	}

	@Override
	public Boolean removeCours(int idCours) {
		return controleurCours.removeCours(idCours);
	}

	@Override
	public String getCours() {
		return controleurCours.getCours();
	}

	@Override
	public String getCours(int idCours) {
		return controleurCours.getCours(idCours);
	}

	@Override
	public Boolean inscrireUserCours(int idUser, int idCours) {
		return controleurCours.inscrireUserCours(idUser, idCours);
	}

	@Override
	public Boolean desinscrireUserCours(int idUser, int idCours) {
		return controleurCours.desinscrireUserCours(idUser, idCours);
	}

	
	@Override
	public Boolean addCycle(int idCycle, String n) {
		return controleurCycle.addCycle(idCycle, n);
	}

	@Override
	public Boolean setCycle(int idCycle, String n) {
		return controleurCycle.setCycle(idCycle, n);
	}

	@Override
	public Boolean removeCycle(int idCycle) {
		return controleurCycle.removeCycle(idCycle);
	}

	@Override
	public String getCycle() {
		return controleurCycle.getCycle();
	}

	@Override
	public String getCycle(int idCycle) {
		return controleurCycle.getCycle(idCycle);
	}

	
	@Override
	public Boolean addMatiere(int idMatiere, String n) {
		return controleurMatiere.addMatiere(idMatiere, n);
	}

	@Override
	public Boolean setMatiere(int idMatiere, String n) {
		return controleurMatiere.setMatiere(idMatiere, n);
	}

	@Override
	public Boolean removeMatiere(int idMatiere) {
		return controleurMatiere.removeMatiere(idMatiere);
	}

	@Override
	public String getMatiere() {
		return controleurMatiere.getMatiere();
	}

	@Override
	public String getMatiere(int idMatiere) {
		return controleurMatiere.getMatiere(idMatiere);
	}

	
	@Override
	public Boolean addProjet(int idCours, int idProjet, String n, String d,	Date dd, Date df) {
		return controleurProjet.addProjet(idCours, idProjet, n, d, dd, df);
	}

	@Override
	public Boolean setProjet(int idCours, int idProjet, String n, String d,	Date dd, Date df) {
		return controleurProjet.setProjet(idCours, idProjet, n, d, dd, df);
	}

	@Override
	public Boolean removeProjet(int idProjet) {
		return controleurProjet.removeProjet(idProjet);
	}

	@Override
	public String getProjet() {
		return controleurProjet.getProjet();
	}

	@Override
	public String getProjet(int idProjet) {
		return controleurProjet.getProjet(idProjet);
	}

	@Override
	public Boolean addEtudiantProjet(int idEtudiant, int idProjet) {
		return controleurProjet.addEtudiantProjet(idEtudiant, idProjet);
	}

	@Override
	public Boolean removeEtudiantProjet(int idEtudiant, int idProjet) {
		return controleurProjet.removeEtudiantProjet(idEtudiant, idProjet);
	}
	

	@Override
	public Boolean addStage(int idProjet, int idStage, String n, Date dd, Date df) {
		return controleurStage.addStage(idProjet, idStage, n, dd, df);
	}

	@Override
	public Boolean setStage(int idProjet, int idStage, String n, Date dd, Date df) {
		return controleurStage.setStage(idProjet, idStage, n, dd, df);
	}

	@Override
	public Boolean removeStage(int idStage) {
		return controleurStage.removeStage(idStage);
	}

	@Override
	public String getStage() {
		return controleurStage.getStage();
	}

	@Override
	public String getStage(int idStage) {
		return controleurStage.getStage(idStage);
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
