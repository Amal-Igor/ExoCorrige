package fr.dawan.general.objectTest;

public class CompteBancaireTest {

	public static void main(String[] args) {
		
		CompteBancaire cb = new CompteBancaire("toto", "1234567", 85452211);
		
		CompteBancaire cb2 = new CompteBancaire("tata", "aa11aa", 5000);
		CompteBancaire cb3 = new CompteBancaire("tata", "aa11aa", 5000);
		
		//En mettant cb, il va chercher � avoirs sous forme de caract�re une representation de notre objet
		//C'est � dire qu'il va appeler notre m�thode toString  (cb.toString())
		//Cette methode toString() appartient � la classe Object
		System.out.println(cb);
		
		/*
		 * cb2 == cb3  ==> L'op�rateur == utilis� entre les objets compare l'adresse des references 
		 * ici cb2 et cb3 ne pointe pas sur les memes instances 
		 * Ce qui implique que l'utilisation de == sur deux instances distinctes s�mantiquement equivalent returne false
		 */
		System.out.println("L'utilisation de l'operateur == " + (cb2 == cb3));  //False
		
		
		/*
		 * cb2 appelle la methode Equals
		 */
		System.out.println("L'utilisation de la m�thode Equals : " + cb2.equals(cb3)); //True
		
		

	}

}
