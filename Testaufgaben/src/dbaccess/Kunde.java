package dbaccess;

public class Kunde {
	private String name;
	private String anschrift;
	
	// Konstruktor
	Kunde (final String name, final String anschrift) {
		this.legeNameFest(name);
		this.legeAnschriftFest(anschrift);
	}
	
	void legeNameFest(final String neuerName) {
		this.name = neuerName;
	}
	
	void legeAnschriftFest(final String neueAnschrift) {
		this.anschrift = neueAnschrift;
	}
	
	String liefereName() {
		return name;
	}
	
	String liefereAnschrift() {
		return anschrift;
	}
}
