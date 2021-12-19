package fr.dawan.exoSolo.tpCours;

public class TechARisque extends Technicien{
	
	private final static int PRIME = 200;
	
	
	public TechARisque(String nom, String prenom, int age, String dateEntree, int unites) {
		super(nom, prenom, age, dateEntree, unites);
	}
	
	
	@Override
	public double calculerSalaire() {
		return super.calculerSalaire()+PRIME;
	}
	
	@Override
	public String getTitre() {
		return super.getTitre();
	}
}
