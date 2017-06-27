package dhbw_karlsruhe.Arrays;

public class Pascal {

	public static void main( String[ ] args ) {
		
		int[ ][ ] pascal = new int[ 10 ][ ];		
		int anzahlElemente = 1;
		
		for ( int columnId = 0; columnId < pascal.length; columnId++ ) {
			
			pascal[ columnId ] = new int[ columnId + 1 ];
			for ( int rowId = 0; rowId < anzahlElemente; rowId++ ) {
			
				pascal[ columnId ][ rowId ] = 
			}			
		}
	}
}