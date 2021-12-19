package fr.dawan.exoSolo.exInternet;

public class Chaises extends Mobilier{
	
	
	public Chaises(String nomMeuble, String nomDesigner, int prix, int stock) {
		super(nomMeuble, nomDesigner, prix, stock);
		
	}

	
	public String getInfos() {
		return nomMeuble + " " + nomDesigner + " " + prix + " " + stock;
	};
	

}
