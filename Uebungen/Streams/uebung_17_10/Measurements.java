package uebung_17_10;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Measurements {

	public static void main(String[] args) throws IOException {
		String s;
		BufferedReader bfReader = null;
		bfReader = new BufferedReader(new FileReader("Streams\\uebung_17_10\\valuesIn.dat"));
		while( ( s = bfReader.readLine()) != null) {
			System.out.println(s);
		}
		
		FileReader fRead = new FileReader("Streams\\uebung_17_10\\valuesIn.dat");
		int t = 0;
		while( ( t = fRead.read()) != -1) {
			System.out.println(t);
		}
		
		
		bfReader.close();

	}

}
