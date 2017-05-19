package uebung15_5;

public class AssertionTest {

	public static void main(String[] args) {
		assert (args.length == 2) : "Programmaufruf muss mit 2 Parametern erfolgen!";
		System.out.println("Assertion Test gelaufen");
	}

}
