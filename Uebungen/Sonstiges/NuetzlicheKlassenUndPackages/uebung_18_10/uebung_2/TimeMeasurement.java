package NuetzlicheKlassenUndPackages.uebung_18_10.uebung_2;

import java.time.Instant;

public class TimeMeasurement {

	public static void main(String[] args) {
		String s1 = "X";
		StringBuffer sBuf = new StringBuffer("X");

		int appendCount = 10_000;
		long start, end;
		start = System.nanoTime();
		for (int c = 0; c < appendCount; c++) {
			s1 += "X";
		}
		end = System.nanoTime();

		System.out.println("String append: " + ((end - start) / 1_000_000) + "ms");
		start = System.nanoTime();
		for(int c = 0; c < appendCount; c++){
			sBuf.append('X');
		}
		end = System.nanoTime();
		System.out.println("StringBuffer append: " + ((end-start)/ 1_000_000) + "ms");
	}

}
