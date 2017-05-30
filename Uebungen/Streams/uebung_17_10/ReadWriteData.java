package uebung_17_10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ReadWriteData {

	public static void main(String[] args) throws IOException {
		BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<List<String>> eingaben = new ArrayList<List<String>>();

		boolean moreData = true;
		String command = "";
		String eingabeAufforderung[] = { "Name: ", "Geschlecht: ", "Größe(in cm): ", "Gewicht(in kg): " };

		while (moreData) {
			System.out.println("Daten eingeben (J)a / (N)ein ?");
			command = bufRead.readLine();

			if (command.equals("J") || command.equals("j")) {
				List<String> in = new LinkedList<String>();

				for (int c = 0; c < eingabeAufforderung.length; c++) {
					
					System.out.print(eingabeAufforderung[c]);
					in.add(bufRead.readLine());
				}
				eingaben.add(in);
			} else if (command.equals("N") || command.equals("n")) {
				System.out.println("Beende und Speicher Daten!");
				moreData = false;
			} else {
				continue;
			}
		} ;
		bufRead.close();
	/*	
		BufferedWriter bufWrite = new BufferedWriter(new FileWriter("Streams\\uebung_17_10\\personal.csv"));
		
		char delimiter = ',';
		bufWrite.write("sep=,");
		bufWrite.newLine();
		for (List<String> al : eingaben) {
			Iterator<String> it = al.iterator();

			while (it.hasNext()) {
				bufWrite.write("\""+it.next()+"\"" + delimiter);
			}
			bufWrite.newLine();
		
		}
		bufWrite.close();
		*/
		PrintWriter pWriter = new PrintWriter(new FileWriter("Streams\\uebung_17_10\\personal.csv"));
		char delimiter = '|';
		pWriter.write("sep=|");
		pWriter.println();
		for(List<String> listen : eingaben){
			Iterator<String> iter = listen.iterator();
			while(iter.hasNext()){
				pWriter.print("\""+iter.next()+"\"" + delimiter);
			}
			pWriter.println();
		}
		pWriter.close();
	}
}
