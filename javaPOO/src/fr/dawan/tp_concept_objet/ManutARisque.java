package fr.dawan.tp_concept_objet;

public class ManutARisque extends Manutentionnaire{

	private final static int PRIME = 200;
	
	public ManutARisque(String nom, String prenom, int age, String date, int heure) {
		super(nom, prenom, age, date, heure);
	}

	@Override
	public double calculerSalaire() {
		return super.calculerSalaire() + PRIME;
	}

	@Override
	public String getTitre() {
		// TODO Auto-generated method stub
		return super.getTitre();
	}
	
	

}
