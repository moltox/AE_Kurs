package NuetzlicheKlassenUndPackages.uebung_18_10.uebung_1;

import java.util.Random;

public class Exercise1 {
	public static int getRandomInt(int min, int max) {
		int random = 0;
		Random rand = new Random();
		random = rand.nextInt(max - min + 1) + min;
		return random;
	}

	public static void main(String[] args) {
		int tage = 14, messungen = 10;
		int messwerte[][] = new int[tage][messungen];

		for (int c = 0; c < tage; c++) {
			for (int cc = 0; cc < messungen; cc++) {
				messwerte[c][cc] = getRandomInt(20, 35);
			}
		}
		// Ausgabe
		System.out.println("Temperaturen in Grad Celsius");
		System.out.println("----------------------------");

		int tmpAll = 0, tmpMessungen = 0;
		for (int c = 0; c < tage; c++) {
			for (int cc = 0; cc < messungen; cc++) {
				tmpMessungen += messwerte[c][cc];
				tmpAll += messwerte[c][cc];
				System.out.print(messwerte[c][cc] + " ");
			}
			System.out.print(" - Durchschnitts-Temperatur: " + (int) ((float) tmpMessungen / messungen) + "\r\n");

			tmpMessungen = 0;
		}
		System.out.println("Gesamt-Durchschnitts-Temperatur: " + (int) ((float) tmpAll / (tage*messungen)));
	}

}
