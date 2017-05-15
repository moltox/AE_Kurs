package main;

public class Main {
	public static void main(String[] args) {
		for (int F = 0; F <= 300; F += 20)
			System.out.format("%3d | %.2f \n", F, ((5.0 / 9.0) * (F - 32)));
	}
}