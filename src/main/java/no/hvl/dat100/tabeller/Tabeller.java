package no.hvl.dat100.tabeller;

public class Tabeller {

	public static String makeStr(int[] tabell, String spacer) {
		if (tabell.length == 0)
			return "";

		String str = String.valueOf(tabell[0]);
		for (int i = 1; i < tabell.length; i++)
			str += spacer + tabell[i];

		return str;
	}

	// a)
	public static void skrivUt(int[] tabell) {

		String strTabell = makeStr(tabell, " ");
		System.out.println(strTabell);
	}

	// b)
	public static String tilStreng(int[] tabell) {

		return "[" + makeStr(tabell, ",") + "]";
	}

	// c)
	public static int summer(int[] tabell) {

		int sum = 0;
		for (int i = 0; i < tabell.length; i++)
			sum += tabell[i];

		return sum;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		for (int i = 0; i < tabell.length; i++)
			if (tabell[i] == tall)
				return true;
		return false;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		for (int i = 0; i < tabell.length; i++)
			if (tabell[i] == tall)
				return i;
		return -1;
	}

	// f)
	public static int[] reverser(int[] tabell) {
		
		int arr[] = new int[tabell.length];
		for (int i = 0; i < tabell.length; i++)
			arr[tabell.length-1-i] = tabell[i];
		
		return arr;
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		for (int i = 0; i < tabell.length - 1; i++)
			if (tabell[i] > tabell[i + 1])
				return false;
		return true;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		int nyTabell[] = new int[tabell1.length+tabell2.length];
		
		for (int i = 0; i < tabell1.length; i++)
			nyTabell[i] = tabell1[i];

		for (int i = 0; i < tabell2.length; i++)
			nyTabell[tabell1.length + i] = tabell2[i];
		
		return nyTabell;
	}
}
