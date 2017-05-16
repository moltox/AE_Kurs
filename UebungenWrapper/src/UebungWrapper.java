import java.util.Scanner;

public class UebungWrapper {
	
	private static String eingabe;
	private static Scanner sc = new Scanner(System.in);
	
	public static boolean isNumeric(){
		try{
			convert();
		}catch(NumberFormatException e){
			System.out.println("Keine Ganzzahl");
			return false;
		}
		return true;
	}
	
	public static int convert() throws NumberFormatException{
		return Integer.parseInt(eingabe);
	}
	
	public static void ausgabe(int zahl){
		System.out.println("Eingegebene Ganzzahl: " + zahl);
	}
	
	public static int einlesen(){
		System.out.println("Bitte Ganzzahl eingeben: ");
		eingabe = sc.next();
		return (isNumeric()) ? convert() : einlesen();
	}
	
	public static void main(String[] args) {
		ausgabe(einlesen());
	}

}
