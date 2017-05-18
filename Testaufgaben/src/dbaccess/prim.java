package dbaccess;

public class prim {
	public static void main(String[] args) {
		
		int n = 12;
		boolean ist_PZ = true;
		
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				ist_PZ = false;
			}
		}
		
		System.out.println("Ist "+n+" eine PZ? "+ist_PZ);
	}
}
