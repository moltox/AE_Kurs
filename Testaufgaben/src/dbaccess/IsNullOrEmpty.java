package dbaccess;

public class IsNullOrEmpty {
	public static boolean isNullOrEmpty( String str ) {
		return str == null || str.isEmpty();
	}
	
	public static void main ( String[] args ) {
		boolean test;
		// boolean test = isNullOrEmpty( "bla" );
		System.out.println(test = isNullOrEmpty( "bla" ) );
	}
}
