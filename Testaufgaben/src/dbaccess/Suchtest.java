package dbaccess;

public class Suchtest {
	boolean istEnhalten(int wert, int[] feld) {
		for  (int i : feld) {
			if (wert == i) {
				return true;
			}
		}
		return false;
	}
	int bestimmteAnzahl (int wert, int[] feld) {
		int counter = 0;
		for (int i : feld) {
			if (wert == i) {
				counter++;
			}
		}
		return counter;
	}
	
	// auch mit erweiterter for-Schleife + String.equals()lösbar
	boolean bestimmterChar (char zeichen, String zeichenkette) {
		char[] c = zeichenkette.toCharArray();
		for (int i = 0; i <= zeichenkette.length(); i++) {
			if (c[i] == zeichen) {
				return true;
			}
		}
		return false;
	}
	
	boolean istTeilfolge(int[] feld, int[] gesuchteFolge) {
		for (int i = 0; i < feld.length - gesuchteFolge.length; i++) {
			for (int j = 0; j < gesuchteFolge.length; j++) {
				if (feld[i + j] != gesuchteFolge[j]) {
					break;
				} else if (j == gesuchteFolge.length -1){
					return true;
				}
			}
		}
		return false;
	}
	
	int bestimmeAnfangdesWorts(char[] feld, String wort) {
		//char[] c = wort.toCharArray();
		for (int i = 0; i < feld.length - wort.length(); i++) {
			for (int j = 0; j < wort.length(); j++) {
				if (feld[i+j] != wort.charAt(j)) {
					break;
				}
				else if (j == wort.length() -1) {
					return i;
				}
			}
		}
		return -1;
	}
	
	
	public static void main (String args[]) {
		int[] feld = { 2,3,4,2,3,4,2,3,4,2 };
		Suchtest a = new Suchtest();
		int ergebnis = a.bestimmteAnzahl(2, feld);
		System.out.println(ergebnis);
		String test = new String("was geht ab");
		char gesucht = 'w';
		boolean bla = a.bestimmterChar(gesucht, test);
		System.out.println(bla);
	}
}
