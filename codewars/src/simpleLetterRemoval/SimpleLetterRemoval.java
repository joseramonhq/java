package simpleLetterRemoval;


public class SimpleLetterRemoval {
	public static void main(String[] args) {
		System.out.println(solve("abracadabra",50));
	}
	public static String solve(String s, int k) {

		for (char i = 97; k > 0; i++) {
			while (s.indexOf(i) != -1 && k>0) {
				s=s.substring(0,s.indexOf(i))+s.substring(s.indexOf(i)+1);
				if (s.equals("")) return "";
				k--;
			}
			if (i == 122) 
				i = 97;
		
		}
		return s;
	}
}