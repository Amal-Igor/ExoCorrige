package fr.dawan.syntaxe_de_base.operateurs;

public class OperateursArithmetique {

	public static void main(String[] args) {
		
		int var1 = 4;
		int var2;
		
		//Pour utiliser une variable (type primitif) il faut d'abord l'initialisée
		//System.out.println("var2 : " + var2);
		
		var2 = 10;
		
		//Addition
		int somme = var1 + var2;
		//System.out.println("Somme = " + (var1 + var2));
		System.out.println("Somme = " + somme);
		
		//Soustraction
		int soustration = var1 - var2;
		System.out.println("result = " + soustration);
		
		//Multiplication
		int produit = var1 * var2;
		System.out.println("produit = " + produit);
		
		//Division  ==> 4/10 = 0.4
		//Resultat attendu 0.4
		//Resultat obtenu 0
		int quotient = var1/var2;
		System.out.println("result = " + quotient);
		
	}

}
