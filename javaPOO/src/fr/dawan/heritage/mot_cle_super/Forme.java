package fr.dawan.heritage.mot_cle_super;


public abstract class Forme {

	public int prop1 = 5;
	
	public String chaine;
	
	
	public Forme() {
		System.out.println("Je suis un constructeur de la classe Forme");
	}
	
	
	public Forme(String chaine) {
		super();
		this.chaine = chaine;
		System.out.println(this.chaine);
	}



	public abstract double aire();

	public double toto() {
		return 6.4;
	}

}
