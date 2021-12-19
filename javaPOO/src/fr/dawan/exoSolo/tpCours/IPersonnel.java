package fr.dawan.exoSolo.tpCours;

public interface IPersonnel {
	
	void ajouterEmploye(Employe employe);
	void calculerSalaire();
	double salaireMoyen();
	String getItem();
}
