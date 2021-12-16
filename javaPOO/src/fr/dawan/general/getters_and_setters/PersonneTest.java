package fr.dawan.general.getters_and_setters;

public class PersonneTest {

	public static void main(String[] args) {
		
		Personne p1 = new Personne("Tata");
		System.out.println(p1.nom);

		Personne p2 = new Personne("Toto", 19);
		System.out.println(p2.nom);
		System.out.println(p2.age);
		
		//Modification de l'attribut age
		p2.age = 28;
		System.out.println(p2.nom + " à " + p2.age + " ans");
		System.out.println();
		
		p2.age++;
		System.out.println(p2.nom + " à " + p2.age + " ans");

		System.out.println("\n***********Utilisation des getters et setters***********");
		System.out.println(p2.nom + " à " + p2.getAge() + " ans");
		p2.setAge(12);
		System.out.println("Après modification de l'age par le setter : " + p2.getAge());
	}

}
