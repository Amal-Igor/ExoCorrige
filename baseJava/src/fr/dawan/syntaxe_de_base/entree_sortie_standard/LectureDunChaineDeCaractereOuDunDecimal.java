package fr.dawan.syntaxe_de_base.entree_sortie_standard;

import java.util.Scanner;


public class LectureDunChaineDeCaractereOuDunDecimal {

	static Scanner clavierDouble = new Scanner(System.in);
	static Scanner clavierChaine = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		double var1 = 0.0;
		String chaine = "";
		
		System.out.print("Entrer un nombre r?el : ");
		var1 = clavierDouble.nextDouble();
		System.out.println("Vous avez entr? : " + var1);
		
		System.out.print("Entrer une chaine de caract?re : ");
		chaine = clavierChaine.nextLine();
		System.out.println("Vous avez entr?: " + chaine);
	}

}
