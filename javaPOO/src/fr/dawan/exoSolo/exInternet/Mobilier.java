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
	
	
	
	
	  public String getNomMeuble() { return nomMeuble; }
	  
	  public void setNomMeuble(String nomMeuble) { this.nomMeuble = nomMeuble; }
	  
	  public String getNomDesigner() { return nomDesigner; }
	  
	  public void setNomDesigner(String nomDesigner) { this.nomDesigner =
	  nomDesigner; }
	  
	  public int getPrix() { return prix; }
	  
	  public void setPrix(int prix) { this.prix = prix; }
	 

	
	




	
	
}
