package fr.dawan.tp_concept_objet;

public class Manutentionnaire extends Employe{

	private int heures;
	private final static double SALAIRE_HORAIRE = 65.0;
	
	public Manutentionnaire(String nom, String prenom, int age, String date, int heure) {
		super(nom, prenom, age, date);
		this.heures = heure;
	}

	@Override
	public double calculerSalaire() {
		return SALAIRE_HORAIRE * heures;
	}
	
	public String getTitre() {
		return "Le manut. ";
	}

}
