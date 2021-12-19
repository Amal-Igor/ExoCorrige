package fr.dawan.abstraction;

/*
 * Pour definir une classe abstraite, il faudra simplement mettre le mot cl� abstract 
 * 
 * Lorqu'on dit qu'une classe est abstraite, cela veut dire que c'est une classe ne pourra pas instancier
 * 
 * 
 */
public abstract class Forme {
	
	//protected int cote;
	
	/*
	 * Une methode abstraite est une methode, dont il faudra redefinir le contenu au niveau des sous-classes (classes fille)
	 * La methode aire �tant abstraite, cela veut dire que toutes les classes filles seront oblig�es d'avoir une m�thode aire
	 * Une methode abstraite n'a pas de corps
	 */
	public abstract double aire();
	
	//Une classe abstraite peut contenir des methodes non abstraite
	public String hello() {
		return "hello";
	}
	
	//Si on a une methode abstraite, elle doit obligatoirement �tre dans une classe abstraite
	
}
