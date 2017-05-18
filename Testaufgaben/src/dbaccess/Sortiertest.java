package dbaccess;

public class Sortiertest {
	
	// Insertion - Sort
	int[] sortiereAufsteigend(int[] feld) {
		int swaps = 0;
		int comparisons = 0;
		for (int i = 1; i < feld.length; i++) {
			for (int j = i; j > 0; j--) {
				comparisons++;
				if (feld[j - 1] > feld[j]) {
					int temp = feld[j];
					feld[j] = feld[j-1];
					feld[j-1] = temp;
					swaps++;
				} else {
					break;
				}
			}
		}
		int[] ergebnis = new int[2];
		ergebnis[0] = swaps;
		ergebnis[1] = comparisons;
		return ergebnis;
	}
	
	// Bubble - Sort
	int[] bubblesort(int[] feld) {
		int swaps = 0;
		int comparisons = 0;
		boolean sorted = true;
		for (int i = 0; i < feld.length - 1; i++) {
			for (int j = 0; j < feld.length - 1 - i; j++) {
				comparisons++;
				if (feld[j] > feld[j + 1]) {
					int temp = feld[j];
					feld[j] = feld[j+1];
					feld[j+1] = temp;
					sorted = false;
					swaps++;
				}
			}
			if (sorted) {
				break;
			}
		}
		int[] ergebnis = new int[2];
		ergebnis[0] = swaps;
		ergebnis[1] = comparisons;
		return ergebnis;
	}
	
	// Selectionsort
	int[] selectionsort(double[] feld) {
		int swaps = 0;
		int comparisons = 0;
		for (int i = 0; i < feld.length - 1; i++) {
			int max = 0;
			for (int j = 0; j < feld.length - i; j++) {
				comparisons++;
				if (feld[j] > feld[max]) {
					max = j;
				}
			}
			if ( max != feld.length - 1 - i) {
				comparisons++;
				swaps++;
				double temp = feld[max];
				feld[max] = feld[feld.length - 1 -i];
				feld[feld.length - 1 -i] = temp;
			}
		}
		int[] ergebnis = new int[2];
		ergebnis[0] = swaps;
		ergebnis[1] = comparisons;
		return ergebnis;
	} 
	
	public static void main (String args[]) {
		int[] feld1 = {4, 35, 23, 5, 2, 67, 45, 21};
		int[] feld2 = {4, 35, 23, 5, 2, 67, 45, 21};
		double[] feld3 = {4, 35, 23, 5, 2, 67, 45, 21};
		
		Sortiertest insertionsort = new Sortiertest();
		Sortiertest bubblesort = new Sortiertest();
		Sortiertest selectionsort = new Sortiertest();
		
		int[] anzahlInsert = new int[2];
		int[] anzahlBubble = new int[2];
		int[] anzahlSelection = new int[2];
		
		anzahlInsert = insertionsort.sortiereAufsteigend(feld1);
		anzahlBubble = bubblesort.bubblesort(feld2);
		anzahlSelection = selectionsort.selectionsort(feld3);
		
		System.out.println("Insertionsort braucht: "+anzahlInsert[0]+" Vertauschungen und "+anzahlInsert[1]+" Vergleiche");
		System.out.println("Bubblesort braucht: "+anzahlBubble[0]+" Vertauschungen und "+anzahlBubble[1]+" Vergleiche");
		System.out.println("Selectionsort braucht: "+anzahlSelection[0]+" Vertauschungen und "+anzahlSelection[1]+" Vergleiche");
	
	}
}
