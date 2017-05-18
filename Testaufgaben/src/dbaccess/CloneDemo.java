package dbaccess;

import java.awt.Point;
import java.util.Arrays;

public class CloneDemo {
	public static void main (String[ ] args) {
		int[ ] sourceArray = new int[ 6 ];
		sourceArray[ 0 ] = 4711;
		int[ ] targetArray = sourceArray.clone();
		System.out.println( targetArray.length );
		System.out.println( targetArray[ 0 ]);
		
		// --------------------------------------
		
		Point[ ] pointArray1 = { new Point( 1, 2 ), new Point( 2, 3 ) };
		Point[ ] pointArray2 = pointArray1.clone();
		
		System.out.println( pointArray1[ 0 ] == pointArray2[ 0 ]);
		
		// Clone kopiert flach, aber nicht tief. Sie referenzieren dasselbse Objekt.
		
		// ---------------------------------------
		
		int[ ] srcArray = new int[ ] {1, 2};
		int[ ] desArray = new int[ 2 ]; 
		System.arraycopy( srcArray, 0, desArray, 0, srcArray.length - 1);
		System.out.println( Arrays.toString( srcArray ) );
		
		// kopiert einen Array und gibt es mit Arrays.toString() aus
		
		// -----------------------------------------
		
		int[] numbers = { 5, 2, 9, -5, 10 };
		System.out.println(Arrays.binarySearch( numbers, 11 ) );
		Arrays.sort( numbers );
		System.out.println(Arrays.binarySearch( numbers, 11 ) );
		System.out.println(Arrays.toString( numbers )); 
		
		// Array sortieren über sort()
		
		// ------------------------------------------
		
/*		double[ ] veryBigArray = new double [1000000];
		for ( int i = 0; i < 1000000; i++) {
			veryBigArray[ i ] = Math.round(Math.random() * 100);
		} 
		
		Arrays.parallelSort(veryBigArray, 0, veryBigArray.length-1);
		System.out.println( Arrays.toString( veryBigArray ) );
*/		
		// erzeugt ein Double-Array mit 1.000.000 Elementen und sortiert jene über parallelsort
		
		// ------------------------------------------
		
		int [ ] array = { 1, 3, 0, 4 };
		int [ ] array2 = { 1, 3, 0, 4 };
		Arrays.parallelPrefix( array, ( a, b ) -> a + b );
		System.out.println( Arrays.toString( array ) );
		
		Arrays.parallelPrefix( array2, ( a, b ) -> a * b );
		System.out.println( Arrays.toString( array2 ) );
		
		// Parallele Additionsberechnung mit Hilfe eines Lambda - Ausdrucks
		
		// -------------------------------------------
		
		// Vergleichen von Arrays über equals() und deepequals
		
		int [ ] equalArray = { 1, 3, 0, 4 };
		int [ ] equalArray2 = { 1, 3, 0, 4 };

		System.out.println(Arrays.equals( equalArray, equalArray2));
		
		int [ ] [ ] a1 = { { 0, 1 } , { 1, 0 } };
		int [ ] [ ] a2 = { { 0, 1 } , { 1, 0 } };
		
		System.out.println( Arrays.equals( a1, a2 ) ); // false, da flacher Vergleich(Objektreferenz)
		System.out.println( Arrays.deepEquals( a1, a2 ) ); // true, da tiefer Vergleich(gleiche Elemente)
		
		// ------------------------------------------------
		
		// Arrays über fill() füllen
		
		char[] chars = new char [ 4 ];
		Arrays.fill( chars, 'x');
		System.out.println(Arrays.toString( chars ));
		
		// Arrays über einen Methodenaufruf füllen
		
		double[] randoms = new double[10];
		Arrays.setAll( randoms, v -> Math.round( Math.random() * 100 ) );
		System.out.println(Arrays.toString( randoms ));
		
		// ------------------------------------------------
		
		// Array - Abschnitte kopieren
		
		String [ ] snow = { "aa", "bb", "cc", "dd", "ee" };
		String [ ] snow1 = Arrays.copyOf( snow, 2 ); // kopiert "aa" und "bb" in snow1
		String [ ] snow2 = Arrays.copyOfRange( snow, 2, 5 ); // kopiert "dd" und "ee" und null in das neue snow2 
		
		// --------------------------------------------------
		
		// Vergleichen mit asList() -> bietet contains(), equals() oder subList()
		
		String [ ] a = { "aa", "bb", "cc" };
		String [ ] b = { "bb", "cc", "bla" };
		
		System.out.println(Arrays.asList( a ).subList( 1, 3).equals( Arrays.asList( b ).subList( 0, 2 ) ) );
		System.out.println(Arrays.asList( a ).contains( "bb" ));
		
		
		
		
	}
}
