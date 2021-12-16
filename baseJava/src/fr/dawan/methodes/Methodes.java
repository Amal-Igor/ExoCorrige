package fr.dawan.methodes;

public class Methodes {

	/*
	 * Methode : Une ensemble d'instruction réutilisables - eviter de repeter du code
	 * Déclarer une methode : Visibilité [mot-clé] type-retour nom-méthode(param) {instructions}
	 * 
	 * LA SURCHARGE: 
	 * La surcharge d’une méthode ou d’un constructeur permet de définir plusieurs fois une même méthode/constructeur 
	 * avec des arguments différents.
	 * Le compilateur choisit la méthode qui doit être appelée en fonction du nombre et du type des arguments.
	 * 
	 *  Quel est l'avantage?
	 *  Nous n’avons pas besoin de créer et de mémoriser des noms différents pour des méthodes faisant la même chose. 
	 *  Par exemple, dans notre code, si la surcharge n'était pas prise en charge par Java, il faudrait créer des noms 
	 *  de méthodes tels que 
	 *  somme1, somme2,… ou somme2Int, ... etc..
	 */
	public static void main(String[] args) {
		
		int[] tab = {4, 5, 7, 20};
		
		afficher();
		afficher(tab);
		
		int res = somme(2, 50);
		System.out.println("res = " + res);
		
		int res2 = somme(tab);
		System.out.println("res2 = " + res2);
		
			
		
	}
	
	/**
	 * Methode afficher
	 * void ==> Si aucune valeur n'est retournée, renvoyée, on utilise le pseudo-type void
	 */
	public static void afficher() {
		System.out.println("Methode afficher");
	}
	
	
	/**
	 * Methode afficher qui affiche les élement d'un tableau
	 * @param tab
	 */
	public static void afficher(int[] tab) {
		for (int item : tab) {
			System.out.println(item);
		}
	}
	
	/**
	 * Methode prend deux paramètre int et retourne un entier
	 * @param val1
	 * @param val2
	 * @return
	 */
	public static int somme(int val1, int val2) {
		int result = 0;
		result = val1 + val2;
		return result;
	}
	
	
	/**
	 * Methode qui renvoie la somme des éléments d'un tableau d'entiers
	 * @param tab1
	 * @return
	 */
	public static int somme(int[] tab1) {
		int somme = 0;
		for (int item : tab1) {
			somme += item;  //somme = somme + item
		}
		
		return somme;
	}
	
	//Méthode qui retourne un double et  prend en paramètre deux doubles (decimal)
	//Methode qui retourne la somme des éléments  d'un tableau de double. La somme retournée est un double.
	//Méthode qui renvoie la moyenne des éléments d'un tableau (double)
	//Methode qui renvoie l'élément le plus petit d'un tableau 
	

}
