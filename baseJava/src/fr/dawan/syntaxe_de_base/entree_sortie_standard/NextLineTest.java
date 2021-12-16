package fr.dawan.syntaxe_de_base.entree_sortie_standard;

import java.util.Scanner;

public class NextLineTest {

	static Scanner clavier = new Scanner(System.in);
	public static void main(String[] args) {
		/*
		 * La methode NextLine permet de lire une ligne de texte jusqu'au prochain retour à la ligne
		 * 
		 */
		
		int n = 0;
		String str1 = "";
		String str2 = "";
		
		System.out.println("Entrer un entier: ");
		n = clavier.nextInt();
		
		//Solution pour eviter de lire les caractère juste après l'entier récuperé par n = clavier.nextInt(); 
		clavier.nextLine();
		
		System.out.println("Entrer du texte : ");
		str1 = clavier.nextLine();
		
		System.out.println("Entrer du texte : ");
		str2 = clavier.nextLine();
		
		//On affiche le contenu entré par l'utilisateur
		System.out.println("n = " + n);
		System.out.println("str1 = " + str1);
		System.out.println("str2 = " + str2);
		
	}

}
