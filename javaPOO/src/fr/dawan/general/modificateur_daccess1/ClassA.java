package fr.dawan.general.modificateur_daccess1;

public class ClassA {

	//1- Facteur de visibilit� public 
	//public : accessible par toutes les classes 
	//	public int entier1;
	//	public int entier2;

	//2- Facteur de visibilit� private 
	//	private int entier1;
	//	private int entier2;

	//3- Facteur de visibilit� protected 
	//	protected int entier1;
	//	protected int entier2;

	//4- Facteur de visibilit� rien ou default 
	int entier1;
	int entier2;


	//1- Facteur de visibilit� public
	//	public void maMethode() {
	//		System.out.println("Je suis une m�thode");
	//	}
	//	

	//2- Facteur de visibilit� private
	//	private void maMethode() {
	//		System.out.println("Je suis une m�thode");
	//	}

	//3- Facteur de visibilit� protected
	//	protected void maMethode() {
	//		System.out.println("Je suis une m�thode");
	//	}

	//3- Facteur de visibilit� rien ou default 
	void maMethode() {
		System.out.println("Je suis une m�thode");
	}
}
