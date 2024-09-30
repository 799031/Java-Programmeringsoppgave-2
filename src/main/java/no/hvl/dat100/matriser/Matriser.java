package no.hvl.dat100.matriser;

public class Matriser {

	public static String makeStr(int[][] matrise, int row, String spacer) {
		if (matrise[row].length == 0)
			return "";

		String str = String.valueOf(matrise[row][0]);
		for (int i = 1; i < matrise[row].length; i++)
			str += spacer + matrise[row][i];

		return str;
	}

	// a)
	public static void skrivUt(int[][] matrise) {

		for (int i = 0; i < matrise.length; i++) {
			String strRow = makeStr(matrise, i, " ");
			System.out.println(strRow);
		}
	}

	// b)
	public static String tilStreng(int[][] matrise) {

		String strMatrise = "";
		for (int i = 0; i < matrise.length; i++) {
			strMatrise += makeStr(matrise, i, " ") + " \n";
		}
		return strMatrise;
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		int[][] nyMatrise = new int[matrise.length][matrise[0].length];

		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[i].length; j++) {
				nyMatrise[i][j] = matrise[i][j] * tall;
			}
		}
		return nyMatrise;

	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		if (a.length != b.length || a[0].length != b[0].length)
			return false;

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				if (a[i] != b[i])
					return false;
			}
		}
		return true;
	}
}
