package inheritance_polymorphism;

public class Kontrolleur {

	public int kontrolliere( String[ ] namen, Ticket[ ] tickets, int zone, String datum ) {
		
		int schwarzFahrer = 0;
		
		if( namen.length != tickets.length ) {
			
			throw new IllegalArgumentException();
		}
		
		for ( int i = 0; i < tickets.length; i++ ) {
			
			
			if( !tickets[ i ].isEntwertet( ) ) {
				
				tickets[ i ].entwerten( );
			}
			
			if ( !tickets[ i ].gueltigInZone( zone ) ||
					!( ( Generalabo) tickets[ i ]).gibInhaber().equals( namen[ i ] ) ||
						( ( Generalabo ) tickets[ i ] ).gibVerfallsDatum( ).compareTo( datum ) < 0  ||
							( ( Einzelticket ) tickets[ i ] ).gibVerfallsDatum( ).compareTo( datum ) < 0 ) {
			
				schwarzFahrer++;
			}
		}
		
		return schwarzFahrer;
	}
}
