package dbaccess;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailAddresses {
	public static void main ( String[] args) {
		printAllEmailAdresses( "http://www.gamestar.de/about/");
	}
	
	static void printAllEmailAdresses( String urlString ) {
		try {
			URL url = new URL( urlString );
			Scanner scanner = new Scanner( url.openStream( ) );
			Pattern pattern = Pattern.compile( "[\\w|-]+@\\w[\\w|-]*\\.[a-z]{2,3}" );
			
			while ( scanner.hasNextLine( ) ) {
				String line = scanner.nextLine( );
				for ( Matcher m = pattern.matcher( line ); m.find( ); )
					System.out.println( m.group( ) );
			}
			scanner.close();
		}
		catch ( MalformedURLException e ) {
			System.err.println( "URL ist falsch aufgebaut" );
		}
		catch ( IOException e ) {
			System.err.println ( "URl konnte nicht geöffnet werden" );
		}
	}
}
