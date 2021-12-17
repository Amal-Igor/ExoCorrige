package fr.dawan.general.methode_this;

public class Cercle extends Forme{

	protected double rayon = 4;
	
	@Override
	public double aire() {
		return Math.PI*rayon*rayon;
	}

}
