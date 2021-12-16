package fr.dawan.general.constructeur;

/*
 * Une classe est d�finie par : 
 * 		- des attributs 
 * 	    - des m�thodes
 */
public class Task {
	
	//visibilit� : public 
	//Cela veut dire ques les autres pourront acceder � cette propri�t�
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
		//this faire reference � l'objet en cours
		this.description = description;
		this.title = title;
	}
	
	public void isCompleted() {
		completed = true;
	}
	
}
