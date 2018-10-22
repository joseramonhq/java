package reverseNumber;



public class ReverseNumber {

	public static void main(String[] args) {

		
	}
	public static int reverse(int n) {
		  return n>=0? Integer.parseInt(new StringBuilder(n+"").reverse().toString()): -Integer.parseInt(new StringBuilder((n+"").substring(1)).reverse().toString());
		}

}

