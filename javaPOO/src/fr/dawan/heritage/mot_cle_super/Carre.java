package fr.dawan.heritage.mot_cle_super;

public class Carre extends Forme{
	
	//Lorsqu'on definie un attribut en mode protected, on a acc�s � cet attribut � l'interieur de la classe
	//� l'interieur des classes filles, et � l'interieur des classe du m�me package
	protected int cote = 4;
	
	public int prop1 = 20;
	
	//Constructeur sans param�tre
	//Pour appeler le constructeur de la classe parente, il faut utiliser le mot super()
	//Super() sans param�tre appelle le constructeur de la classe parente sans param�tre
//	public Carre() {
//		//System.out.println("Je suis dans la classe carre"); //On ne peut pas le mettre avant le mot cl� super
//		super();
//		System.out.println("Je suis dans la classe carre");
//	}

	
	//Acc�s au constructeur avec param�tre de la classe parente
//	public Carre() {
//		super("Constructeur de la classe Parente avec param�tre");
//		System.out.println("Je suis dans le constructeur de la classe carre");
//	}
	
	//Si on veut acceder � des attributs de la classe parente, je dois utilise le mot cl� super
//	public Carre() {
//		System.out.println(super.prop1 + this.prop1);
//	}
	
	//Le mot cl� super permet d'utiliser des methodes de la classe parente
	public Carre() {
		System.out.println(super.toto());
	}
	

	@Override
	public double aire() {
		return Math.pow(cote, 2);
	}


	
}
