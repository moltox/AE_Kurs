package dbaccess;

public class Rechnungssammlung {
	private Rechnung[] Rechnung;
	
	int bestimmeGesamtbetragAllerRechnungenVon(Kunde k, Rechnung[] rechnungen){
		if (k == null || rechnungen == null) {
			return 0;
		}
		int betrag = 0;
		for (Rechnung r : rechnungen) {
			if (r.liefereRechnungsempfaenger() == k) {
				betrag += r.bestimmeBetragInCent();
			}
		}
		return betrag;
	}
}
