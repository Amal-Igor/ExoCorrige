package fr.dawan.interface_.task1;

public class AnimalTest {

	public static void main(String[] args) {
		
		/*
		 * Le polymorphisme peut s'appliquer avec l'interface
		 * Vu que chat et chien sont tout simplement des animaus
		 * L'interface Animal peut referencer les classes Chat et Chien
		 */
		Animal animal1 = new Chat();
		Animal animal2 = new Chien();
		
		animal2.communiquer();
		
	}

}
