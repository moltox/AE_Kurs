package Database;

import java.sql.SQLException;
import java.util.Scanner;

public class DBM_3_Helper {
	
	Scanner scanner = new Scanner( System.in );
	DBM_3 dbm = new DBM_3( );
	String eingabe;
	String[ ] input;
	int parse;
	
	public DBM_3_Helper ( ) {
		
		dbm.loadDriver( );
		dbm.connectDB( );
		menue( );
	}
	
	public void menue( ) {
		
		System.out.println( "*****************************");
		System.out.println( "Bitte auswaehlen:" );
		System.out.println( "Tabelle(Customer) anzeigen(1)" );
		System.out.println( "Datensatz löschen(2)" );
		System.out.println( "Datensatz hinzufuegen(3)" );
		System.out.println( "Datensatz suchen(4)" );
		System.out.println( "Programm beenden(5)" );
		System.out.println( "*****************************");
		System.out.print( "Eingabe:" );
		
		eingabe = scanner.next( );
		parse = Integer.parseInt( eingabe );
		menueAusw( parse );
			
	}
	
	public void menueAusw( int eingabe ) {
		
		switch ( eingabe ) {
			
		case 1:

			dbm.dbQuery( );
			menue( );
			break;
				
		case 2:
			
			dbm.deleteElement( );
			menue( );
			break;
			
		case 3:
			
			eingabeNew( );
			menue( );
			break;
			
		case 4:
			
			eingabeSearch( );
			menue( );
			break;
			
		case 5:
			
			gebeRessourcenFrei( );
			break;
			
		default:
			
			System.out.println( "Falsche Eingabe!" );
			menue( );
		}
	}
	
	public String eingabeSearch( ) {
		
		System.out.print( "Bitte Suchbegriff eingeben: " );
		eingabe = scanner.next( );
		return eingabe;
	}
	
	public void eingabe
	
	public void eingabeNew( ) {
		
		System.out.print( "Bitte Vornamen eingeben: ");
		input[ 0 ] = scanner.next( );
		System.lineSeparator( );
		
		System.out.print( "Bitte Nachnamen eingeben: ");
		input[ 1 ] = scanner.next( );
		System.lineSeparator( );
		
		System.out.print( "Bitte Strasse eingeben: ");
		input[ 2 ] = scanner.next( );
		System.lineSeparator( );
		
		System.out.print( "Bitte Stadt eingeben: ");
		input[ 3 ] = scanner.next( );
		System.lineSeparator( );
		
		dbm.insertElement( input );
	}
	
	public void gebeRessourcenFrei( ) {
		
		scanner.close( );
		
		try {
			
			dbm.rs.close( );
			dbm.con.close( );
			dbm.stmt.close( );
		} catch ( SQLException except ) {
			
			except.printStackTrace( );
		}
	}
}
