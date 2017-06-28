package CandyCrushFuerArme;

import java.awt.GridLayout;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class PlayingField {

	private JFrame frame;
	private JPanel panel;
	
	private List< Tile > tileList;
	char column;
	int row;
	
	{
		tileList = new ArrayList< Tile >( );
		column = 'A';
		row = 0;
	}

	
	PlayingField( int playfieldScale ) {
		
		frame = new JFrame( );
		frame.setTitle( "CandCrush fuer Arme" );
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
				
		panel = new JPanel( );
		panel.setLayout( new GridLayout( playfieldScale, playfieldScale ) );
		//panel.setBackground( new Color ( 255, 255, 255 ) );
		frame.setContentPane( panel );
		
		for ( int i = 0; i < Math.pow( playfieldScale, 2 ); i++ ) {
			
			tileList.add( createTile( i, playfieldScale ) ); 
		}
		
		createPlayfield( tileList, panel );
		
		frame.setResizable( false );
		frame.setSize( 400, 400 );
		frame.setVisible( true );
	}
	
	public Tile createTile( int position, int playfieldScale ) {
		
		if ( position < playfieldScale ) {
			
			Tile tile = position != 0 ? new Tile( String.valueOf( row ) ): new Tile( "" );
			row++;
			return tile;
		} else {
			
			Tile tile = ( position % playfieldScale == 0 ) ? new Tile( String.valueOf( column ) ) : new Tile( );

			if ( position % playfieldScale == 0 )
				column++;
			
			return tile;
		}
	}
	
	public JPanel createPlayfield( List< Tile > tileList, JPanel panel ) {
		
		Iterator< Tile > tileListIterator = tileList.iterator( );

		while ( tileListIterator.hasNext( ) ) {
			
			panel.add( ( JLabel ) tileListIterator.next( ).getTile( ) );
		}
		return panel;
	}
}