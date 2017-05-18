package dbaccess;

public class Angestellter {
	String name;
	double gehalt;
	Abteilung abteilung;
	
	// Konstruktor
	Angestellter (final String name, final double gehalt, final Abteilung abteilung) {
		this.legeNameFest(name);
		this.legeGehaltFest(gehalt);
		this.legeAbteilungFest(abteilung);
	}
	
	void legeGehaltFest (double gehalt) {
		this.gehalt = gehalt;
	}
	
	void legeNameFest (String name) {
		this.name = name;
	}
	
	double liefereGehalt () {
		return this.gehalt;
	}
	
	String liefereName() {
		return this.name;
	}
	
	void erhoeheGehalt(final double gehaltserhoehung) {
		this.gehalt = this.liefereGehalt() * (1 + gehaltserhoehung);
	}
	
	Abteilung liefereAbteilung() {
		return this.abteilung;
	}
	
	void legeAbteilungFest(Abteilung abteilung) {
		this.abteilung = abteilung;
	}
}
