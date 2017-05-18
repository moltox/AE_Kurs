package dbaccess;

public class Pflanze extends Artikel {
	private double lagertemperatur;
	
	Pflanze () { }
	
	Pflanze (final long artikelnr, final String beschreibung, final double preis, final double lagertemperatur) {
		super(artikelnr, beschreibung, preis);
		this.legeLagertamperaturFest(lagertemperatur);
	}
	
	public double liefereLagertemperatur() {
		return this.lagertemperatur;
	}
	
	void legeLagertamperaturFest(final double lagertemperatur) {
		this.lagertemperatur = lagertemperatur;
	}
	
	public void gebeInformationAus() {
		super.gebeInformationAus();
		System.out.print("Lagertemperatur:");
		System.out.println(this.liefereLagertemperatur());
	}
	
//	public static void main(String args[]){
		
		/* Instanceof
		Artikel a = new Artikel();
		Pflanze p = new Pflanze();
		
		boolean aIstPflanze = a instanceof Pflanze;
		boolean pIstPflanze = p instanceof Pflanze;
		
		System.out.println("a: " + aIstPflanze + " b: " +pIstPflanze);
		*/
//	}
}
