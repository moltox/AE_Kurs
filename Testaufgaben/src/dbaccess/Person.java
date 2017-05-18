package dbaccess;

// 

public class Person {
	String name;
	
	public void gebeNameAus() {
		System.out.println(name);
	}
	
	public static void main (String args[]) {
		new Student().gebeMatrikelnrAus();
	}
}

class Student extends Person {
	long matrikelnr;
	
	public void gebeMatrikelnrAus(){
		System.out.println(matrikelnr);
	}
}

class Mitarbeiter extends Person {
	int raumnr;
	Organisationseinheit abteilung;
	
	public void gebeRaumnrAus() {
		System.out.println(raumnr);
	}
}

class Professor extends Mitarbeiter {
	
}

class Organisationseinheit {
	String name;
}

class Lehrgebiet extends Organisationseinheit {
	Professor inhaber;
}

