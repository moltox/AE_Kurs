package uebung_17_10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Measurements {

	public static void main(String[] args) throws IOException {
		BufferedReader bufIn = new BufferedReader(new FileReader("Streams\\uebung_17_10\\valuesIn.dat"));
		BufferedWriter bufOut = new BufferedWriter(new FileWriter("Streams\\uebung_17_10\\valuesOut.dat"));
		String s;
		int messreihen = 20, messwerte = 10;
		int currentRead;
		for (int c = 0; c < messreihen; c++) {
			for (int cc = 0; cc < messwerte; cc++) {
				currentRead = bufIn.read();
				bufOut.write(currentRead);
				System.out.printf("%4d", currentRead);
			}
			System.out.printf(" Ende der Messreihe %d\n", c);
		}
		bufIn.close();
		bufOut.close();
	}
}
