package test;

import java.util.Date;

import controleurs.Controleur;


public class ControleurTest {

	Controleur controleur = new Controleur();
	
	
	public Boolean testAddMedia(int idCours, int idGenre, int idMedia, String n, String a, String r, int d) {
		Boolean valide = controleur.addMedia(idCours, idGenre, idMedia, n, a, r, d);
		
		return valide;
	}
	
	public Boolean testSetMedia(int idCours, int idGenre, int idMedia, String n, String a, String r, int d) {
		Boolean valide = controleur.setMedia(idCours, idGenre, idMedia, n, a, r, d);
				
		return valide;
	}
	
	public Boolean testRemoveMedia(int idMedia) {
		Boolean valide = controleur.removeMedia(idMedia);
				
		return valide;
	}
	
	public String testGetMedia() {
		String res = controleur.getMedia();
		
		return res;
	}
	
	public String testGetMedia(int idMedia) {
		String res = controleur.getMedia(idMedia);
		
		return res;
	}
	
		
	public Boolean testAddGenre(int idGenre, String n, int de) {
		Boolean valide = controleur.addGenre(idGenre, n, de);
				
		return valide;
	}
	
	public Boolean testSetGenre(int idGenre, String n, int de) {
		Boolean valide = controleur.setGenre(idGenre, n, de);
				
		return valide;	
	}
	
	public Boolean testRemoveGenre(int idGenre) {
		Boolean valide = controleur.removeGenre(idGenre);
				
		return valide;
	}
	
	public String testGetGenre() {
		String res = controleur.getGenre();
		
		return res;
	}
	
	public String testGetGenre(int idGenre) {
		String res = controleur.getGenre(idGenre);
		
		return res;
	}
	
	
	public Boolean testAddUser(int idUser, String n, String p, String t, int nbEM, int nbENC) {
		Boolean valide = controleur.addUser(idUser, n, p, t, nbEM, nbENC);
				
		return valide;	
	}
	
	public Boolean testSetUser(int idUser, String n, String p, String t, int nbEM, int nbENC) {
		Boolean valide = controleur.setUser(idUser, n, p, t, nbEM, nbENC);
				
		return valide;
	}
	
	public Boolean testRemoveUser(int idUser) {
		Boolean valide = controleur.removeUser(idUser);
				
		return valide;
	}
	
	public String testGetUser() {
		String res = controleur.getUser();
		
		return res;
	}
	
	public String testGetUser(int idUser) {
		String res = controleur.getUser(idUser);
		
		return res;
	}
		
	
	public Boolean testAddAdmin(int idAdmin, String n, String p) {
		Boolean valide = controleur.addAdmin(idAdmin, n, p);
				
		return valide;
	}
	
	public Boolean testSetAdmin(int idAdmin, String n, String p) {
		Boolean valide = controleur.setAdmin(idAdmin, n, p);
				
		return valide;
	}
	
	public Boolean testRemoveAdmin(int idAdmin) {
		Boolean valide = controleur.removeAdmin(idAdmin);
				
		return valide;
	}
	
	public String testGetAdmin() {
		String res = controleur.getAdmin();
		
		return res;
	}
	
	public String testGetAdmin(int idAdmin) {
		String res = controleur.getAdmin(idAdmin);
		
		return res;
	}
	
	
	public Boolean testAddCours(int idCycle, int idMatiere, int idEnseignant, int idCours, String n) {
		Boolean valide = controleur.addCours(idCycle, idMatiere, idEnseignant, idCours, n);
				
		return valide;
	}
	
	public Boolean testSetCours(int idCycle, int idMatiere, int idEnseignant, int idCours, String n) {
		Boolean valide = controleur.setCours(idCycle, idMatiere, idEnseignant, idCours, n);
				
		return valide;
	}
	
	public Boolean testRemoveCours(int idCours) {
		Boolean valide = controleur.removeCours(idCours);
				
		return valide;
	}
	
	public String testGetCours() {
		String res = controleur.getCours();
		
		return res;
	}
	
	public String testGetCours(int idCours) {
		String res = controleur.getCours(idCours);
		
		return res;
	}
	
	public Boolean testInscrireUserCours(int idUser, int idCours) {
		Boolean valide = controleur.inscrireUserCours(idUser, idCours);
				
		return valide;
	}
	
	public Boolean testDesinscrireUserCours(int idUser, int idCours) {
		Boolean valide = controleur.desinscrireUserCours(idUser, idCours);
				
		return valide;
	}
	
	
	public Boolean testAddCycle(int idCycle, String n) {
		Boolean valide = controleur.addCycle(idCycle, n);
				
		return valide;
	}
	
	public Boolean testSetCycle(int idCycle, String n) {
		Boolean valide = controleur.setCycle(idCycle, n);
				
		return valide;
	}
	
	public Boolean testRemoveCycle(int idCycle) {
		Boolean valide = controleur.removeCycle(idCycle);
				
		return valide;
	}
	
	public String testGetCycle() {
		String res = controleur.getCycle();
		
		return res;
	}
	
	public String testGetCycle(int idCycle) {
		String res = controleur.getCycle(idCycle);
			
		return res;
	}
	
	
	public Boolean testAddMatiere(int idMatiere, String n) {
		Boolean valide = controleur.addMatiere(idMatiere, n);
				
		return valide;
	}
	
	public Boolean testSetMatiere(int idMatiere, String n) {
		Boolean valide = controleur.setMatiere(idMatiere, n);
				
		return valide;
	}
	
	public Boolean testRemoveMatiere(int idMatiere) {
		Boolean valide = controleur.removeMatiere(idMatiere);
				
		return valide;
	}
	
	public String testGetMatiere() {
		String res = controleur.getMatiere();
		
		return res;
	}
	
	public String testGetMatiere(int idMatiere) {
		String res = controleur.getMatiere(idMatiere);
		
		return res;
	}
	
	
	public Boolean testAddProjet(int idCours, int idProjet, String n, String d, Date dd, Date df) {
		Boolean valide = controleur.addProjet(idCours, idProjet, n, d, dd, df);
		
		return valide;
	}
	
	public Boolean testSetProjet(int idCours, int idProjet, String n, String d, Date dd, Date df) {
		Boolean valide = controleur.setProjet(idCours, idProjet, n, d, dd, df);
				
		return valide;
	}
	
	public Boolean testRemoveProjet(int idProjet) {
		Boolean valide = controleur.removeProjet(idProjet);
				
		return valide;
	}
	
	public String testGetProjet() {
		String res = controleur.getProjet();
		
		return res;
	}
	
	public String testGetProjet(int idProjet) {
		String res = controleur.getProjet(idProjet);
		
		return res;
	}
	
	public Boolean testAddEtudiantProjet(int idEtudiant, int idProjet) {
		Boolean valide = controleur.addEtudiantProjet(idEtudiant, idProjet);
				
		return valide;
	}
	
	public Boolean testRemoveEtudiantProjet(int idEtudiant, int idProjet) {
		Boolean valide = controleur.removeEtudiantProjet(idEtudiant, idProjet);
				
		return valide;
	}
	
	
	public Boolean testAddStage(int idProjet, int i, String n, Date dd, Date df) {
		Boolean valide = controleur.addStage(idProjet, i, n, dd, df);
				
		return valide;
	}
	
	public Boolean testSetStage(int idProjet, int i, String n, Date dd, Date df) {
		Boolean valide = controleur.setStage(idProjet, i, n, dd, df);
				
		return valide;
	}
	
	public Boolean testRemoveStage(int idStage) {
		Boolean valide = controleur.removeStage(idStage);
				
		return valide;
	}
	
	public String testGetStage() {
		String res = controleur.getStage();
		
		return res;
	}
	
	public String testGetStage(int idStage) {
		String res = controleur.getStage(idStage);
		
		return res;
	}
	
	
	public Boolean testEmprunter(int idUser, int idMedia, Date de, Date dr) {
		Boolean valide = controleur.emprunter(idUser, idMedia, de, dr);
				
		return valide;
	}
	
	public Boolean testEmprunter(int idUser, int idMedia, Date de, Date dr, int nbJours) {
		Boolean valide = controleur.emprunter(idUser, idMedia, de, dr, nbJours);
				
		return valide;
	}

	
	public Boolean testCommenter(int idUser, int idMedia, int n, String c) {
		Boolean valide = controleur.commenter(idUser, idMedia, n, c);
				
		return valide;
	}

	
	public static String displayFunctionTest(String nameFunction) {
		return "Test " + nameFunction + "\n--->";
	}
	
	
	public static void main() {
		
		ControleurTest testeur = new ControleurTest();
		
		System.out.println("demarrage test Controleur");
		
		System.out.println(displayFunctionTest("addMedia") + testeur.testAddMedia(0, 0, 0, null, null, null, 0) );
		
		System.out.println(displayFunctionTest("setMedia") + testeur.testSetMedia(0, 0, 0, null, null, null, 0) );
		
		System.out.println(displayFunctionTest("removeMedia") + testeur.testRemoveMedia(0) );

		System.out.println(displayFunctionTest("getMedia") + testeur.testGetMedia() );

		System.out.println(displayFunctionTest("getMedia(int idMedia") + testeur.testGetMedia(0) );

		System.out.println(displayFunctionTest("addGenre") + testeur.testAddGenre(0, null, 0) );

		System.out.println(displayFunctionTest("setGenre") + testeur.testSetGenre(0, null, 0) );

		System.out.println(displayFunctionTest("removeGenre") + testeur.testRemoveGenre(0) );
	
		System.out.println(displayFunctionTest("getGenre") + testeur.testGetGenre() );
		
		System.out.println(displayFunctionTest("getGenre(int idGenre)") + testeur.testGetGenre(0) );
		
		System.out.println(displayFunctionTest("addUser") + testeur.testAddUser(0, null, null, null, 0, 0) );
		
		System.out.println(displayFunctionTest("setUser") + testeur.testSetUser(0, null, null, null, 0, 0) );
		
		System.out.println(displayFunctionTest("removeUser") + testeur.testRemoveUser(0) );
		
		System.out.println(displayFunctionTest("getUser") + testeur.testGetUser() );
		
		System.out.println(displayFunctionTest("getUser(int idUser)") + testeur.testGetUser(0) );
		
		System.out.println(displayFunctionTest("addAdmin") + testeur.testAddAdmin(0, null, null) );
		
		System.out.println(displayFunctionTest("setAdmin") + testeur.testSetAdmin(0, null, null) );
		
		System.out.println(displayFunctionTest("removeAdmin") + testeur.testRemoveAdmin(0) );
		
		System.out.println(displayFunctionTest("getAdmin") + testeur.testGetAdmin() );
		
		System.out.println(displayFunctionTest("getAdmin(int idAdmin)") + testeur.testGetAdmin(0) );
		
		System.out.println(displayFunctionTest("addCours") + testeur.testAddCours(0, 0, 0, 0, null) );
		
		System.out.println(displayFunctionTest("setCours") + testeur.testSetCours(0, 0, 0, 0, null) );
		
		System.out.println(displayFunctionTest("removeCours") + testeur.testRemoveCours(0) );
		
		System.out.println(displayFunctionTest("getCours") + testeur.testGetCours() );
		
		System.out.println(displayFunctionTest("getCours(int idCours)") + testeur.testGetCours(0));
		
		System.out.println(displayFunctionTest("inscrireUserCours") + testeur.testInscrireUserCours(0, 0) );
		
		System.out.println(displayFunctionTest("desincrireUserCours") + testeur.testDesinscrireUserCours(0, 0));
		
		System.out.println(displayFunctionTest("addCycle") + testeur.testAddCycle(0, null) );

		System.out.println(displayFunctionTest("setCycle") + testeur.testSetCycle(0, null) );
		
		System.out.println(displayFunctionTest("removeCycle") + testeur.testRemoveCycle(0) );
		
		System.out.println(displayFunctionTest("getCycle") + testeur.testGetCycle() );
		
		System.out.println(displayFunctionTest("getCycle(int idCycle)") + testeur.testGetCycle(0));
		
		System.out.println(displayFunctionTest("addMatiere") + testeur.testAddMatiere(0, null) );
		
		System.out.println(displayFunctionTest("setMatiere") + testeur.testSetMatiere(0, null) );
		
		System.out.println(displayFunctionTest("removeMatiere") + testeur.testRemoveMatiere(0) );
		
		System.out.println(displayFunctionTest("getMatiere") + testeur.testGetMatiere() );
		
		System.out.println(displayFunctionTest("getMatiere(int idMatiere)") + testeur.testGetMatiere(0) );
		
		System.out.println(displayFunctionTest("addProjet") + testeur.testAddProjet(0, 0, null, null, null, null) );
		
		System.out.println(displayFunctionTest("setProjet") + testeur.testSetProjet(0, 0, null, null, null, null) );
		
		System.out.println(displayFunctionTest("removeProjet") + testeur.testRemoveProjet(0) );
		
		System.out.println(displayFunctionTest("getProjet") + testeur.testGetProjet() );
		
		System.out.println(displayFunctionTest("getProjet(int idProjet)") + testeur.testGetProjet(0) );
		
		System.out.println(displayFunctionTest("addEtudiantProjet") + testeur.testAddEtudiantProjet(0, 0) );
		
		System.out.println(displayFunctionTest("removeEtudiantProjet") + testeur.testRemoveEtudiantProjet(0, 0) );
		
		System.out.println(displayFunctionTest("addStage") + testeur.testAddStage(0, 0, null, null, null) );
		
		System.out.println(displayFunctionTest("setStage") + testeur.testSetStage(0, 0, null, null, null) );
		
		System.out.println(displayFunctionTest("removeStage") + testeur.testRemoveStage(0) );
		
		System.out.println(displayFunctionTest("getStage") + testeur.testGetStage() );
		
		System.out.println(displayFunctionTest("getStage(int idStage)") + testeur.testGetStage(0) );
		
		System.out.println(displayFunctionTest("emprunter") + testeur.testEmprunter(0, 0, null, null) );
		
		System.out.println(displayFunctionTest("emprunter(int nbJours") + testeur.testEmprunter(0, 0, null, null, 0) );
		
		System.out.println(displayFunctionTest("commenter") + testeur.testCommenter(0, 0, 0, null) );

	}
	
}
