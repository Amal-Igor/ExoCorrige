package fr.dawan.tp_concept_objet;

public class Vendeur extends Commercial{
	
	private final static double POURCENT_VENDEUR = 0.2;
	private final static int BONUS_VENDEUR = 400;
	
	public Vendeur(String nom, String prenom, int age, String date, double chiffreAffaire) {
		super(nom, prenom, age, date, chiffreAffaire);
	}

	@Override
	public double calculerSalaire() {
		return (getChiffreAffaire()*POURCENT_VENDEUR + BONUS_VENDEUR);
	}
	
	public String getTitre() {
		return "Le vendeur " ;
	}
	
	
}
