package fr.dawan.boucles;

import java.util.Scanner;

public class BoucleDoWhile {

	/*
	 * DO-WHILE : 
	 * Permet de repeter des instructions tant qu'une condition n'est pas verifiée. 
	 * Comme la condition est testée à la fin, on est sûre de passer dans le bloc d'instruction au moins une fois
	 */
	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);
		int age = 0;
		
		do {
			System.out.println("Entrer votre age : ");
			age = clavier.nextInt();
		} while(age <= 0);
		
		System.out.println("Vous avez " + age + " ans");
		
		
		/*
		 * Conclusion : 
		 * Contrairement à la boucle for, on ne connait pas le nombre de fois que ce bloc d'instruction va se repeter
		 * Si vous connaissez le nombre d'itération de preferable utilisé la boucle FOR, dans le cas contraire
		 * utilisé les boucles WHILE ou DO-WHILE
		 */
	}

}
