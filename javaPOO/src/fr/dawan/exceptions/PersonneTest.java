package fr.dawan.exceptions;

public class PersonneTest {

	public static void main(String[] args) {

		Personne p1 = new Personne("Toto", 37);

		try {
			System.out.println(7/0);
		} catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}

		try {
			p1.setAge(12);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Continue......");


	}

}
