package fr.dawan.syntaxe_de_base.Transtypage;

public class ConcatenationVariables {

	public static void main(String[] args) {
		
		int n = 15;
		
		//Ex1: Afficher le Le contenu de n est : 15
		System.out.println("Le contenu de n est : " + n);
		
		//Ex2 : 
		//Resultat attendu : Le double de n est 30.
		//Resulat obtenu : Le double de n est 1515.
		System.out.println("Le double de n est " + n+n + ".");
		
		//Ex3 : 
		//Resultat attendu : Le double de n est  30.
		//Resulat obtenu : Le double de n est 30.
		System.out.println("Le double de n est " + (n+n) + ".");
		
		//Ex4 : 	
		//Resultat attendu : 15 est égale à 15.
		//Resulat obtenu : 15 est égale à 15.
		System.out.println(n + " est égale à " + n + ".");
		
		//Ex5 : 
		//Resultat attendu : 30 est le double de n .
		//Resulat obtenu : 30 est le double de n .
		System.out.println(n+n + " est le double de n " + ".");
		
		//Ex6 : 
		//Resultat attendu : Le produit de n * n est 225.
		////Resulat obtenu : Le produit de n * n est 225.
		System.out.println("Le produit de n*n est " + n*n + ".");
		
		
	}

}
