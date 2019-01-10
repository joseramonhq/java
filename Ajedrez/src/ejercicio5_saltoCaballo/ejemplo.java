package ejercicio5_saltoCaballo;

public class ejemplo {
	public static void main(String[] args) {

		// Crear tablero

		System.out.println("Vamos a crear el tablero.\nDame el numero de casillas en el eje X");
		int[][] a;
		int xx = InputData.leerEntero();
		System.out.println("Ahora dame el número de casillas en el eje Y");
		int yy = InputData.leerEntero();
		a = Metodos.crearTablero(xx, yy);
		System.out.println("Dame posicion inicial X");
		int posicionX=InputData.leerEntero();
		System.out.println("Dame la posicion inicial Y");
		int posicionY=InputData.leerEntero(); 
		String[] localizaciones = new String[a[0].length * a.length];
		localizaciones[0]=posicionX+", "+posicionY;
		int n=1;
		int[][][] moves=Metodos.determinarMovimientosPosiblesEnElTableroDependiendoDeLaPosicion(a);
		for (int i = 0; i < localizaciones.length;i++) {
			for(int x=0;x<)
		}

		
			for (int[] d : a) {
				System.out.println();
				for (int e : d) {
					System.out.print(e);
				}
			}
		

	}
}
