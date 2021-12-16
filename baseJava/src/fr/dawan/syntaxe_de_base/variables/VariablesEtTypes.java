package fr.dawan.syntaxe_de_base.variables;

/*
 * Zone memoire qui va contenir une valeur typée 
 * Il existe huit types de base (dite types primitifs) en Java : 
 * 
 * 	- des types entier : byte(1o),  short(2o), int(4o), long(8o)
 * 	- un type caractère : char (2o)
 * 	- un type boolean : boolean (Ne peut prendre que deux valeurs : true ou false)
 * 	- deux types flottants : float(4o), et le double(8o)
 * 
 * Type complexes
 * 	- Objets
 * 	- Tableaux
 *  - String
 *  - Classes
 * 
 * 
 */
public class VariablesEtTypes {

	public static void main(String[] args) {
		
		//Type caractère : char
		char c = 'a';
		
		//Type Entier : byte, short, int, long
		byte b = 1;
		short s = 2;
		int i = 3;
		long l = 4;
		
		//On peut forcer une valeur littéral à être interprétée comme un entier long en suffixant la valeur par L ou l
		long l2 = 100L;
		
		//Pour plus de isibilité, il est egalement possible de séparer les milliers par un underscore (_)
		long l3 = 1_000_000_000;
		System.out.println("Le contenu de l3 : " + l3);
		
		//Les types à virgules flottante (décimal) : float, double
		double d1 = 5;
		System.out.println("Le contenu de d : " + d1);
		
		//Pour les variables de type Float, il faut suffixer la valeur par F ou f
		float f = 0.5F;
		
		//Le type booléen : boolean
		boolean bool = true;
		
		//Type complexe 
		String chaine = "Dawan";
		int[] tab = {200, 300, 50};

	}

}
