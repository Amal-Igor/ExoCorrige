package fr.dawan.exceptions;

/*
 * 	Une exception est une erreur qui provoque l'arrête de l'application
 */
public class Personne {

	private String nom;
	private String prenom;
	private int age;
	
	private static int nombreTotalDePersonnes;
	
	public Personne() {
		nombreTotalDePersonnes++;
	}
	
	public Personne(String nom) {
		this.nom = nom;
		nombreTotalDePersonnes++;
	}
	
	public Personne(String nom, int age) {
		this.nom = nom;
		this.age = age;
		nombreTotalDePersonnes++;
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
//			System.out.println("Interdit au moins de 15 ans");
			//Throw permet de lever une exception (j'utilise une exception de la librairie java)
			throw new IllegalArgumentException("Interdit au moins de 15 ans");
		} else {
			this.age = age;
		}
	}
	
	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	//Methode de classe
	public static int getNombreTotalDePersonnes() {
		return nombreTotalDePersonnes;
	}
}
