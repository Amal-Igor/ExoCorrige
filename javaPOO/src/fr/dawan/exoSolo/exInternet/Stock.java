package fr.dawan.exoSolo.exInternet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Stock implements IStock{
	
	List<Mobilier> stock;
	
	public Stock() {
		stock = new ArrayList<Mobilier>();
	}

	@Override
	public void ajouterUnMeuble(Mobilier mobilier) {
		stock.add(mobilier);
	}


	@Override
	public int getStock() {
		return stock.size();
	}


	@Override
	public String setDesigner(String designer) {
		return designer;
	}


	@Override
	public int setPrix(int prix) {
		return prix;
	}


	@Override
	public String setNom(String nom) {
		return nom;
	}

	@Override
	public void getMobilier() {
		for(Mobilier mobilier : stock ) {
			System.out.println(" Nom : " + mobilier.getNomMeuble() + " | " + "Designer par : "+ mobilier.getNomDesigner() + " | Prix :" + mobilier.getPrix() + " ?");
		};
	}
	
}
