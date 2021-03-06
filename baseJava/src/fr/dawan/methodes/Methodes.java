package fr.dawan.methodes;

public class Methodes {

	/*
	 * Methode : Une ensemble d'instruction r?utilisables - eviter de repeter du code
	 * D?clarer une methode : Visibilit? [mot-cl?] type-retour nom-m?thode(param) {instructions}
	 * 
	 * LA SURCHARGE: 
	 * La surcharge d?une m?thode ou d?un constructeur permet de d?finir plusieurs fois une m?me m?thode/constructeur 
	 * avec des arguments diff?rents.
	 * Le compilateur choisit la m?thode qui doit ?tre appel?e en fonction du nombre et du type des arguments.
	 * 
	 *  Quel est l'avantage?
	 *  Nous n?avons pas besoin de cr?er et de m?moriser des noms diff?rents pour des m?thodes faisant la m?me chose. 
	 *  Par exemple, dans notre code, si la surcharge n'?tait pas prise en charge par Java, il faudrait cr?er des noms 
	 *  de m?thodes tels que 
	 *  somme1, somme2,? ou somme2Int, ... etc..
	 */
	public static void main(String[] args) {
		
		int[] tab = {14, 12, 8, 18};
		double[] tab2 = {11, 15.4, 18.4};
		
		afficher();
		afficher(tab);
		
		int res = somme(2, 50);
		System.out.println("res = " + res);
		
		int res2 = somme(tab);
		System.out.println("res2 = " + res2);
		
		double res3 = somme(20.5, 7);
		System.out.println("res3 : " + res3);
		
		double moyenne = moyenneTab(tab2);
		System.out.println("moyenne = " + moyenne);
		
		int valMin = minTableauBoucleDoWhile(tab);
		System.out.println(valMin);
		
	}
	
	/**
	 * Methode afficher
	 * void ==> Si aucune valeur n'est retourn?e, renvoy?e, on utilise le pseudo-type void
	 */
	public static void afficher() {
		System.out.println("Methode afficher");
	}
	
	
	/**
	 * Methode afficher qui affiche les ?lement d'un tableau
	 * @param tab
	 */
	public static void afficher(int[] tab) {
		for (int item : tab) {
			System.out.println(item);
		}
	}
	
	/**
	 * Methode prend deux param?tre int et retourne un entier
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
	 * Methode qui renvoie la somme des ?l?ments d'un tableau d'entiers
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
	
	//M?thode qui retourne un double et  prend en param?tre deux doubles (decimal)
	public static double somme(double val1, double val2) {
		return val1 + val2;
	}
	
	//Methode qui retourne la somme des ?l?ments  d'un tableau de double. La somme retourn?e est un double.
	public static double somme(double[] tab) {
		double somme = 0;
		for (double item : tab) {
			somme += item;
		}
		return somme;
	}
	
	
	//M?thode qui renvoie la moyenne des ?l?ments d'un tableau (double)
	public static double moyenneTab(double[] tab) {
		double sum = somme(tab);
		return sum/tab.length;
	}
	
	
	//Methode qui renvoie l'?l?ment le plus petit d'un tableau (int)
	/*
	 * [14, 12, 8, 18]
	 * 
	 */
	public static int minTableauBoucleDoWhile(int[] tab) {
		int i = 1;
		int min = tab[0];
		do {
			if(min > tab[i]) {
				min = tab[i];
			}
			i++;
		}while(i < tab.length);
		
		return min;
	}
	
	public static int minBoucleFor(int[] tab) {
		int min = tab[0];
		for (int i = 1; i < tab.length; i++) {
			if(min > tab[i]) {
				min = tab[i];
			}
		}
		return min;
	}
}
