package fr.dawan.tp_concept_objet;

public class Representant extends Commercial{

	private final static double POURCENT_REPRESENTANT = 0.2;
	private final static int BONUS_REPRESENTANT  = 800;
	
	public Representant(String nom, String prenom, int age, String date, double chiffreAffaire) {
		super(nom, prenom, age, date, chiffreAffaire);
	}

	@Override
	public double calculerSalaire() {
		return (getChiffreAffaire()*POURCENT_REPRESENTANT + BONUS_REPRESENTANT);
	}
	
	public String getTitre() {
		return "Le representant ";
	}
}
