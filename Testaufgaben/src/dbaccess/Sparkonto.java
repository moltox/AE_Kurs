package dbaccess;

public class Sparkonto extends Konto{

	Sparkonto (double sparguthaben) {
		super(sparguthaben);
	}	
	void legeSparguthabenFest(double sparguthaben) {
		this.sparguthaben = sparguthaben;
	}
	double liefereSparguthaben() {
		return this.sparguthaben;
	}
	void zahleSparguthabenEin(double einzahlung) {
		this.sparguthaben += einzahlung;		
	}	
	void hebeSparguthabenAb(double abhebung) {
		if ((this.sparguthaben - abhebung) >= 0.0) {
			this.sparguthaben -= abhebung;
			System.out.println("Neues Guthaben: " + this.liefereSparguthaben());
		}
		else {
			System.out.println("Keine ausreichende Deckung vorhanden");
		}
	}
}

