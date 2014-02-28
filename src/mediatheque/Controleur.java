package mediatheque;

import java.util.Date;

public class Controleur implements Facade {

	@Override
	public Boolean addMedia(int idCours, int idGenre, int idMedia, String n, String a, String r, int d) {
		return null;
	}

	@Override
	public Boolean setMedia(int idCours, int idGenre, int idMedia, String n, String a, String r, int d) {
		return null;
	}

	@Override
	public Boolean removeMedia(int idMedia) {
		return null;
	}

	@Override
	public String getMedia() {
		return null;
	}

	@Override
	public String getMedia(int idMedia) {
		return null;
	}

	@Override
	public Boolean addGenre(int idGenre, String n, int de) {
		return null;
	}

	@Override
	public Boolean setGenre(int idGenre, String n, int de) {
		return null;
	}

	@Override
	public Boolean removeGenre(int idGenre) {
		return null;
	}

	@Override
	public String getGenre() {
		return null;
	}

	@Override
	public String getGenre(int idGenre) {
		return null;
	}

	@Override
	public Boolean addUser(int idUser, String n, String p, String t, int nbEM, int nbENC) {
		return null;
	}

	@Override
	public Boolean setUser(int idUser, String n, String p, String t, int nbEM, int nbENC) {
		return null;
	}

	@Override
	public Boolean removeUser(int idUser) {
		return null;
	}

	@Override
	public String getUser() {
		return null;
	}

	@Override
	public String getUser(int idUser) {
		return null;
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
