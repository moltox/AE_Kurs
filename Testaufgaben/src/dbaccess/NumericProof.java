package dbaccess;

public class NumericProof {
	public static boolean isNumeric( String string ) {
		if ( string == null || string.length() == 0 ) {
			return false;
		}
		
		for ( int i = 0; i < string.length(); i++ ) {
			if ( ! Character.isDigit( string.charAt( i ) ) )
				return false;
		}
		return true;
	}
	public static void main( String[] args ) {
		System.out.println( isNumeric( "1234" ) );
		System.out.println( isNumeric( "12.4" ) );
		System.out.println( isNumeric( "-123" ) );
	}
}
