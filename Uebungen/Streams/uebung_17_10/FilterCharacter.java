package uebung_17_10;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class FilterCharacter {

	public static void main(String[] args) {
		try {
			MyFilterWriter filterWriter = new MyFilterWriter(new FileWriter("Streams\\uebung_17_10\\filter.dat"));
			BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));
			String filterStr = bufRead.readLine();
			PrintWriter pWrite = new PrintWriter(filterWriter);
			pWrite.print(filterStr);
			pWrite.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
