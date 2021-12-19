package fr.dawan.exoSolo.tpCours;

public abstract class Employe {
	
	private String nom;
	private String prenom;
	private int age;
	private String dateEntree;
	
	
	
	public Employe(String nom, String prenom, int age, String dateEntree) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.dateEntree = dateEntree;
	}
	
	public abstract double calculerSalaire();
	
	
	public String getTitre() {
		return "L'employ� : " ;
	};
	
	
	public String getNom() {
		return getTitre() + prenom + nom;
	};
	
	
	
	

}
