package Threads;

import java.util.Random;

public class Schoepfer extends Thread {

	String aufgabe;
	Random rd;
	static Object o;
	int buffer;
	
	static int trog;
	
	static {
		
		trog = 0;
		o = new Object();
	}
	
	Schoepfer( String aufgabe ) {
		
		setAufgabe( aufgabe );
	}
	
	public String getAufgabe() {
		
		return aufgabe;
	}

	public void setAufgabe(String aufgabe) {
		
		this.aufgabe = aufgabe;
	}
	
	public int getTrog() {
	
		return trog;
	}
	
	public static void incrementTrog( int menge ) {
		
		Schoepfer.trog += menge;
	}
	
	public int erzeugeZufallsMenge( ) {
		
		rd = new Random( );
		int zufallszahl = rd.nextInt( 20 ) + 1;
		return zufallszahl;		
	}
	
	@Override
	public void run( ) {
		
		switch ( getAufgabe( ) ) {
		
			case "pumpe":
				
				while( true ) {
					
					try {

						buffer = erzeugeZufallsMenge( );
						incrementTrog( buffer );
						System.out.println("Pumpe: " + buffer + " Liter Wasser hinzugefügt -> Neue Gesamtmenge: " + getTrog( ) );
				
						synchronized( o ) {	
							
							if ( trog > 20 ) {
								
							o.notifyAll( );
							}
						}
						sleep( 1000 );
							
					} catch( InterruptedException e ) {
					}
				}
					
			case "verteiler":

				while( true ) {
					
					try {
						synchronized( o ) {
							
							if ( trog < 20 ) {
							
								o.wait( );
							}
						}
						
						buffer = erzeugeZufallsMenge( ) * -1;
						incrementTrog( buffer );
						System.out.println("Verteiler: " + buffer*-1 + " Liter Wasser abgeschöpft -> Neue Gesamtmenge: " + getTrog( ) );
						sleep( 1000 );
						
					} catch( InterruptedException e ) {
					}
				}
					
			default:
				System.out.println( "Es konnte keine Aufgabe zugeordnet werden. - Thread beendet!" );
		}
	}
}