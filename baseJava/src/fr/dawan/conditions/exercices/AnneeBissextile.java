package fr.dawan.conditions.exercices;

import java.util.Scanner;

public class AnneeBissextile {

	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);
		
		int annee;
		
		//Fournir les données d'entrée
		System.out.println("Saisir une année : ");
		annee = clavier.nextInt();
		
		if(((annee % 4 == 0) && (annee % 100 != 0)) || (annee % 400 == 0)) {
			System.out.println(annee + " est une année bissextile");
		} else {
			System.out.println("Année simple");
		}

	}

}
