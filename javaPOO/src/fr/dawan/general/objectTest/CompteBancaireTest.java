package fr.dawan.general.objectTest;

public class CompteBancaireTest {

	public static void main(String[] args) {
		
		CompteBancaire cb = new CompteBancaire("toto", "1234567", 85452211);
		
		CompteBancaire cb2 = new CompteBancaire("tata", "aa11aa", 5000);
		CompteBancaire cb3 = new CompteBancaire("tata", "aa11aa", 5000);
		
		//En mettant cb, il va chercher à avoirs sous forme de caractère une representation de notre objet
		//C'est à dire qu'il va appeler notre méthode toString  (cb.toString())
		//Cette methode toString() appartient à la classe Object
		System.out.println(cb);
		
		/*
		 * cb2 == cb3  ==> L'opérateur == utilisé entre les objets compare l'adresse des references 
		 * ici cb2 et cb3 ne pointe pas sur les memes instances 
		 * Ce qui implique que l'utilisation de == sur deux instances distinctes sémantiquement equivalent returne false
		 */
		System.out.println("L'utilisation de l'operateur == " + (cb2 == cb3));  //False
		
		
		/*
		 * cb2 appelle la methode Equals
		 */
		System.out.println("L'utilisation de la méthode Equals : " + cb2.equals(cb3)); //True
		
		

	}

}
