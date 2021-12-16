package fr.dawan.general.getters_and_setters;

public class Personne {
	
	public String nom;
	public int age;
	
	public Personne() {
		
	}
	
	public Personne(String nom) {
		this.nom = nom;
	}
	
	public Personne(String nom, int age) {
		this.nom = nom;
		//Initialisaiton des attributs par la valeur qui sera rentrée par l'utilisateur dans la classe PersonneTest
		this.age = age;
	}
	
	/*
	 * Un getter et un setter ce sont deux methodes qui permettent de lire (getter) et de modifier(setter) l'attribut
	 * getter : getNom
	 * setter : setNom
	 *Les getters et les setters permettent de mettre en place des restrictions, des contraintes  sur l'accès ou la 
	 *mise à jour des attributs
	 */
	public int getAge() {
		String pwd = "admin";
		if(pwd == "admin") {
			return this.age;
		} else {
			System.out.println("\nEchec d'authentification");
			return 0;
		}
	}
	
	//Les setters permettent de mettre à jour les attrinus de l'objet
	public void setAge(int age) {
		if(age < 15) {
			System.out.println("Interdit au moins de 15 ans");
		} else {
			this.age = age;
		}
	}
}
