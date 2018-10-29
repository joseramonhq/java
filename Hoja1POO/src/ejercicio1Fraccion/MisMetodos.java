package ejercicio1Fraccion;

public class MisMetodos {
	static final double PI = Math.PI;

	public static int factorial(int n) {
		int result = 1;
		for (int i = 2; i <= n; i++) {
			result *= i;
		}
		return result;

	}

	public static double areaCirculo() {//////////////////////////// ejercicio 1
		return PI * Math.pow(InputData.readInt(), 2);
	}

	public static double areaCirculo(int n) {//////////////////////////// ejercicio 1
		return PI * Math.pow(n, 2);
	}

	public static void ecuacionSegundoGrado() {
		int a, b, c;
		double x = 0;
		System.out.print("Para resolver la ecuación dame primero el valor de a. ");//////////////////////// ejercicio 2
		a = InputData.readInt();
		System.out.print("Ahora dame b. ");
		b = InputData.readInt();
		System.out.print("Y por último dame c. ");
		c = InputData.readInt();
		if (a == 0)
			System.out.println("x1 = " + ((double) -c / b));
		else if (b * b - 4 * a * c < 0)
			System.out.println("x1 = " + ((double) -b / (2.0 * a)));
		else {
			x = Math.sqrt(b * b - 4 * a * c);
			System.out.println("x1 = " + ((double) -b + x) / (2 * a));
			System.out.println("x2 = " + ((double) -b - x) / (2 * a));
		}

	}

	public static int notas() {
		return 0;
	}

	public static int reloj(int n) {
		if (n < 60)
			return ++n;
		else
			return 0;
	}

	public static boolean primo(int n) {

		boolean b = true;
		for (int div = 2; div < n && b; div++) {
			if (n % div == 0) {
				b = false;
			}
		}
		return b;
	}

	public static boolean numPerfect(int n) {
		int sum = 0;
		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				sum += i;
			}
		}
		return sum == n;
	}

	public static void mcd(int n1, int n2) {

		int div = 1, pro = 1;
		while ((n1 != 1 || n2 != 1) && div <= Math.min(n1, n2)) {
			div++;
			if (n1 % div == 0 && n2 % div == 0) {
				pro *= div;
				n1 /= div;
				n2 /= div;
				div = 1;

			}
		}
		System.out.println("MCD = " + pro);
	}

	public static void tablas() {
		System.out.println("Dame el numero del que vca a ser la tabla");
		int n = InputData.readInt();
		for (int i = 1; i <= 10; i++) {
			System.out.println(n + "*" + i + "=" + (n * i));
		}
	}

	public static void tablas(int n) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(n + "*" + i + "=" + (n * i));
		}
	}

	public static boolean bEsDivisorDeA(int a, int b) {
		return a % b == 0;
	}

	public static boolean divisorComun(int a, int b, int c) {
		
		return (bEsDivisorDeA(a, c) && bEsDivisorDeA(b, c));
	}
	public static boolean amigos(int a, int b) {
		int sum1=0, sum2=0;
		for(int div=1; div<a; div++)
			if(MisMetodos.bEsDivisorDeA(a, div))
				sum1+=div;
		for(int div=1;div<b;div++)
			if(MisMetodos.bEsDivisorDeA(b, div))
				sum2+=div;
		return (a==sum2 && b==sum1);
	}

		

}
