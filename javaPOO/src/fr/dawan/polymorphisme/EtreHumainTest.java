package fr.dawan.polymorphisme;

import java.util.ArrayList;

public class EtreHumainTest {

	public static void main(String[] args) {
		
		//Création d'un tableau dynamique d'etre humain 
		ArrayList<EtreHumain> tab = new ArrayList<EtreHumain>();
		tab.add(new Homme());
		tab.add(new Femme());
		tab.add(new Femme());
		tab.add(new Femme());
		tab.add(new Homme());
		
		//Manipuler les objets sans se soucier de leur type.
		for (EtreHumain etreHumain : tab) {
			etreHumain.uriner();
		}
		
		//L'utilisation la plus courante du polyphormise est de prendre une classe parente 
		//et de referencer une classe fille
		//Par exemple ici, la classe EtreHumain reference sa classe fille (Femme)
		EtreHumain etreHumain = new Femme();
		
		EtreHumain eh = new Homme();
		
		etreHumain.uriner();
	}

}
