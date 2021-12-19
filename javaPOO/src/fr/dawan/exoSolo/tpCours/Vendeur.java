package fr.dawan.exoSolo.tpCours;

public class Vendeur extends Commercial{
	
	private final static double POURCENTAGE_CA = 0.2;
	private final static double COMMISSION = 400;


	public Vendeur(String nom, String prenom, int age, String dateEntree, double chiffreAffaire) {
		super(nom, prenom, age, dateEntree, chiffreAffaire);
	}


	@Override
	public double calculerSalaire() {
		return calculSalaire(POURCENTAGE_CA, COMMISSION);
	}
	
	public String getTitre() {
		return "Vendeur : " ;
	};



}
