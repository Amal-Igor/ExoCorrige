package fr.dawan.exoSolo.exInternet;

public interface IStock {
	
	void ajouterUnMeuble(Mobilier mobilier);
	int getStock();
	
	String getMobilier();
	String setDesigner(String designer);
	int setPrix(int prix);
	String setNom(String nom);
}
