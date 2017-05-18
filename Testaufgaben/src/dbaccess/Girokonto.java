package dbaccess;

public class Girokonto extends Konto{
	double dispogrenze;
	
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
		if (((this.sparguthaben + this.dispogrenze) - abhebung) >= 0.0) {
			this.sparguthaben -= abhebung;
			System.out.println("Neues Guthaben: " + this.liefereSparguthaben());
		}
		else {
			System.out.println("Keine ausreichende Deckung vorhanden");
		}
	}
	void legeDispogrenzeFest(double dispogrenze){
		this.dispogrenze = dispogrenze;
	}
	double liefereDispoGrenze(){
		return this.dispogrenze;
	}
}
