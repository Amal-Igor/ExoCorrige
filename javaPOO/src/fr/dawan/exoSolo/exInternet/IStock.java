package fr.dawan.exoSolo.exInternet;

public interface IStock {
	
	void ajouterUnMeuble(Mobilier mobilier);
	int getStock();
	
	void getMobilier();
	String setDesigner(String designer);
	int setPrix(int prix);
	String setNom(String nom);
}
