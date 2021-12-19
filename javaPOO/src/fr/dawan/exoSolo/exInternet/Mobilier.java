package fr.dawan.exoSolo.exInternet;

public class Mobilier {
	
	public String nomMeuble;
	public String nomDesigner;
	public int prix;
	public int stock;
	
	public Mobilier () {
		stock++;
	};
	
	//Constructeur pour rentrer le mobilier 
	public Mobilier(String nomMeuble, String nomDesigner, int prix, int stock) {
		this.nomMeuble = nomMeuble;
		this.nomDesigner = nomDesigner;
		this.prix = prix;
		this.stock = stock;
	}
	
	




	
	
}
