package dbaccess;

public class Artikel {
	private long artikelnr;
	private String beschreibung;
	private double preis;
	
	Artikel () { }
	
	Artikel (final long artikelnr, final String beschreibung, final double preis) {
		this.legeArtikelnummerFest(artikelnr);
		this.legeBeschreibungfest(beschreibung);
		this.legePreisFest(preis);
	}
	
	Artikel (final long artikelnr, final double preis) {
		this(artikelnr, "", preis);
	}

	void legeArtikelnummerFest(final long neueNr){
		this.artikelnr = neueNr;
	}
	
	void legeBeschreibungfest(final String neueB){
		this.beschreibung = neueB;
	}
	
	void legePreisFest(final double neuerPreis){
		this.preis = neuerPreis;
	}
	
	public long liefereArtikelnummer() {
		return this.artikelnr;
	}
	
	public String liefereBeschreibung(){
		return this.beschreibung;
	}
	
	public double lieferePreis(){
		return this.preis;
	}
	
	void gebeInformationAus() {
		System.out.print("Artikel:");
		System.out.println(this.liefereBeschreibung());
		System.out.print("Nr:");
		System.out.println(this.liefereArtikelnummer());
		System.out.print("Preis:");
		System.out.println(this.lieferePreis());
	}
}
