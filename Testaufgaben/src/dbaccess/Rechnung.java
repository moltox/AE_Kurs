package dbaccess;

public class Rechnung {
	static final double STANDARD_MEHRWERTSTEUERSATZ = 0.19;
	static int naechsteRechnungsnummer = 10000;
	
	private double betrag = 0;
	private double mehrwertsteuer;
	private double rabatt;
	Kunde rechnungsempfaenger;
	final int rechnungsnummer;

	// Konstruktoren
	Rechnung (double mwst) {
		this.mehrwertsteuer = mwst;
		this.rechnungsnummer = Rechnung.naechsteRechnungsnummer;
		Rechnung.berechneNaechsteRechnungsnummer();
	}
	
	Rechnung () {
		this(Rechnung.STANDARD_MEHRWERTSTEUERSATZ);
	}
	
	static int berechneNaechsteRechnungsnummer() {
		return Rechnung.naechsteRechnungsnummer++;
	}
	
	void legeRabattfest(final double neuerRabatt) 
			throws NegativerRabattAusnahme, ZuHoherRabattAusnahme {
		if(neuerRabatt < 0) {
			throw new NegativerRabattAusnahme(neuerRabatt);
		}
		if(neuerRabatt >1) {
			throw new ZuHoherRabattAusnahme(neuerRabatt);
		}
		this.rabatt = neuerRabatt;
	}
	
	void legeMehrwertsteuerFest(final double neueMwst) 
			throws NegativerRabattAusnahme {
		if(neueMwst < 0) {
			throw new NegativerRabattAusnahme(neueMwst);
		}
		this.mehrwertsteuer = neueMwst;
	}
	
	void fuegePostenHinzu(final int anzahl,
			final double einzelpreis) {
		this.betrag += anzahl * einzelpreis;
	}
	
	void legeRechnungsempfaengerfest(final Kunde empfaenger) {
		this.rechnungsempfaenger = empfaenger;
	}
	
	double liefereBetrag() {
		return this.betrag;
	}
	
	double liefereMehrwertsteuer() {
		return this.mehrwertsteuer;
	}
	
	double liefereRabatt() {
		return this.rabatt;
	}
	
	Kunde liefereRechnungsempfaenger() {
		return this.rechnungsempfaenger;
	}
	
	double berechneNettoPreis() {
		return this.liefereBetrag() * (1 - this.liefereRabatt());
	}
	
	double berechneMehrwertsteuer() {
		return this.berechneNettoPreis()
				* this.liefereMehrwertsteuer();
	}
	double berechneBruttoPreis() {
		return this.berechneNettoPreis()
				+ this.berechneMehrwertsteuer();
	}
	public int bestimmeBetragInCent() {
		this.betrag *= this.liefereBetrag();
		return (int) this.betrag;
	}
	
/*	void gebeAus() {
		System.out.println("An:");
		System.out.println(this.liefereRechnungsempfaenger().liefereName());
		System.out.println(this.liefereRechnungsempfaenger().liefereAnschrift());
		System.out.print("Netto:");
		System.out.println(this.berechneNettoPreis());
		System.out.print("Mwst:");
		System.out.println(this.berechneMehrwertsteuer());
		System.out.print("Brutto: ");
		System.out.println(this.berechneBruttoPreis());
	}	*/
}
