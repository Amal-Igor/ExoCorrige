package fr.dawan.syntaxe_de_base.util;

public class ClassMath {

	public static void main(String[] args) {
		
		System.out.println("La racine carée de 25 est " + Math.sqrt(25));
		
		System.out.println("PI = " + Math.PI);
		
		//PI_Arrondi = 3.14
		System.out.println("PI_Arrondi = " + Math.round(Math.PI*100.0)/100.0);
		
		
		//Cos(180)
		double angle = (180*Math.PI)/180; // angle en radian
		
		//On peut aussi utiliser  Math.toRadians(180)
		//double angle1 = Math.toRadians(180);
		
		System.out.println(angle);
		System.out.println("Le cosinus de 180 degré est : " + Math.cos(angle));  //-1
		
	}

}
