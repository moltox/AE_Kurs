package CandyCrushFuerArme;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;

public class Tile extends JLabel {

	private static final long serialVersionUID = 1L;
	private JLabel tile;
	private Color color;
	private Dimension dimension;
	private String label;
	
	private final int HEIGHT = 20;
	private final int WIDTH = 20;

	Tile( ) {
		
		setTile( new JLabel ( ) );
		setColor( generateRandomColor( ) );
		setDimension( new Dimension ( HEIGHT, WIDTH ) );
		getTile( ).setSize( this.dimension );
		getTile( ).setBackground( getColor( ) );
	}

	Tile( String label ) {
		
		setLabel( label );
		setTile( new JLabel ( getLabel( ) ) );
		setColor( new Color( 255, 255, 255 ) );
		setDimension( new Dimension ( HEIGHT, WIDTH ) );
		getTile( ).setSize( this.dimension );
		getTile( ).setBackground( getColor( ) );
	}

	public JLabel getTile( ) {
		
		return tile;
	}
	
	protected void setTile( JLabel tile ) {
		
		this.tile = tile;
	}
	
	public Color getColor( ) {
		
		return color;
	}
	
	protected void setColor( Color color ) {
		
		this.color = color;
	}
	
	public Dimension getDimension( ) {
		
		return dimension;
	}

	protected void setDimension( Dimension dimension ) {
		
		this.dimension = dimension;
	}
	
	protected void setLabel( String label ) {
		
		this.label = label;
	}
	
	public String getLabel( ) {
		
		return this.label;
	}
	
	public Color generateRandomColor( ) {
		
		int random = ( int ) Math.random( ) * 7;
		
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
			
			System.out.println( "Fehler beim erzeugen des Farbwertes!" );
			return new Color( 0, 0, 0 );
		}
	}
}
