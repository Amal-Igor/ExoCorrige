package fr.dawan.heritage.mot_cle_super;

public class Cercle extends Forme{

	protected double rayon = 4;
	
	@Override
	public double aire() {
		return Math.PI*rayon*rayon;
	}

}
