package fr.dawan.exoSolo.exInternet;

import java.util.Scanner;
import fr.dawan.exoSolo.exInternet.*;


public class Execution {
	
	public static void main(String[] args) {
		
		IStock p = new Stock();
		
		try (Scanner clavier = new Scanner(System.in)) {
			String nom;
			String designer;
			int type;
			int prix;
			int reponse = 1;
			
			System.out.println("------------------------------BONJOUR---------------------------------");
			System.out.println("----------------Tapez 1 pour lancer le programme----------------------");
			reponse = clavier.nextInt();
			
			System.out.println("-----------------------------------------------------------------------");	
			
			do{	
				clavier.nextLine();

				System.out.println("Tapez 1 pour ajouter une chaise || Tapez 2 pour ajouter une table ");
				type = clavier.nextInt();
			
				
				//Si l'utilisateur veut ajouter une chaise
			if (type == 1 ) {
					int rep1 = 0;

					System.out.println("Veuillez renseigner le nom du modèle : ");
					clavier.nextLine();
					nom = clavier.nextLine();
					
					System.out.println("Veuillez renseigner le designer du modèle : ");
					designer = clavier.nextLine();					
					System.out.println("Veuillez renseigner le prix du modèle : ");
					prix = clavier.nextInt();				
					
					System.out.println("Tapez 1 pour rentrer un nouveau modèle || Tapez 2 pour arrêter le programme || Tapez 3 pour voir la quantité de meuble en stock");
					rep1 = clavier.nextInt();
					
					p.ajouterUnMeuble(new Chaises(nom, designer, prix, 1));
					
					
					//Permet de fermer le programme si un utilisateur veut quitter le programme apres insertion CHAISE
					if(rep1 == 2) {
						System.out.println("A bientot");
						break;
					}
					
					
					//Affiche les informations relatives au stock
					if(rep1 == 3 ) {
						int rep2 = 0;	
						System.out.println("Nous avons en ce moment " + p.getStock() + " meubles en stock!");
						
						//Pour voir la lsite des meubles disponnibles
						System.out.println("Tapez 1 pour rentrer un nouveau modèle || Tapez 2 pour arrêter le programme || Tapez 3 pour voir les meubles disponnibles");
						clavier.nextLine();
						rep2 = clavier.nextInt();
						
							if(rep2 == 3) {
								p.getMobilier();		
							}
							
							if(rep2 == 2) {
								System.out.println("A bientot");
								break;
							}
						
						} 
				}
				
				
				//Si l'utilisateur veut insérer une table
				else{
				System.out.println("Veuillez renseigner le nom du modèle : ");
				clavier.nextLine();
				nom = clavier.nextLine();	
				
				System.out.println("Veuillez renseigner le designer du modèle : ");
				designer = clavier.nextLine();

				System.out.println("Veuillez renseigner le prix du modèle : ");
				prix = clavier.nextInt();	
				
				System.out.println("Tapez 1 pour rentrer un nouveau modèle || Tapez 2 pour arrêter le programme || Tapez 3 pour voir la quantité de meuble en stock");
				clavier.nextLine();
				reponse = clavier.nextInt();			
				
				p.ajouterUnMeuble(new Tables(nom, designer, prix, 1));
				
				//Permet de fermer le programme si un utilisateur veut quitter le programme apres insertion TABLE
				if(reponse == 2) {
					System.out.println("A bientot");
					break;
				}
				
					if(reponse == 3 ) {
					int rep2 = 0;	
					System.out.println("Nous avons en ce moment " + p.getStock() + " meubles en stock!");	
					System.out.println("Tapez 1 pour rentrer un nouveau modèle || Tapez 2 pour arrêter le programme || Tapez 3 pour voir les meubles disponnibles");
					clavier.nextLine();
					rep2 = clavier.nextInt();
					
						if(rep2 == 3) {
							p.getMobilier();
						}
						
						if(reponse == 2) {
							System.out.println("A bientot");
							break;
						}
					} 
				}		
			} while(reponse == 1) ;
					 
		}
		
	
		
		
	}

}
