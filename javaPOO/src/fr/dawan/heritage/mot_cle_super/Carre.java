package fr.dawan.heritage.mot_cle_super;

public class Carre extends Forme{
	
	//Lorsqu'on definie un attribut en mode protected, on a accès à cet attribut à l'interieur de la classe
	//à l'interieur des classes filles, et à l'interieur des classe du même package
	protected int cote = 4;
	
	public int prop1 = 20;
	
	//Constructeur sans paramètre
	//Pour appeler le constructeur de la classe parente, il faut utiliser le mot super()
	//Super() sans paramètre appelle le constructeur de la classe parente sans paramètre
//	public Carre() {
//		//System.out.println("Je suis dans la classe carre"); //On ne peut pas le mettre avant le mot clé super
//		super();
//		System.out.println("Je suis dans la classe carre");
//	}

	
	//Accès au constructeur avec paramètre de la classe parente
//	public Carre() {
//		super("Constructeur de la classe Parente avec paramètre");
//		System.out.println("Je suis dans le constructeur de la classe carre");
//	}
	
	//Si on veut acceder à des attributs de la classe parente, je dois utilise le mot clé super
//	public Carre() {
//		System.out.println(super.prop1 + this.prop1);
//	}
	
	//Le mot clé super permet d'utiliser des methodes de la classe parente
	public Carre() {
		System.out.println(super.toto());
	}
	

	@Override
	public double aire() {
		return Math.pow(cote, 2);
	}


	
}
