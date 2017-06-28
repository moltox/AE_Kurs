package CandyCrushFuerArme;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.JFrame;


public class PlayingField {

	private JFrame frame;
	private Container container;
	
	private List< Tile > tileList;
	char column;
	int row;
	
	{
		tileList = new ArrayList< Tile >( );
		column = 'A';
		row = 1;
	}

	
	PlayingField( int playfieldScale ) {
		
		frame = new JFrame( );
		frame.setTitle( "CandCrush fuer Arme" );
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		
		container = new Container( );		
		container = frame.getContentPane( );
		container.setLayout( new GridLayout( playfieldScale, playfieldScale ) );
		container.setBackground( new Color ( 255, 255, 255 ) );
		
		for ( int i = 0; i < Math.pow( playfieldScale, 2 ); i++ ) {
			
			tileList.add( createTile( i, playfieldScale ) ); 
		}
		
		Iterator< Tile > tileListIterator = tileList.iterator( );
		
		while ( tileListIterator.hasNext( ) ) {
			
			container.add( tileListIterator.next( ) );
		}
		frame.pack();
		frame.setSize( 400, 400);
		frame.setVisible( true );
	}
	
	public Tile createTile( int position, int playfieldScale ) {
		
		if ( position < playfieldScale ) {
			
			Tile tile = position != 0 ? new Tile( String.valueOf( row ) ): new Tile( "" );
			row++;
			return tile;
		} else {
			
			Tile tile = position % position == 0 ? new Tile( String.valueOf( column ) ): new Tile( );
			column++;
			return tile;
		}
	}
}