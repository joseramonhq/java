package ejercicio5_saltoCaballo;

import java.util.Arrays;

public class Metodos {

	public static int[][] crearArrayConTodosLosMovimientosQueRealizariaSiendoPosiblesTodos() {
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int[][] aa = new int[64][a.length];
		Arrays.fill(aa, a);
		return aa;
	}

	public static int[] determinarMovimientosPosiblesDelCaballo(int[][] a, int x, int y) {
		int[] z = new int[8];
		Arrays.fill(z, 0);
		if (x - 2 >= 0 && x + 2 < a.length && y - 2 >= 0 && y + 2 < a[x + 1].length) {
			Arrays.fill(z, 1);
			return z;
		}
		if (x - 1 >= 0 && y - 2 >= 0) {
			z[0] = 1;
		}
		if (x + 1 < a.length && y - 2 <= 0) {
			z[1] = 1;
		}
		if (x + 2 < a.length && y - 1 >= 0) {
			z[2] = 1;
		}
		if (x + 2 < a.length && y + 1 < a[x + 2].length) {
			z[3] = 1;
		}
		if (x + 1 < a.length && y + 2 < a[x + 1].length) {
			z[4] = 1;
		}
		if (x - 1 >= 0 && y + 2 < a[x - 1].length) {
			z[5] = 1;
		}
		if (x - 2 >= 0 && y + 1 < a[x - 2].length) {
			z[6] = 1;
		}
		if (x - 2 >= 0 && y - 1 < a[x - 2].length) {
			z[7] = 1;
		}
		return z;

	}

	public static int[][][] determinarMovimientosPosiblesEnElTableroDependiendoDeLaPosicion(int[][] a) {

		int[][][] z = new int[a.length][a[0].length][8];

		// Movimiento 1
		for (int x = 1; x < a.length; x++) {
			for (int y = 2; y < a[x].length; y++) {
				z[x][y][0] = 1;
			}
		}
		// Movimiento 2
		for (int x = 0; x < a.length - 1; x++) {
			for (int y = 2; y < a[x].length; y++) {
				z[x][y][1] = 1;
			}
		}
		// Movimiento 3
		for (int x = 0; x < a.length - 2; x++) {
			for (int y = 1; y < a[x].length; y++) {
				z[x][y][2] = 1;
			}
		}
		// Movimiento 4
		for (int x = 0; x < a.length - 2; x++) {
			for (int y = 0; y < a[x].length - 1; y++) {
				z[x][y][3] = 1;
			}
		}
		// Movimiento 5
		for (int x = 0; x < a.length - 1; x++) {
			for (int y = 0; y < a[x].length - 2; y++) {
				z[x][y][4] = 1;
			}
		}
		// Movimiento 6
		for (int x = 1; x < a.length; x++) {
			for (int y = 0; y < a[x].length - 2; y++) {
				z[x][y][5] = 1;
			}
		}
		// Movimiento 7
		for (int x = 2; x < a.length; x++) {
			for (int y = 0; y < a[x].length - 1; y++) {
				z[x][y][6] = 1;
			}
		}
		// Movimiento 8
		for (int x = 2; x < a.length; x++) {
			for (int y = 1; y < a[x].length; y++) {
				z[x][y][7] = 1;
			}
		}
		return z;

	}

	public static int[] movimiento(int[][] tablero, int posicionActualX, int posicionActualY, int movimiento,
			String[] ArrayMovimientosEjecutados, int n) {

		switch (movimiento) {
		case 0:
			posicionActualX -= 1;
			posicionActualY -= 2;
			break;

		case 1:
			posicionActualX += 1;
			posicionActualY -= 2;
			break;

		case 2:
			posicionActualX += 2;
			posicionActualY -= 1;
			break;

		case 3:
			posicionActualX += 2;
			posicionActualY += 1;
			break;

		case 4:
			posicionActualX += 1;
			posicionActualY += 2;
			break;
		case 5:
			posicionActualX -= 1;
			posicionActualY += 2;
			break;
		case 6:
			posicionActualX -= 2;
			posicionActualY += 1;
			break;
		case 7:
			posicionActualX -= 2;
			posicionActualY -= 1;
			break;
		}
		if (tablero[posicionActualX][posicionActualY] == 1) {// Comprobación de si ya la había ocupado anteriormente
			return new int[] { -1, -1 };
		}
		tablero[posicionActualX][posicionActualY] = 1;
		ArrayMovimientosEjecutados[n] = posicionActualX + ", " + posicionActualY;

		return new int[] { posicionActualX, posicionActualY, n++ };
	}

	public static int[][] crearTablero(int x, int y) {
		return new int[x][y];
	}

}
