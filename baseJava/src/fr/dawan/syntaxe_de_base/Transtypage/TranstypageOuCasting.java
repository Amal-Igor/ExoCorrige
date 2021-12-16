package fr.dawan.syntaxe_de_base.Transtypage;

public class TranstypageOuCasting {

	public static void main(String[] args) {
		int var1 = 4;
		int var2 = 10;
		
		/*
		 *  Exemple 1: Remplacer le type du quotient par un type qui va contenir des valeurs decimal (double)
		 *  Result après execution = 0.0
		 */
		double quotient = var1 / var2;
		System.out.println("result = " + quotient);
		
		/*
		 * Exemple 2 : Transformons les var1 et var2 en type double
		 */
		double _var1 = 4;
		double _var2 = 10;
		double quotient2 = _var1/_var2;
		System.out.println("result : " + quotient2);
		
		/*
		 * Exemple 3: On veut garder var1 et var2 comme des entiers
		 * 
		 * Solution : Les type var1 et var2 peuvent être converti en double en utilisant le casting
		 */
		double quotient3 = (double) var1/var2;
		System.out.println("result = " + quotient3);

	}

}
