package fr.dawan.general.methode_this;

public class HeritageTest {
	public static void main(String[] args) {
		
		Carre c = new Carre(5, "Carre1");
		System.out.println(c.cote);
		System.out.println(c.nom);
		
		System.out.println();
		
		Carre c2 = new Carre(5, "carre2", "Quadrilat�re � andle droits et c�t�s �gaux");
		
		System.out.println(c2.cote);
		System.out.println(c2.nom);
		System.out.println(c2.definitionCarre);
		
	}
}
