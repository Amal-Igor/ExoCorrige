package fr.dawan.general.constructeur;

/*
 * Une classe est définie par : 
 * 		- des attributs 
 * 	    - des méthodes
 */
public class Task {
	
	//visibilité : public 
	//Cela veut dire ques les autres pourront acceder à cette propriété
	//Type complexe (valeur par defaut) = Null
	public String description;
	
	public String title;
	
	//par defaut sa valeur vaut false
	public boolean completed;
	
	
	//Constructeur par defaut
	public Task() {
	}
	
	public Task(String desc) {
		description = desc;
	}
	
	public Task(String title, String description) {
		//this faire reference à l'objet en cours
		this.description = description;
		this.title = title;
	}
	
	public void isCompleted() {
		completed = true;
	}
	
}
