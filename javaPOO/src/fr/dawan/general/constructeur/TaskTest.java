package fr.dawan.general.constructeur;

public class TaskTest {

	public static void main(String[] args) {
		
		Task task = new Task();
		
		Task task1 = new Task("Allez au cinema à 18h");
		System.out.println(task1.description);
		
		Task task2 = new Task("Aller voir Toto samedi");
		System.out.println(task2.description);
		
		Task task3 = new Task("Faire du footing", "Faire un footing à 18h avec tata, toto");
		System.out.println(task3.title + "\t" + task3.description);
		
		System.out.println(task3.completed);
		task3.isCompleted();
		System.out.println(task3.completed);
		
	}

}
