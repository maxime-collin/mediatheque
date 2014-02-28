package test;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import scolarite.Cours;
import scolarite.Cycle;
import scolarite.Matiere;
import utilisateurs.Enseignant;
import utilisateurs.Etudiant;
import medias.Genre;
import medias.Media;

public class main {

	public static void main(String[] args) {
		
		//Création de genres
		Genre livre = new Genre(1,"Livre", 14);
		Genre film = new Genre(2,"Film", 7);
		Genre documentaire = new Genre(3,"Documentaire", 14);
		
		//Création de cycle
		Cycle l3 = new Cycle(1,"L3");
		Cycle m1 = new Cycle(2,"M1");
		
		//Création de Matière
		Matiere idl = new Matiere(1, "IDL");
		Matiere occam = new Matiere(2, "OCCAM");
		
		//Création d'enseignant
		Enseignant fabiani = new Enseignant(0,"FABIANI","Erwan","Enseignant",10); 
		Enseignant gire = new Enseignant(0,"GIRE","Sophie","Enseignant",10);		
		
		// Création d'utilisateurs
		Etudiant e1 = new Etudiant(1,"VISBECQ","Romain alias Le BG","Etudiant",5);
		Etudiant e2 = new Etudiant(2,"FRIANT","Jérémy","Etudiant",5);
		Etudiant e3 = new Etudiant(3,"MONNIER","Alexandre","Etudiant",5);
		Etudiant e4 = new Etudiant(4,"COLLIN","Maxime","Etudiant",5);
		
		//Création de cours
		Cours c1 = new Cours(m1,occam,fabiani,1,"Occam : algorithmes distribués");
		Cours c2 = new Cours(m1,idl,gire,1,"Compilation : JFlex");
		
		//Création de média
		Media med1 = new Media(c1,livre,1,"OCCAM : initiation","Erwan Fabiani","La vie passsionante que l'on peut avoir avec l'OCCAM !!!",0);
		Media med2 = new Media(c2,film,2,"Compilation","Gire","Les méfaits du bug sur la compil'",180);
		Media med3 = new Media(c2,documentaire,3,"Compilation2","Bob","resume2",0);
		Media med4 = new Media(c1,documentaire,3,"OCCAM2","Jacques","resume2",0);
		Media med5 = new Media(c2,documentaire,3,"Compilation3","Bob","resume3",0);
		Media med6 = new Media(c1,documentaire,3,"Compilation2","Bob","resume2",0);
		Media med7 = new Media(c2,documentaire,3,"Compilation2","Bob","resume2",0);
		
		//
		
		
		
	}

}
