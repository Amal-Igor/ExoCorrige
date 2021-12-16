package fr.dawan.syntaxe_de_base.operateurs;

public class OperateurDincrementationEtDecrementation {

	public static void main(String[] args) {
		
	/*
	 * Incrementation et decrementation ++, --
	 */
	
	int c = 10;
	c++;  //c = 10+1
	System.out.println(c);
	
	int d = 15;
	d--; //d = d - 1
	System.out.println(d);
	
	/*Post-Incrementation et Pré-Incrementation
	 * 
	 *Il y a une grande difference entre ecrire e++ et ++e
	 *
	 *pre-incrementation ====> ++e : ajoute d'abord 1 et ensuite affiche e  
	 *On incremente avant d'afficher
	 *
	 *post-incrementation =====> e++ : affiche e et après ajoute 1
	 *On affiche  avant d'incrementer
	 */
	
	int e = 10;
	System.out.println("Post-incrementation : " + e++);  //10
	System.out.println("Pre-incrementation : " + ++e); //12
	
	int f = 10;
	System.out.println("Pré-incrementation : " + ++f); //11
	System.out.println("Post-incrementation : " + f++); //11
	
	int g = 10;
	System.out.println("Pré-decrementation : " + --g); //9
	System.out.println("Post-decrementation : " + g--);//9
	System.out.println(g); //8
	
	
	}

}
