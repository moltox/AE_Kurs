package dbaccess;

import java.util.Scanner;

public class Summierer {
	public static void main ( String[ ] args ) {
		
		Boolean enabler = false;
		String antwort = "ja";
		String s;
		int ergebnis = 0;
		
		Scanner eingabe = new Scanner( System.in );
		
		System.out.println( "Eingabeaufforderung <ja> oder <nein>?" );
		s = eingabe.next( );
		
		if ( s.equals( antwort ) )
			enabler = true;
		
		for ( int i = 0; i < 5; i++ ) {
			if ( enabler )
				System.out.println( "Geben sie die " + ( i + 1 ) + ". Zahl ein:" );
			
			s = eingabe.next( );
			ergebnis += Integer.parseInt( s );
		}
		
		System.out.println( "Gesamtsumme: " + ergebnis );
		eingabe.close( );
	}
}
