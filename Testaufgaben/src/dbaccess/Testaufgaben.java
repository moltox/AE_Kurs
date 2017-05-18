package dbaccess;

import java.awt.*;

public class Testaufgaben {
	public static void main( String[ ] args ) {
		Point pt1 = new Point ( 10, 10 );
		Point pt2 = new Point ( 30, 30 );
		
		
		// Aufgabe 1 -->
		
		double flaeche = Math.abs( ( pt2.getX( ) - pt1.getX( ) ) * 
									( pt2.getY( ) - pt1.getY( ) ) );
		System.out.println( "Die Flaeche betraegt: " + ( int ) flaeche );
		// <---------
		System.out.println( "----" );
		// Aufgabe 2 -->
		Point ptAlias = pt1;
		if ( pt1 == ptAlias ) 
			System.out.println( "pt1 und ptAlias verweisen auf dasselbe Objekt" );
		
		System.out.println( "-----" );
		System.out.println( "Point pt1 vorher: " + pt1.toString( ) );
		System.out.println( "Point ptAlias vorher: " + ptAlias.toString( ) );
		
		ptAlias.move( ( int ) pt1.getX( ) * 2, ( int ) pt1.getY( ) * 2 );
		
		System.out.println( "-----" );
		System.out.println( "Point pt1 nachher: " + pt1.toString( ) );
		System.out.println( "Point ptAlias nachher: " + ptAlias.toString( ) );
		
		// Aufgabe 3 -->
		System.out.println( "-----" );
		
		String str1, str2, str3, str4;
		
		str1 = "Bo, die Katze";
		str2 = "Bo, die Katze";
		
		str3 = new String("Fred, der Hund");
		str4 = new String("Fred, der Hund");
		
		
		if ( str1 == str2 )
			System.out.println("str1 und str2 referenzieren dasselbe Objekt");
		
		if ( str3 == str4 )
			System.out.println("str3 und str4 referenzieren dasselbe Objekt");
		
		
		
	}	
}
