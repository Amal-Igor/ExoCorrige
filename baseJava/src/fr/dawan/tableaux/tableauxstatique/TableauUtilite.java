package fr.dawan.tableaux.tableauxstatique;

import java.util.Scanner;

public class TableauUtilite {
/*
 * Nous verront les tableaux statiques et les tableaux dynamique (collections)
 * 
 * -  Un tableau statique a une taille fixe. On ne peut pas la modfi� une fois d�clar�e
 * 
 * -  Un tableau dynamique nous permet de cr�er des tableaux de taille dynamique
 * 		Nous pouvons augmenter et diminuer sa taille
 * 		Ces tableaux ne peux contenir que des references vers des objets
 * 
 * L'alternative aux tableaux statiques, sont les tableaux dynamiques
 * 
 */
	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);
		
		int age1, age2;
		double moyenne;
		
		System.out.println("Entrer l'age de l'utilisateur 1: ");
		age1 = clavier.nextInt();
		System.out.println("Entrer l'age de l'utilisateur 2: ");
		age2 = clavier.nextInt();
		
		moyenne = (age1 + age2) / 2;
		System.out.println("La moyenne des ages est : " + moyenne);
		
		/*
		 *Remarque : 
		 * Si on a une quantit� importante de donn�e (par exemple 27 utilisateurs)
		 * Il va falloir d�clar� 27 variables, ce qui est trop long, illisible et une perte de temps pour le programmeur
		 * pour resoudre ce probl�me, on va utiliser les tableaux qui permettent de stocker des �l�ments de m�mes types
		 * Par exemple on peut stocker un tableau d'entier, un tableau de chaine de caract�re (String)
		 */
		
	}

}
