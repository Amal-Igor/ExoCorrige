package fr.dawan.exoSolo.tpCours;

public abstract class Commercial extends Employe{
	
	private double chiffreAffaire;
	

	public Commercial(String nom, String prenom, int age, String dateEntree, double chiffreAffaire) {
		super(nom, prenom, age, dateEntree);
		this.chiffreAffaire = chiffreAffaire;
	}


	public double getChiffreAffaire() {
		return chiffreAffaire;
	}
	
	public double calculSalaire(double pourcentageChiffreAffaire, double commission) {
		return getChiffreAffaire()*pourcentageChiffreAffaire + commission;
		
	};
	
	

}
