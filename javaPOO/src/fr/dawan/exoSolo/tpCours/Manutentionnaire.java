package fr.dawan.exoSolo.tpCours;

public class Manutentionnaire extends Employe{
	
	private int heuresTravail;
	private final static int TAUX_HORRAIRE = 65;

	public Manutentionnaire(String nom, String prenom, int age, String dateEntree, int heures) {
		super(nom, prenom, age, dateEntree);
		this.heuresTravail = heures;
	}

	@Override
	public double calculerSalaire() {
		return heuresTravail * TAUX_HORRAIRE;
	}
	
	public String getTitre() {
		return "Manutentionnaire : " ;
	};

}
