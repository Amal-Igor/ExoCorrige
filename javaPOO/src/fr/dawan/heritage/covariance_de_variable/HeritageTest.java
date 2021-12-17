package fr.dawan.heritage.covariance_de_variable;

public class HeritageTest {
	public static void main(String[] args) {
		
		double a = 4;
		System.out.println(a);
		
		int b = (int) 7.7;
		
		Cercle c = new Cercle();
		System.out.println(c.aire());
		
		//On peut stocker une nouvelle instance d'une classe fille, et la stocker ensuite dans la classe parente
		//En terme technique, on parle tout simplement de  covariance des variables
		//La classe mère (Forme) peut referencer les sous-classes
		Forme c2 = new Cercle();
		System.out.println(c2.aire());
		
		Forme t1 = new Triangle();
		System.out.println(t1.aire());
		
		Forme carre = new Carre();
		System.out.println(carre.aire());
		
		System.out.println();
		
		//Création d'un tablau de forme qui va contenir trois forme (un cercle, un triangle, et un carre)
		Forme[] tab1 = new Forme[3];
		Forme forme1 = new Cercle();
		Forme forme2 = new Triangle();
		Forme forme3 = new Carre();
		
		tab1[0] = forme1;
		tab1[1] = forme2;
		tab1[2] = forme3;
		
		//Pour chaque forme qu'il va trouver au niveau de tab1, il va nous afficher l'aire de cette forme
		for (Forme forme : tab1) {
			System.out.println(forme.aire());
		}
		
	}
}
