package fr.dawan.syntaxe_de_base.variables;

public class ConstanteEtReglesDeNommage {

	public static void main(String[] args) {
		
		System.out.println("******************CONSTANTES***************************");
		//Les constantes doivent ?tre ecrites en majuscules, pour les diff?rencier des autres variables
		//final : veut dire que le contenu de la variable ne va pas changer
		final int VIES_MAX = 15;		
		System.out.println("Nombre de vie max " + VIES_MAX);
		
		System.out.println("******************REGLES DE NOMMAGE***************************");
		//les noms des variables peuvent comment par une lettre
		int val = 15;
		
		//les noms des variables peuvent commencer par un _ (underscore)
		String _val = "underscore";
		
		//Les noms des variables peuvent commencer par un $
		double $val3 = 5.0;
		
		//Les noms des peuvent contenir des chiffres
		int conv2int = 500;
		
		//les noms des variables peuvent commencer par un double underscore
		String __val3 = "doubleUnderscore";
		
		//Une variable ne peut pas commencer par un chiffre
		//int 3nbre = 5;
		
		//Une variable ne pas commencer par une operation mathetique 
		//int -nbre = 8;
		
		//Le nom d'une variable ne doit pas ?tre un mot reserv?
		//int double = 5;
		
		//Java est un langage sensible ? la casse
		//On ne peut pas d?clarer une variable qui porte le m?me nom
		//Par contre Java fait la difference entre une  majuscule et une lettre minuscule
		String valeur = "dawan";
		//String valeur = "Jehann";
		String Valeur = "formation Java";
		
		 //On peut utiliser l'underscore (_)
		int nombre_de_vie = 5; 
		
		//On peut utiliser le CamelCase
		//Chaque nouveau mot commence par une lettre majuscule
		int nombreDeVie = 5; 
		


	}

}
