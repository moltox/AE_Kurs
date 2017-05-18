package dbaccess;

public class Binaersucher {
	
/*	public boolean istEnthalten(int wert, int[] feld) {
		return istEnhalten(wert, feld, 0, feld.length - 1);
	} */
	
	private boolean istEnthalten(int wert, int[] feld, int start, int ende) {
		if (ende - start <= 1) {
			return feld[start] == wert || feld[ende] == wert;
		}
		
		int mitte = start + (ende - start) / 2;
		if (feld[mitte] == wert) {
			return true;
		}
		if (feld[mitte] > wert) {
			return istEnthalten(wert, feld, start, mitte - 1);
		} else {
			return istEnthalten(wert, feld, mitte + 1, ende);
		}
	}	
}
