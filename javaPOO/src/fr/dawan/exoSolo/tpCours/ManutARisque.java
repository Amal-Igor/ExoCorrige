package fr.dawan.exoSolo.tpCours;

public class ManutARisque extends Manutentionnaire{
	
	
	private final static int PRIME = 200;

	public ManutARisque(String nom, String prenom, int age, String dateEntree, int heures) {
		super(nom, prenom, age, dateEntree, heures);
	}
	
	public double calculerSalaire() {
		return super.calculerSalaire()+PRIME;
	}
	
	public String getTitre() {
		return super.getTitre();
	};

}
