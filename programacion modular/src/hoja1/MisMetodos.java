package hoja1;

public class MisMetodos {

	public static boolean primo(int n) {
		int div=2;
		boolean bool=true;
		for(;div<n && bool;div++) {
			if(n%div==0)
				bool=false;
		}
		return bool;
	}
	public static int factorial(int n) {
		int result=1;
		for(int i=2;i<=n; i++) {
			result*=i;
		}
		return result;
		
	}
	
}
