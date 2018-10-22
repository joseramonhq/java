package sumafactorial2;

import java.math.BigInteger;



public class Suma {

	public static void main(String[] args) {
		
		int n=misMetodos.InputData.readInt(), div;
		double sum=0;
		for(div=1;div<=n;div++) {
			sum+=1.0/(double)factorial.Factorial.factorial(div);
		}
		System.out.println(sum);
		
		BigInteger b= new BigInteger("99999998");
		BigInteger c= new BigInteger("234234");
		BigInteger d= b.gcd(c);
		System.out.println(d);
		
	}

}
