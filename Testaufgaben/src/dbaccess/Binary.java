package dbaccess;

import java.util.Scanner;

public class Binary {
	public static void main (String... args) {
		int input = new Scanner( System.in ).nextInt();
		String bin = Integer.toBinaryString( input );
		System.out.println(bin);
	}
}
