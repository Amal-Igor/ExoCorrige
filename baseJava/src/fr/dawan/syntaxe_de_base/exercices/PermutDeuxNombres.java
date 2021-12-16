package fr.dawan.syntaxe_de_base.exercices;

public class PermutDeuxNombres {

	public static void main(String[] args) {
		int a, b, tmp;
		a = 1;
		b = 2;
		System.out.println("Avant l'échange : " + "a = " + a + ", b = " + b);
		
		tmp = a;
		a = b;
		b=tmp;
		System.out.println("Après l'échange : " + "a = " + a + ", b = " + b);

		
	}

}
