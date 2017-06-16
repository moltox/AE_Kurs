package SwingUndEvents;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.awt.Component;
import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Buecherverwaltung implements ActionListener {
	
	private JFileChooser fc;
	private File file;
	
	private JFrame frame;
	private Container contentPane;
	
	private JLabel lblAuthor;
	private JLabel lblTitle;
	private JLabel lblYear;
	private JLabel lblPublisher;
	private JLabel lblSort;
	
	private JTextField txtAuthor;
	private JTextField txtTitle;
	private JTextField txtYear;
	private JTextField txtPublisher;
	
	private JButton btnSave;
	private JButton btnSortByAuthor;
	private JButton btnSortByTitle;
	private JButton btnSortByYear;
	private JButton btnSortByPublisher;
	
	
	Buecherverwaltung( ) {
		
		buildFrame( );
	}
	
	static void addComponent ( 	Container cont, 
			GridBagLayout gbl, 
			Component c, 
			int x, int y, 
			int width, int height, 
			double weightx, double weighty )
	{
		GridBagConstraints gbc = new GridBagConstraints( );
		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = x;
		gbc.gridy = y;
		gbc.gridwidth = width;
		gbc.gridheight = height;
		gbc.weightx = weightx;
		gbc.weighty = weighty;
		gbl.setConstraints( c, gbc );
		cont.add( c );
	}
	
	public void buildFrame( ) {
		
		frame = new JFrame( );
		frame.setTitle( "Buecherverwaltung" );
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	
		contentPane = frame.getContentPane( );
		GridBagLayout gbl = new GridBagLayout( );
		contentPane.setLayout( gbl );
		
		lblAuthor = new JLabel( "Author:      " );
		lblAuthor.setHorizontalAlignment(JLabel.RIGHT);		
		txtAuthor = new JTextField( );
		
		
		lblTitle = new JLabel( "Titel:       " );
		lblTitle.setHorizontalAlignment( JLabel.RIGHT );	
		txtTitle = new JTextField( );
		
		lblYear = new JLabel( "Jahr:      " );
		lblYear.setHorizontalAlignment( JLabel.RIGHT );	
		txtYear = new JTextField( );
		
		lblPublisher = new JLabel( "Verlag:      " );
		lblPublisher.setHorizontalAlignment( JLabel.RIGHT );	
		txtPublisher = new JTextField( );
		
		btnSave = new JButton( "Eintrag speichern" );
		btnSave.addActionListener( this );
		
		lblSort= new JLabel( "Ausgabe sortiert nach:" );
		
		btnSortByAuthor = new JButton( "Autor" );
		btnSortByAuthor.addActionListener( this );
		
		btnSortByTitle = new JButton( "Titel" );
		btnSortByTitle.addActionListener( this );
		
		btnSortByYear = new JButton( "Jahr" );
		btnSortByYear.addActionListener( this );
		
		btnSortByPublisher = new JButton( "Verlag" );
		btnSortByPublisher.addActionListener( this );
		
												//			x  y  w  h  wx wy
		addComponent( contentPane, gbl, lblAuthor, 			0, 0, 1, 1, 1, 0);
		addComponent( contentPane, gbl, txtAuthor, 			1, 0, 4, 1, 1, 0);
		addComponent( contentPane, gbl, lblTitle, 			0, 1, 1, 1, 1, 0);
		addComponent( contentPane, gbl, txtTitle, 			1, 1, 4, 1, 1, 0);
		addComponent( contentPane, gbl, lblYear, 			0, 2, 1, 1, 1, 0);
		addComponent( contentPane, gbl, txtYear, 			1, 2, 4, 1, 1, 0);
		addComponent( contentPane, gbl, lblPublisher, 		0, 3, 1, 1, 1, 0);
		addComponent( contentPane, gbl, txtPublisher, 		1, 3, 4, 1, 1, 0);
		addComponent( contentPane, gbl, btnSave, 			2, 4, 2, 1, 1, 0);
		addComponent( contentPane, gbl, lblSort, 			0, 5, 1, 1, 1, 0);
		addComponent( contentPane, gbl, btnSortByAuthor, 	1, 5, 1, 1, 1, 0);
		addComponent( contentPane, gbl, btnSortByTitle, 	2, 5, 1, 1, 1, 0);
		addComponent( contentPane, gbl, btnSortByYear, 		3, 5, 1, 1, 1, 0);
		addComponent( contentPane, gbl, btnSortByPublisher, 4, 5, 1, 1, 1, 0);
		
		//frame.add( contentPane );
		frame.setSize( 510, 160 );
		frame.setResizable( false );
		frame.setVisible( true );
	}
	
	public void writeInFile( File file ) {
		
		try ( ObjectOutputStream oos = new ObjectOutputStream( new FileOutputStream( file, true ) ) )  {
			
		} catch ( IOException e ) {
			
			System.err.println( e.toString( ) );
		}
	}
	
	public void readOutOfFile( ) throws ClassNotFoundException {
		 
		// Stringarray in hashset
		Object o;
	
		try ( ObjectInputStream ois = new ObjectInputStream( new FileInputStream( "xyz.txt" ) ) ) {
			
			while ( ( o = ois.readObject( ) ) != null ) {
            	
				if (o instanceof HashSet < ? > ) {
            		
            	}
	        }
		} catch ( FileNotFoundException e ) {
			
			System.err.println( e.toString( ) );
		} catch ( IOException e ) {
			
			System.err.println( e.toString( ) );
		}
	}
	
	public File selectFile( ) {
		
		
		fc = new JFileChooser( );
		int option = fc.showOpenDialog( null );
				
		if ( option == JFileChooser.APPROVE_OPTION ) { 
					
			file = fc.getSelectedFile( );
					
		} else {
					
			System.out.println( "Auswahl abgebrochen" );
			System.exit( 0 );
		}
		return file;
	}

	@Override
	public void actionPerformed( ActionEvent evt ) {
		
		if ( evt.getActionCommand( ).equals( "Eintrag speichern" ) ) {
			
			file = selectFile( );
		}
		if ( evt.getActionCommand( ).equals( "Autor" ) ) {
			
		}
		if ( evt.getActionCommand( ).equals( "Titel" ) ) {
			
		}
		if ( evt.getActionCommand( ).equals( "Jahr" ) ) {
			
		}
		if ( evt.getActionCommand( ).equals( "Verlag" ) ) {
			
		}
	}
	
	public static void main( String[ ] args) {
		
		new Buecherverwaltung( );
	}
}
