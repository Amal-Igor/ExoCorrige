package fr.dawan.boucles;

public class BoucleFor {
	/*
	 * Le role des boucles est repeter un certain nombre de fois les mêmes opérations
	 * Les boucles s'executent tant qu'une condition est remplie
	 */
	public static void main(String[] args) {
		
		/*Exemple 1:  l'utilité des boucles
		 * 
		 * L'ecriture est fastifieuse et longuer, c'est du copié - collé
		 * 
		 * solution :  utiliser les boucles (for, while, do-while)
		 *  
		 */
//		System.out.println("Le double de 1 est : " + 1*2);
//		System.out.println("Le double de 2 est : " + 2*2);
//		System.out.println("Le double de 3 est : " + 3*2);
//		System.out.println("Le double de 4 est : " + 4*2);
//		System.out.println("Le double de 5 est : " + 5*2);
//		System.out.println("Le double de 6 est : " + 6*2);
//		System.out.println("Le double de 7 est : " + 7*2);
//		System.out.println("Le double de 8 est : " + 8*2);
//		System.out.println("Le double de 7 est : " + 9*2);
//		System.out.println("Le double de 8 est : " + 10*2);
		
		
		/*
		 * Solution : Utilisation du boucle For
		 * Le boucle for s'utilise quand on connait le nombre d'iteration (le nombre qu'on executer une instruction)
		 */
		
		for (int i = 1; i <= 10; i++) {
			System.out.println("Le double de " + i + " est " + i*2);
		}
	}

}
