package fr.dawan.encapsulation;

public class Personne {
	
	private String nom;
	private int age;
	
	public Personne() {
		
	}
	
	public Personne(String nom) {
		this.nom = nom;
	}
	
	public Personne(String nom, int age) {
		this.nom = nom;
		this.age = age;
	}
	
	public String getNom() {
		return this.nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public int getAge() {
		String pwd = "admin";
		if(pwd == "admin") {
			return this.age;
		} else {
			System.out.println("\nEchec d'authentification");
			return 0;
		}
	}

	public void setAge(int age) {
		if(age < 15) {
			System.out.println("Interdit au moins de 15 ans");
		} else {
			this.age = age;
		}
	}
}
