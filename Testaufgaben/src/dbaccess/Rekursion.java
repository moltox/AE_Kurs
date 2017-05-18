package dbaccess;

public class Rekursion {
	int summeRekursiv(int n) {
		if (n == 0) {
			return 0;
		}
		return summeRekursiv(n-1) + n;
	}
	
	int fakultaetIterativ(int n) {
		int ergebnis = 1;
		for (int i = 1; i <= n; i++) {
			ergebnis *= i;
		}
		return ergebnis;
	}
	
	int fakultaetRekursiv(int n) {
		if (n == 0) {
			return 1;
		}
		return n * fakultaetRekursiv(n-1);
	}
	
	double power(int p, int n) {
		if (n == 0) {
			return 1;
		}
		return p * power(p, n-1);
	}
	
	long fibRekursiv(int n) {
		if (n < 0) {
			throw new IllegalArgumentException();
		}
		if (n == 0 || n == 1) {
			return n;
		}
		return fibRekursiv(n - 1) + fibRekursiv(n - 2);
	}
	
	long fibIterativ(int n) {
		if (n < 0) {
			throw new IllegalArgumentException();
		}
		if (n == 0 || n == 1) {
			return n;
		}
		
		int a = 0;
		int b = 1;
		
		for (int i = 2; i <= n; i++) {
			int temp = a + b;
			a = b;
			b = temp;
		}
		return b;
	}
	
	boolean istPalindromIterativ(String s) {
		int laenge = s.length();
		for (int i = 0; i < s.length()/2; i++) {
			if (s.charAt(i) != s.charAt(laenge - 1 - i)) {			
				return false;
			}			
		}
		return true;
	}
	
	boolean istPalindromRekursiv(String s) {
		if (s.length() <= 1) {
			return true;
		}
		if (s.charAt(0) != s.charAt(s.length() - 1)) {
			return false;
		}
		return istPalindromRekursiv(s.substring(1, s.length() - 1));
	}

	
	long zufallszahl(int n) {
		if (n  < 3) {
			return n + 1;
		}
		long f1 = zufallszahl(n-1);
		long f2 = zufallszahl(n-2);
		long f3 = zufallszahl(n-3);
		return 1 + (((f1 - f2) * f3) % 100);
	}
	
	void gebeZufallszahlenAus() {
		for (int i = 5; i < 30; i++) {
			System.out.println(zufallszahl(i));
		}
	}
	
	
	public static void main (String args[]) {
		Rekursion rek = new Rekursion();
		String s = new String("lagerregal");
		boolean antwort = rek.istPalindromIterativ(s);
		System.out.println(antwort);
		/*int x = rek.fakultaetRekursiv(4);
		int y = rek.fakultaetIterativ(4);
		double z = rek.power(7, 3);
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);*/
	}
}
