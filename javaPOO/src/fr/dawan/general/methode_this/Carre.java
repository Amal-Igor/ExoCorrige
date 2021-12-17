package fr.dawan.general.methode_this;

public class Carre extends Forme{
	
	protected int cote = 4;
	
	public int prop1 = 20;
	
	protected String nom;
	
	protected String definitionCarre;
	
	public static int NbCarre;
	
	public Carre() {
		NbCarre++;
	}
	
	public Carre(int cote, String nom) {
		this();
		this.cote = cote;
		this.nom = nom;
	}

	public Carre(int cote, String nom, String definitionCarre) {
		this(cote, nom);
		this.definitionCarre = definitionCarre;
	}

	@Override
	public double aire() {
		return Math.pow(cote, 2);
	}


	
}
