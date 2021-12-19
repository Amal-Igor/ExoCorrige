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
				
			if (type == 1 ) {
					System.out.println("Veuillez renseigner le nom du mod�le : ");
					clavier.nextLine();
					nom = clavier.nextLine();
					
					System.out.println("Veuillez renseigner le designer du mod�le : ");
					designer = clavier.nextLine();					
					System.out.println("Veuillez renseigner le prix du mod�le : ");
					prix = clavier.nextInt();				
					
					System.out.println("Tapez 1 pour rentrer un nouveau mod�le || Tapez 2 pour arr�ter le programme || Tapez 3 pour voir la quantit� de meuble en stock");
					reponse = clavier.nextInt();
					
					p.ajouterUnMeuble(new Chaises(nom, designer, prix, 1));
					
					if(reponse == 3 ) {
						int rep2 = 0;	
						System.out.println("Nous avons en ce moment " + p.getStock() + " meubles en stock!");	
						System.out.println("Tapez 1 pour rentrer un nouveau mod�le || Tapez 2 pour arr�ter le programme || Tapez 3 pour voir les meubles disponnibles");
						clavier.nextLine();
						rep2 = clavier.nextInt();
						
							if(rep2 == 3) {
								System.out.println(p.getMobilier()); 
							}
						
						} 
				}
				
				
				//Si l'utilisateur veut ins�rer une table
				else{
				System.out.println("Veuillez renseigner le nom du mod�le : ");
				clavier.nextLine();
				nom = clavier.nextLine();	
				
				System.out.println("Veuillez renseigner le designer du mod�le : ");
				designer = clavier.nextLine();

				System.out.println("Veuillez renseigner le prix du mod�le : ");
				prix = clavier.nextInt();	
				
				System.out.println("Tapez 1 pour rentrer un nouveau mod�le || Tapez 2 pour arr�ter le programme || Tapez 3 pour voir la quantit� de meuble en stock");
				clavier.nextLine();
				reponse = clavier.nextInt();			
				
				p.ajouterUnMeuble(new Tables(nom, designer, prix, 1));
				
					if(reponse == 3 ) {
					int rep2 = 0;	
					System.out.println("Nous avons en ce moment " + p.getStock() + " meubles en stock!");	
					System.out.println("Tapez 1 pour rentrer un nouveau mod�le || Tapez 2 pour arr�ter le programme || Tapez 3 pour voir les meubles disponnibles");
					clavier.nextLine();
					rep2 = clavier.nextInt();
					
						if(rep2 == 3) {
							System.out.println(p.getMobilier());
						}
					
					} 
				}
			} while(reponse == 1) ;
			
			
			//Si l'utilisateur veut connaitre le stock			
			 if (reponse == 2){
				 
				 System.out.println("A bientot");}
		}
		
	
		
		
	}

}
