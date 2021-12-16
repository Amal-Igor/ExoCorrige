package fr.dawan.syntaxe_de_base.exercices;

import java.util.Scanner;

public class ProduitDeuxNombres {

	public static void main(String[] args) {
		
		Scanner clavier = new Scanner(System.in);
		
		System.out.println("Entrer le premier nombre: ");
		double nbre1 = clavier.nextDouble();
		
		System.out.println("Entrer le deuxième nombre: ");
		double nbre2 = clavier.nextDouble();
		
		System.out.println(nbre1 + " x " + nbre2 + " = " + nbre1 * nbre2);
		
	}

}
