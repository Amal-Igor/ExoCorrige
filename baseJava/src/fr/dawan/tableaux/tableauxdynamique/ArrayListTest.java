package fr.dawan.tableaux.tableauxdynamique;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		
		/*
		 * L'objectif des tableaux dynamique, dites collections, est de pouvoir cr�er des tableaux qu'on pourra facilement
		 * modifier, la taille peut augmenter. 
		 * Nous allons utiliser la classe ArrayList pour cr�er nos tableaux dynamique : 
		 * C'est un objet qui n'a pas de taille limite commes les tableaux fixe. 
		 * La classe ArrayList est utilis�e pour les types evolu�s, complexe non pour les types primitifs
		 * On peut lui affecter entre chevron le type de donn�es qu'il va stocker
		 */
		
		//Tableau de chaine de caract�re
		ArrayList<String> tab1 = new ArrayList<String>();
		
		//taille du tableau
		System.out.println(tab1.size());
		
		//Tableau d'entier
		ArrayList<Integer> tab2 = new ArrayList<Integer>();
		
		//ajout un �lement dans le tableau
		tab2.add(20);
		
		System.out.println(tab2.get(0));
		
		//set(a, b) : On peut venir modifier un element dans le tableau
		tab2.set(0, 60);
		System.out.println(tab2.get(0));
		
		tab2.add(350);
		tab2.add(980);
		tab2.add(210);
		
		System.out.println("Element � la position 2 : " + tab2.get(2));
		
		
		if(tab2.contains(50)) {
			System.out.println("L'�lement 50 est pr�sent dans mon tableau");
		} else {
			System.out.println("L'�lement 50 n'est pas pr�sent dans mon tableau");
		}
		
		if(tab2.isEmpty()) {
			System.out.println("Tableau vide");
		} else {
			System.out.println("Element � la position 3 : " + tab2.get(3));
		}
		
		if (tab2.indexOf(621) == -1) {
			System.out.println("L'element 621 n'est pas pr�sent dans mon tableau");
		} else {
			System.out.println("L'element 621 est  pr�sent dans mon tableau");
		}
		
	}

}
