package dbaccess;

public class stringexamples {
	public static void main ( String[] args ) {
		String s = "tu";
		int n = 3;
		String t = new String( new char[ n ] ).replace( "\0", s );
		System.out.println( t );
	}
}
