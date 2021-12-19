package fr.dawan.exoSolo.tpCours;

public class Salaire {

	public static void main(String[] args) {
		
//		IPersonnel p = new Personnel();
//		
//		p.ajouterEmploye(new Vendeur("Pierre", "Buisiness", 8, "1995", 30000));
//		
//		System.out.println(p.);
		
		
		IPersonnel p = new Personnel();
		p.ajouterEmploye(new Vendeur("Pierre", "Business", 45, "1995", 30000));
		p.ajouterEmploye(new Representant("L�on", "Vendtout", 25, "2001", 20000));
		p.ajouterEmploye(new Technicien("Yves", "Bosseur", 28, "1998", 1000));
		p.ajouterEmploye(new Manutentionnaire("Jeanne", "Stocketout", 32, "1998", 45));
		p.ajouterEmploye(new TechARisque("Jean", "Flippe", 28, "2000", 1000));
		p.ajouterEmploye(new ManutARisque("Al", "Abordage", 30, "2001", 45));
		
		p.calculerSalaire();
		
		System.out.println(p.getItem());
	}

}
