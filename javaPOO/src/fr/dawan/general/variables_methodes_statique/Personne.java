package fr.dawan.general.variables_methodes_statique;

public class Personne {
	
	//Variables d'instances : ce sont des variables specifiques à des objets
	//Pour y acceder : Instance.Variable
	private String nom;
	private int age;
	
	//Variable de classe, car elle conteint le mot clé statique
	//Classe.Variable (ex: Math.PI)
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
			System.out.println("Interdit au moins de 15 ans");
		} else {
			this.age = age;
		}
	}
	
	//Methode de classe
	public static int getNombreTotalDePersonnes() {
		return nombreTotalDePersonnes;
	}
}
