package CandyCrushFuerArme;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class Tile extends JLabel {

	private static final long serialVersionUID = 1L;
	private JLabel tile;
	private Color color;
	private Dimension dimension;
	private String label;
	private Border border;
	
	private final int HEIGHT;
	private final int WIDTH;
	
	{
		HEIGHT = 20;
		WIDTH = 20;
		border = BorderFactory.createLineBorder( Color.BLACK, 1 );
	}

	Tile( ) {
		
		setTile( new JLabel ( ) );
		setColor( generateRandomColor( ) );
		setDimension( new Dimension ( HEIGHT, WIDTH ) );
		getTile( ).setSize( this.dimension );
		getTile( ).setBorder( border );
		getTile( ).setOpaque( true );
		getTile( ).setBackground( getColor( ) );
	}

	Tile( String label ) {
		
		setLabel( label );
		setTile( new JLabel ( getLabel( ) ) );
		setColor( new Color( 255, 255, 255 ) );
		setDimension( new Dimension ( HEIGHT, WIDTH ) );
		getTile( ).setVerticalTextPosition(CENTER);;
		getTile( ).setSize( this.dimension );
		getTile( ).setOpaque( true );
		getTile( ).setBackground( getColor( ) );
	}

	public JLabel getTile( ) {
		
		return this.tile;
	}
	
	protected void setTile( JLabel tile ) {
		
		this.tile = tile;
	}
	
	public Color getColor( ) {
		
		return this.color;
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
		
		int random = ( int ) ( Math.random( ) * 8 );
		System.out.println(random);
		
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
}
