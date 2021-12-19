package fr.dawan.exoSolo.tpCours;

public class Technicien extends Employe{


	private int unites;
	private final static double FACTEUR_UNITES = 5;
	
	
	public Technicien(String nom, String prenom, int age, String dateEntree, int unites) {
		super(nom, prenom, age, dateEntree);
		this.unites = unites;
	}

	@Override
	public double calculerSalaire() {
		return unites * FACTEUR_UNITES;
	}
	
	public String getTitre() {
		return "Technicien : " ;
	};
	
}
