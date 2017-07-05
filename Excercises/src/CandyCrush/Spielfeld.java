package CandyCrush;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Spielfeld extends JFrame {

	Feld[ ][ ] feld = new Feld[ 10 ][ 10 ];
	
	Spielfeld( ) {
		
		JFrame frame = new JFrame( );
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		JPanel panel = new JPanel( new GridLayout( 10, 10 ) );
		for ( int z = 0; z < feld.length; z++ ) {
			for ( int sp = 0; sp < feld[z].length; sp++ ) {
				Feld f = new Feld( );
				f.addActionListener( fl );
				f.setPreferredSize( new Dimension( 40, 40 ) );
				f.setBackground( generateRandomColor( ) );
				feld[z][sp] = f;
				panel.add( f );
			}
		}
		frame.add( panel );
		frame.pack( );
		frame.setVisible( true );
	}
	
	public Color generateRandomColor( ) {
		
		int random = ( int ) ( Math.random( ) * 8 );
		
		switch ( random ) {		
		case 0:			
			return new Color( 0, 0, 255 ); // blau
		case 1:			
			return new Color( 0, 255, 0 ); // grün			
		case 2:			
			return new Color( 255, 0, 0 ); // rot
		case 3:			
			return new Color( 255, 0, 255 ); // magenta
		case 4:			
			return new Color( 255, 255, 0 ); // gelb
		case 5:			
			return new Color( 255, 175, 175 ); // pink
		case 6:			
			return new Color( 128, 128, 128 ); // grey
		case 7:			
			return new Color( 0, 255, 255 ); // cyan
		default:			
			System.out.println( "Fehler beim Erzeugen des Farbwertes!" );
			return new Color( 0, 0, 0 );
		}
	}
	
	private class FeldListener implements ActionListener {
		public void actionPerformed( ActionEvent evt ) {
			for ( int z = 0; z < feld.length; z++ ) {
				for ( int sp = 0; sp < feld[ z ].length; sp++ ) {
					if( evt.getSource( ) == feld[ z ][ sp ] ) {
						System.out.println("Zeile: " + z + " Spalte: " + sp);
					}
				}
			}
		}
	}
	FeldListener fl = new FeldListener( ); 
	
	public static void main( String[ ] args ) {
		new Spielfeld( );
	}
}