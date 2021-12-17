package fr.dawan.heritage.covariance_de_variable;

public class Carre extends Forme{
	
	//Lorsqu'on definie un attribut en mode protected, on a acc�s � cet attribut � l'interieur de la classe
	//� l'interieur des classes filles, et � l'interieur des classe du m�me package
	protected int cote = 4;

	@Override
	public double aire() {
		return Math.pow(cote, 2);
	}
	
}
