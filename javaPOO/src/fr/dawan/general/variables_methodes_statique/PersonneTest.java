package fr.dawan.general.variables_methodes_statique;

public class PersonneTest {

	public static void main(String[] args) {
		
		Personne p1 = new Personne("Toto", 37);
		Personne p2 = new Personne("tata", 48);
		Personne p3 = new Personne("Mackenyu");
		
		System.out.println(Personne.getNombreTotalDePersonnes());
	}

}
