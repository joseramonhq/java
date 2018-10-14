package amigos;
import static java.lang.System.out;//Puedo eliminar System del código
public class Ejercicio2Hoja2 {

	public static void main(String[] args) {
		int a=220, b=284, div=1, sum1=0,sum2=0;		
		while(div<Math.max(a, b)-1) {
			if(a%div==0 && a!=div){
				sum1+=div;
			}
			if(b%div==0 && b!=div) {
				sum2+=div;
			}
			div++;
		}
		if(a==sum2 && b==sum1) {
			out.println("Son amigos");
		}else {
			out.println("No son amigos");
		}
		

	}
	
	

}
