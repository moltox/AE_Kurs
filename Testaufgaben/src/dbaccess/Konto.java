package dbaccess;

public abstract class Konto {
	double sparguthaben;
	
	Konto (double sparguthaben) {
		this.sparguthaben = sparguthaben;
	}
	Konto(){		
	}
	abstract void legeSparguthabenFest(double sparguthaben);
	abstract double liefereSparguthaben();
	abstract void zahleSparguthabenEin(double einzahlung);
	abstract void hebeSparguthabenAb(double abhebung);
}
