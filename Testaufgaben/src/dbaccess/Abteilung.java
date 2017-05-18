package dbaccess;

public class Abteilung {
	int abteilungsnummer;
	String abteilungsname;
	Angestellter angestellter;
	
	//Konstruktor
	Abteilung (int abteilungsnummer, String abteilungsname, Angestellter angestellter) {
		this.abteilungsnummer = abteilungsnummer;
		this.abteilungsname = abteilungsname;
		this.angestellter = angestellter;
	}
	
	// statt direkter Werteübergabe können auch die entsprechenden Setter-Methoden aufgerufen werden
	void legeAbteilungsnummerFest(int abteilungsnummer) {
		this.abteilungsnummer = abteilungsnummer;
	}
	
	int liefereAbteilungsnummer() {
		return this.abteilungsnummer;
	}
	
	void legeAbteilungsnameFest(final String abteilungsname) {
		this.abteilungsname = abteilungsname;
	}
	
	String liefereAbteilungsname() {
		return this.abteilungsname;
	}
	
	void legeAngestelltenFest(Angestellter angestellter) {
		this.angestellter = angestellter;
	}
	
	Angestellter liefereAngestellter() {
		return this.angestellter;
	}
}
