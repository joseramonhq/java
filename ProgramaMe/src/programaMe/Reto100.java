package programaMe;

import java.util.Arrays;

public class Reto100 {

	public static void main(String[] args) {
		char[] aux = (3524+"").toCharArray();
		Arrays.sort(aux);
		int one = Integer.parseInt(Arrays.toString(aux));
		int two = Integer.parseInt(darLaVuelta(one+""));
		System.out.println(one +"   "+two);

		System.out.println(kaprekar(3524));
		
		
		
	}
	public static String darLaVuelta(String x) {
		
		if (x.length()<1) {
			return x;
		}else {
			return darLaVuelta(x.substring(1))+x.charAt(0);
			}
		
	}
	
	public static int kaprekar(int num) {
		String s = num+"";
		if (s.charAt(0)==s.charAt(1) && s.charAt(0)== s.charAt(2) && s.charAt(0)==s.charAt(3)) {
			return 0;
		}
		int counter;
		int num2 = num;
		for (counter = 0; num2 != 6174; ) {
			char[] aux = (num2+"").toCharArray();
			Arrays.sort(aux);
			int one = Integer.parseInt(Arrays.toString(aux));
			int two = Integer.parseInt(new StringBuilder (one).reverse()+"");
			num2 = two-one;
			counter++;
			
		}
		return counter;
		
	}

}
