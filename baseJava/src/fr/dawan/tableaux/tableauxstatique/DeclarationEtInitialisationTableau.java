package fr.dawan.tableaux.tableauxstatique;

public class DeclarationEtInitialisationTableau {

	public static void main(String[] args) {
		
		/*
		 * Declaration et initialisation : Methode 1
		 * 
		 * Si on connait les different élements du tableau mieux vaut utiliser cette methode
		 */
		int[] tab1; //declaration du tableau
		int[] tab2 = {12, 38, 4, 98, 78}; // Declaration et initialisation
		
		//tab2 contient l'adresse du tableau 
		System.out.println(tab2);
		
		System.out.println(tab2[0]);
		
		System.out.println(tab2[0] + tab2[1]);
		
		/*
		 * Declaration tableau : Methode 2
		 */
		int[] tab = new int[4];
		System.out.println(tab[1]);
		
		tab[0] = 30;
		tab[1] = 3;
		System.out.println(tab[0] + tab[2]);  //affiche 30 
		
	}

}
