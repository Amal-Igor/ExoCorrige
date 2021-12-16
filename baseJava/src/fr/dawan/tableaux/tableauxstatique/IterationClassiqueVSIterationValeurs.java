package fr.dawan.tableaux.tableauxstatique;

public class IterationClassiqueVSIterationValeurs {

	/*
	 * Nous allons voir les avantages et inconvients entre l'iteration classuque et
	 * l'iteration sur un ensemble de valeurs
	 * 
	 * Conclusion : Pour modifier une valeur on va donc utiliser l'itération classique
	 * 
	 * 2ème cas : On ne peut pas tester deux valeurs dans le tableau en utilisant le foreach
	 * 	Par contre avec la boucle for classique c'est possible. On peut ecrire tab[i] == tab[i+1] ou 
	 * tab[i] < tab[i+1]
	 */
	public static void main(String[] args) {
		int[] tab = {100, 200, 300};
		
		System.out.println("iteration classique ");
		for(int i = 0; i < tab.length; i++) {
			System.out.println(tab[i]);
			//tab[i] = 22;
			//tab[i+1] = 154;  //depassement de taille fixée (on peut mettre : i < tab.length - 1)
		}
		
		//System.out.println("tab[0] : " + tab[0]);
		
		System.out.println("\nForeach : Iteration sur un ensemble de valeur");
		for(int element: tab) {
			System.out.println(element);
			//element = 11;
		}
		
		//System.out.println("tab[0] : " + tab[0]);
	}

}
