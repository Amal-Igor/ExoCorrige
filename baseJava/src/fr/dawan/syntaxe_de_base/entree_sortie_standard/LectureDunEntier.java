package fr.dawan.syntaxe_de_base.entree_sortie_standard;

import java.util.Scanner;

public class LectureDunEntier {

	public static void main(String[] args) {
		
		Scanner clavier = new Scanner(System.in);
		
		int n = 0;
		
		System.out.print("Entrez un nombre : ");
		n = clavier.nextInt();
		
		System.out.println("le carré de " + n + " est " + n*n);

	}

}
