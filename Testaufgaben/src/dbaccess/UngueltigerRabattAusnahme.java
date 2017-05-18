package dbaccess;

public class UngueltigerRabattAusnahme extends Exception{
	public UngueltigerRabattAusnahme(double rabatt) {
		super("Ein Rabatt von " + rabatt + " ist nicht zulässig");
	}
}
