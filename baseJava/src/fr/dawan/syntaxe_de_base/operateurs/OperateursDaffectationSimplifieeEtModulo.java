package fr.dawan.syntaxe_de_base.operateurs;

public class OperateursDaffectationSimplifieeEtModulo {

	public static void main(String[] args) {
		
		int a = 10;
		
		a = a + 5;
		
		//Avec les opérateurs d'affectation simplifiée
		a += 5;  // a = a + 5;
		a -= 5;  // a = a - 5;
		a *= 5;  // a = a * 5;
		a /= 5;  // a = a / 5;
		
		
		//Un modulo permet d'avoir le reste de la  division entière entre deux nombres
		int dividende = 23;
		int diviseur = 5;
		
		int modulo = 23 % 5;
		System.out.println(modulo);
		
	}

}
