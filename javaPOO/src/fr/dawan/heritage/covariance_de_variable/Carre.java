package fr.dawan.heritage.covariance_de_variable;

public class Carre extends Forme{
	
	//Lorsqu'on definie un attribut en mode protected, on a accès à cet attribut à l'interieur de la classe
	//à l'interieur des classes filles, et à l'interieur des classe du même package
	protected int cote = 4;

	@Override
	public double aire() {
		return Math.pow(cote, 2);
	}
	
}
