package Errorhandling;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Exceptions {

	private JFrame frame;
	private Container contentPane;
	
	private JLabel lblDividend;
	private JLabel lblDivisor;
	
	private JTextField txtDividend;
	private JTextField txtDivisor;
	
	boolean isNumericProof;
	
	Exceptions( ) {
		
		frame = new JFrame( );
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		frame.setTitle( "Exceptions" );
		contentPane = frame.getContentPane( );
		contentPane.setLayout( new GridLayout( 2, 2 ) );
		
		lblDividend = new JLabel( "Dividend" );
		contentPane.add( lblDividend );
		
		txtDividend = new JTextField( );
		contentPane.add( txtDividend );
/*		txtDividend.addKeyListener( new KeyAdapter( ) {
			
			@Override
			public void keyTyped( KeyEvent e ) {	
				
				if( e.getKeyCode( ) == KeyEvent.VK_ENTER ) {
					
					double ergebnis = integerDivision( txtDividend.getText( ), txtDivisor.getText( ) );
					System.out.println( ergebnis );
				}
			}
		});*/
		
		lblDivisor = new JLabel( "Divisor" );
		contentPane.add( lblDivisor );
		
		txtDivisor = new JTextField( );
		contentPane.add( txtDivisor );
		txtDivisor.addKeyListener( new KeyAdapter( ) {
			
			@Override
			public void keyTyped( KeyEvent e ) {	
			
				if( e.getKeyCode( ) == KeyEvent.VK_ENTER ) {
				
					double ergebnis = integerDivision( txtDividend.getText( ), txtDivisor.getText( ) );
					System.out.println( ergebnis );
				}
			}
		});
		
		frame.setSize( 200, 80 );
		frame.setVisible( true );
	}
	
	public double integerDivision( String dividend, String divisor ) throws IllegalArgumentException,
																	NumberFormatException, ArithmeticException {
		
		if ( dividend == "" || divisor == "" ) {
			
			throw new IllegalArgumentException( );
		}
		
		else if ( !( isNumericProof = isNumeric( dividend ) ) || !( isNumericProof = isNumeric( dividend ) ) ) {
			
			throw new NumberFormatException( );
		}		
		
		else if ( divisor.equals( "0" ) ) {
			
			throw new ArithmeticException( );
		}
		else {
			
			return Double.parseDouble( dividend ) / Double.parseDouble( divisor );
		}
	}
	
	public static boolean isNumeric( String string ) {
		
		if ( string == null || string.length() == 0 ) {
			
			return false;
		}
		
		for ( int i = 0; i < string.length(); i++ ) {
			
			if ( ! Character.isDigit( string.charAt( i ) ) )
				
				return false;
		}
		return true;
	}
	
	public static void main( String[ ] args ) {
		
		try {
		
			new Exceptions();
		} catch ( ArithmeticException e ) {
			
			System.out.println( "ArithmeticException" );
		} catch ( NumberFormatException e ) {
			
			System.out.println( "NumberFormatException" );
		} catch ( IllegalArgumentException e ) {
			
			System.out.println( "IllegalArgumentException" );
		}
	}
}
