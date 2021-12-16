package fr.dawan.conditions;

import java.util.Scanner;

public class OperateursLogiques {

	public static void main(String[] args) {
		/*
		 * Les operateurs logiques s'appliquent sur des opérandes booléens et produisent un resultat qui 
		 * est egalement booléen
		 * 
		 * Java comporte trois opérateurs logiques, dont une unaire et deux binaire
		 * 
		 * A&&B	est vraie (true) si A est vraie et B est vraie sinon c'est faux
		 * A||B est vraie si un des operandes est vraie sinon faux
		 * !A   ==> A est vraie alors !A est faux
		 * 
		 * 
		 * Table logique		
		 * A	B				A&&B			A||B		!A 				
		 * v	v				 v                v          f
		 * v	f				 f                v          f
		 * f	v                f                v          v
		 * f	f                f                f          v
		 */
		
		Scanner clavier = new Scanner(System.in);
		
		//Test les opérateurs ET(&&) et OU(||)
		int a, b, c;
		int nbre = 0;   //Pour tester l'operateur non (!)
		
		//Fournir les données
		System.out.println("Entrer la valeur de a : ");
		a = clavier.nextInt();	
		System.out.println("Entrer la valeur de b : ");
		b = clavier.nextInt();	
		System.out.println("Entrer la valeur de c : ");
		c = clavier.nextInt();
		
//		//Test OU :  il faut au moins que une des deux conditions soient vraie
//		//Test avec des nombres différent a=4, b=6 c=7
//		//Test 5, 5, 3
//		if(a == b || b == c) {
//			System.out.println("Deux valeurs sont au moins identiques \n");
//		}
//		
		
		//Test ET : Il faut que les deux conditions soient vraient 
		//Test 5, 5, 3  (Test return false)
		//Test 8, 8, 8 (Test return true)
		if(a == b && b == c ) {
			System.out.println("Les trois valeurs sont identiques");
		}
		
		//opérateur Non (!)
		System.out.println("\nTest de l'operateur NON \"!\"");
		System.out.println("Entrer un nombre");
		nbre = clavier.nextInt();
		
		if(nbre > 0) {
			System.out.println("Le nombre rentré est positif");
		}
		
		//Avec l'opérateur logique non
		//!VRAIE = FALSE
		//!FALSE = VRAIE
		if(!(nbre > 0)) {
			System.out.println("Le nombre rentré est négatif");
		}
		
	}

}
