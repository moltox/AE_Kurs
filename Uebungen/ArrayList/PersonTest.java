import java.util.ArrayList;

public class PersonTest {

	public static ArrayList<Person> persons;

	// Zum Testen alle ausgeben lassen
	public static void printAll() {
		for (Person p : persons) {
			System.out.print(p);
		}
	}

	public static void main(String[] args) {
		persons = new ArrayList<Person>();
		PersonMethode.hinzufuegen(new Person("Demo","test","01.23.4567"), persons);
		Person p1 = new Person("Mehr","Dabei","89.01.2345");
		PersonMethode.hinzufuegen(p1, persons);
		System.out.println("Person \"Mehr\":"+ PersonMethode.suche(p1, persons, false));
		System.out.println("\nPersonen in der Liste:");
		printAll();
		System.out.println("\nLoesche \"Demo\"");
		PersonMethode.loesche("Demo", persons);
		System.out.println("\nPersonen in der Liste:");
		printAll();
	}

}
