package fr.dawan.boucles.exercices;

import java.util.Scanner;

public class JeuxPlusOuMoins {

	public static void main(String[] args) {
		
		Scanner clavier = new Scanner(System.in);
		
		//Nombre génerer par l'ordinateur, que l'utilisateur devra trouvé
		int nombre_secret;
		
		//Nombre que l'utilisateur rentrera à chaque fois
		int nombreUtilisateur;
		
		//Permet à l'utilisateur de savoir en combien de coup il a trouvé le nombre
		int nombreDeCoup = 1;
		
		// [0, 1] *999  ==>  [0, 999] + 1 ==>  [1, 1000]
		 nombre_secret = (int) ((Math.random()*999) + 1);
		 
		 do {
			 System.out.println("Entrer un nombre entre 1 et 1000 (1 - 1000)");
			 nombreUtilisateur = clavier.nextInt();
			 
			 if(nombreUtilisateur == nombre_secret) {
				 System.out.println("Trouver en " + nombreDeCoup + " essais ! Bien joué !");
			 }else if(nombreUtilisateur > nombre_secret) {
				 System.out.println("Votre nombre est trop grand ! ");
				 nombreDeCoup++;
			 } else {
				 System.out.println("Votre nombre est trop petit !");
				 nombreDeCoup++;
			 }
			 
		 }while(nombreUtilisateur != nombre_secret);

	}

}
