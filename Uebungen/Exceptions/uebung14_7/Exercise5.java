package uebung14_7;

public class Exercise5 {
	public static void binTest() {
		System.out.println("10111011 ist " + BinaryStringToNumber.parseBinary("10111011"));
		String s = "10511011";
		System.out.println(s + " ist " + BinaryStringToNumber.parseBinary(s));
	}

	public Exercise5() {
		binTest();
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		try {
			Exercise5 ConvertingBinary = new Exercise5();
		} catch (NoBinaryNumberException execpt) {
			System.out.println("Catched Exception :\n" + execpt.getMessage());
			throw execpt;
		} finally {
			System.out.println("\nFinally Block");
		}
	}
}
