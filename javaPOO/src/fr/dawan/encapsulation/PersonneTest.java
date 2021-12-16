package fr.dawan.encapsulation;

import fr.dawan.general.variables_methodes_statique.Personne;

public class PersonneTest {

	public static void main(String[] args) {
		
		Personne p1 = new Personne("Toto", 12);
		
		System.out.println(p1.getAge());
		
	}

}
