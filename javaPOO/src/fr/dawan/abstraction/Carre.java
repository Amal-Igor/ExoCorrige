package fr.dawan.abstraction;

public class Carre extends Forme{
	protected int cote = 4;

	@Override
	public double aire() {
		return Math.pow(cote, 2);
	}
	
}
