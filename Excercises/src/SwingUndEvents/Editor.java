package SwingUndEvents;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Editor extends JFrame {
	
	private JFrame frame;
	private JMenuBar mbar;
	private JMenu menu1;
	private JMenu menu2;
	
	Editor( ) {
		
		frame = new JFrame( );
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		
		mbar = new JMenuBar( );
		
		menu1 = new JMenu( );
/*		menu1.add( new JMenuItem( "Neu..." ) );
		menu1.add( "Oeffnen..." );
		menu1.add( "Schlieﬂen" );
		menu1.addSeparator( );
		menu1.add( "Speichern" );
		menu1.add( "Speichern unter..." );
		menu1.add( "Als Webseite speichern..." );
		menu1.add( "Suchen..." );
		menu1.addSeparator( );
		menu1.add( "Versionen" );
		menu1.addSeparator( );
		menu1.add( "Seite einrichten..." );
		menu1.add( "Seitenansicht" );
		menu1.add( "Drucken..." );
		menu1.addSeparator( );
		menu1.add( "Senden an" );
		menu1.add( "Eigenschaften" );
		menu1.addSeparator( );
		menu1.add( "Beenden" );
		*/
		mbar.add( menu1 );
		setJMenuBar( mbar );
		setSize( 500, 500 );
		setVisible( true );
		
		
		
	}

	public static void main( String[ ] args ) {

		new Editor( );
	}

}
