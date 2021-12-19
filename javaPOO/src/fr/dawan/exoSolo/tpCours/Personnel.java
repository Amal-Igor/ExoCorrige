package fr.dawan.exoSolo.tpCours;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


public class Personnel implements IPersonnel{


	List<Employe> lstEmploye;
	
	
	
	public Personnel() {
		lstEmploye = new ArrayList<Employe>();
	}
		

	@Override
	public void ajouterEmploye(Employe employe) {
		lstEmploye.add(employe);
	}



	@Override
	public void calculerSalaire() {
		for (Employe employe : lstEmploye) {
			System.out.println(employe.getNom() + " gagne " + employe.calculerSalaire() + " euros");

		}
	}



	@Override
	public double salaireMoyen() {
		double somme = 0.0;
		for (int i = 0; i < lstEmploye.size(); i++) {
			somme += lstEmploye.get(i).calculerSalaire();
		}
		return somme/lstEmploye.size();
	}
	
	@Override
	public void getItem(){
		for(Employe employe : lstEmploye) {
			System.out.println();
		}
	};





	
	
	
	
	
	
	

	
}
