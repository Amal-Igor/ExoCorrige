package fr.dawan.tableaux.tableauxdynamique;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		
		/*
		 * L'objectif des tableaux dynamique, dites collections, est de pouvoir créer des tableaux qu'on pourra facilement
		 * modifier, la taille peut augmenter. 
		 * Nous allons utiliser la classe ArrayList pour créer nos tableaux dynamique : 
		 * C'est un objet qui n'a pas de taille limite commes les tableaux fixe. 
		 * La classe ArrayList est utilisée pour les types evolués, complexe non pour les types primitifs
		 * On peut lui affecter entre chevron le type de données qu'il va stocker
		 */
		
		//Tableau de chaine de caractère
		ArrayList<String> tab1 = new ArrayList<String>();
		
		//taille du tableau
		System.out.println(tab1.size());
		
		//Tableau d'entier
		ArrayList<Integer> tab2 = new ArrayList<Integer>();
		
		//ajout un élement dans le tableau
		tab2.add(20);
		
		System.out.println(tab2.get(0));
		
		//set(a, b) : On peut venir modifier un element dans le tableau
		tab2.set(0, 60);
		System.out.println(tab2.get(0));
		
		tab2.add(350);
		tab2.add(980);
		tab2.add(210);
		
		System.out.println("Element à la position 2 : " + tab2.get(2));
		
		
		if(tab2.contains(50)) {
			System.out.println("L'élement 50 est présent dans mon tableau");
		} else {
			System.out.println("L'élement 50 n'est pas présent dans mon tableau");
		}
		
		if(tab2.isEmpty()) {
			System.out.println("Tableau vide");
		} else {
			System.out.println("Element à la position 3 : " + tab2.get(3));
		}
		
		if (tab2.indexOf(621) == -1) {
			System.out.println("L'element 621 n'est pas présent dans mon tableau");
		} else {
			System.out.println("L'element 621 est  présent dans mon tableau");
		}
		
	}

}
