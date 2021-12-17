package fr.dawan.heritage.covariance_de_variable;

public class Triangle extends Forme{
	
	protected double base = 4;
	protected double hauteur = 2;
	
	@Override
	public double aire() {
		return base * hauteur * 0.5;
	}
	
}
