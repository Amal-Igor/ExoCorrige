package fr.dawan.general.modificateur_daccess1;

public class ClassA {

	//1- Facteur de visibilité public 
	//public : accessible par toutes les classes 
	//	public int entier1;
	//	public int entier2;

	//2- Facteur de visibilité private 
	//	private int entier1;
	//	private int entier2;

	//3- Facteur de visibilité protected 
	//	protected int entier1;
	//	protected int entier2;

	//4- Facteur de visibilité rien ou default 
	int entier1;
	int entier2;


	//1- Facteur de visibilité public
	//	public void maMethode() {
	//		System.out.println("Je suis une méthode");
	//	}
	//	

	//2- Facteur de visibilité private
	//	private void maMethode() {
	//		System.out.println("Je suis une méthode");
	//	}

	//3- Facteur de visibilité protected
	//	protected void maMethode() {
	//		System.out.println("Je suis une méthode");
	//	}

	//3- Facteur de visibilité rien ou default 
	void maMethode() {
		System.out.println("Je suis une méthode");
	}
}
