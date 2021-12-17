package fr.dawan.collections;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

public class Application {

	public static void main(String[] args) {
		
		//List : package java.util
		List<String> lst = new ArrayList<String>();
		lst.add("test");
		lst.add("liste");
		lst.add("array");
		
		System.out.println("***************************Boucle for classique*********************************");
		for (int i = 0; i < lst.size(); i++) {
			System.out.println(lst.get(i));
		}
		
		System.out.println("***************************Foreach*********************************");
		for (String element : lst) {
			System.out.println(element);
		}
		
		//Map<cle: valeur>  ---liste qui stocke des objets de type cle:valeur
		//Declaration et initialisaiotn d'un MAP
		//Le type de la clé et le type de la valeur sont obligatoire à gauche
		Map<Integer, String> mp = new HashMap<Integer, String>();
		mp.put(1, "User");
		mp.put(2, "password");
		
		System.out.println("---------------------------MAP KEY------------------------------");
		System.out.println("La valeur stockée dans la clé 2 est : " + mp.get(2));
		
		//Hashtable
		Map<Integer, String> ht = new Hashtable<Integer, String>();
		ht.put(10, "ete");
		ht.put(48, "hiver");
		ht.put(38, "printemps");
		ht.put(40, "automne");
		
		//Transforme le HashTable en enumeration 
		Enumeration enumeration = ((Hashtable<Integer, String>) ht).elements();
		
		//parcours
		while(enumeration.hasMoreElements()) {
			System.out.println(enumeration.nextElement());
		}
		
	}

}
