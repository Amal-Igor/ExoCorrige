package fr.dawan.chaine_de_caractere;

public class ChaineDeCaractereTets {

	public static void main(String[] args) {
		
		String s1 = "Bonjour"; //Construction implicite via String litteral
		String s2 = "Bonjour"; 
		/*
		 * s1, s2 variable de type reference stocké dans le Tas (Heap), dans une memoire appelé pool String
		 */
		
		String s3 = new String("Bonjour"); //La valeur "Bonjour" est stocké dans le Tas (HEAP)
		String s4 = new String("Bonjour");
		
		System.out.println(s1 == s2);  //true
		System.out.println(s1 == s3);  //false (== compare les references (adresses) des objets
		System.out.println(s3 == s4); //false
		
		
		System.out.println(s1.equals(s3)); //true  : comparaison de contenu qui est vrai
		
		String str = "test";
		System.out.println(str.charAt(2)); //s
		
		//Un objet de type String est immuable  (immutable)
		str = str.concat("e"); //test + e = teste
		System.out.println(str);
		
		System.out.println("substring(0, 3) : " + str.substring(0, 3));
		
		System.out.println("substring(2) : " + str.substring(2));
		
		
		//StringBuilder : Mutable - Muable
		StringBuilder stb = new StringBuilder("test");
		StringBuilder stb2 = new StringBuilder("test");
		System.out.println("Comparaison de reference StringBuilder : " + (stb2 == stb)); // false
		
		System.out.println("StringBuilder : " + stb.append("e"));
		
		System.out.println("6" + 4 + 5);  //Commence par une de chaine de caractère donc concatenation
		System.out.println(4 + 5 + "7");  // Commence par une addition
		System.out.println(4 + "5" + 3); 
		
		int x = 5 + 'A';  //Le code ascii de A vaut 65
		System.out.println(x);
		
		System.out.println("6" + 5*4);  //*, /, %, +, -
	
		System.out.println("6" + (5-4)); 
	}

}
