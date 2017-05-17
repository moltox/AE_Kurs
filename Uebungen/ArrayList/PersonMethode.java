import java.util.ArrayList;
import java.util.Iterator;

public abstract class PersonMethode {
	/**
	 * 
	 * @param p das Person Objekt oder der Name als String
	 * @param persons die ArrayList in der gesucht werden soll
	 * @param showError anzeigen wenn Person nicht in ArrayList gefunden
	 * @return Personen Objekt oder null wenn nicht gefunden
	 */
	public static Person suche(Object p, ArrayList<Person> persons, boolean showError) {
		Iterator<Person> iter = persons.iterator();
		Person tmp = null;
		while (iter.hasNext()) {
			tmp = iter.next();
			if (p instanceof Person) {
				if (tmp.getName().equals(((Person) p).getName())) {
					return tmp;
				} else {
					if (showError)
						System.out.println("\nName: \"" + ((Person) p).getName() + "\" nicht gefunden");
				}
			} else if (p instanceof String) {
				if (tmp.getName().equals(p)) {
					return tmp;
				} else {
					if (showError)
						System.out.println("\nName: \"" + (String) p + "\" nicht gefunden");
				}
			}
		}

		return null;
	}

	public static boolean loesche(Object p, ArrayList<Person> persons) {
		return persons.remove(suche(p, persons, true));
	}

	public static void aendern(Person p, String name, String vorname, String geburtsdatum, ArrayList<Person> persons) {
		if (null != p) {
			if (null != name) {
				p.setName(name);
			}
			p.setVorname(vorname);
			p.setGeburtsdatum(geburtsdatum);
		} else {
			if (null != name && !name.isEmpty())
				aendern(suche(name, persons, true), null, vorname, geburtsdatum, null);
		}
	}

	public static void hinzufuegen(Person p, ArrayList<Person> persons) {
		if (null == suche(p, persons, false))
			persons.add(p);
	}

}
