package dbaccess;

public class FormatException {
	public static void main ( String[] args ) {
		try {
			Integer.parseInt( "19%" );
		}
		catch ( NumberFormatException e ) {
			String name = e.getClass( ).getName( );
			String msg = e.getMessage( );
			String s = e.toString( );
			
			System.out.println( "1 " +  name );
			System.out.println( "2 " + msg );
			System.out.println( "3 " + s );
			
			e.printStackTrace();
		}
	}
}
