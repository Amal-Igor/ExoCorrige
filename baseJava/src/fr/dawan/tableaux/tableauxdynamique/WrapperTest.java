package fr.dawan.tableaux.tableauxdynamique;

import java.util.ArrayList;

public class WrapperTest {

	public static void main(String[] args) {
		ArrayList<Integer> tab = new ArrayList<Integer>();

		//Parser une chaine de caractère en entier
		int k = Integer.parseInt("20");
		
		//Convertir une chaine de caractère en un entier de type Wrapper
		Integer i = Integer.valueOf("210");
		System.out.println(i);
		
		//Convertir une chaine de caractère en double de type wrapper
		Double d = Double.valueOf("35.14");
		
		System.out.println(d);
		
		//On peut convertir les types de données primitifs en leur objets de classe wrapper : auto-boxing
		int a = 56;
		Integer i1 = a;  //auto-boxing
		
		//On ne peut pas créer une collection ou un tableau dynamique de type  primitifs
		//ArrayList<int> tab = new ArrayList<>();   Incorrect
		
		int a1 = 45;
		tab.add(a1);  //auto-boxing
		tab.add(60);

		//On a l'unboxing, qui est l'opposé de l'auto-boxing où nous convertissons l'objet de la classe wrapper 
		//vers son type primitif
		Integer s = 45;
		int a2 = s;  //unboxing
		
		//Utilisation de l'autoboxing dans les tableaux dynamique (ou collections)
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		int a3 = al2.get(0);  //unboxing
		int val = a3 + 10;
		al2.add(val); //auto-boxing
	}

}
