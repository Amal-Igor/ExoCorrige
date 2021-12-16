package fr.dawan.boucles;

import java.util.Scanner;

//Voir framadap pour definition
public class BoucleWhile {

	public static void main(String[] args) {
			
		Scanner clavier = new Scanner(System.in);
		int age = 0;
		
		while(age <= 0) {
			System.out.println("Entrer votre age : ");
			age = clavier.nextInt();
			if(age <= 0) {
				System.out.println("\nL'age doit être positif\n");
			}
		}
		System.out.println("Vous avez " + age + " ans");
	}

}
