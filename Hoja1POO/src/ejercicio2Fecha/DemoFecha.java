package ejercicio2Fecha;
import java.lang.*;

public class DemoFecha {

	public static void main(String[] args) {
		Fecha a= new Fecha();
		Fecha b = new Fecha(21,10,2001);
		Fecha c=new Fecha(29,2,2000);
		Fecha d=new Fecha(29,2,2020);
		Fecha e=new Fecha(29,2,2004);
		Fecha f=new Fecha(29,2,2003);
		Fecha g=new Fecha(29,2,2003);
		Fecha h=new Fecha(29,2,1200);
		Fecha i=new Fecha(31,13,2000);
		Fecha j=new Fecha(21,10,2001);
		System.out.println(a.validarFecha()+" "+a);
		System.out.println(b.validarFecha()+" "+b);
		System.out.println(c.validarFecha()+" "+c);
		System.out.println(d.validarFecha()+" "+d);
		System.out.println(e.validarFecha()+" "+e);
		System.out.println(f.validarFecha()+" "+f);
		System.out.println(g.validarFecha()+" "+g);
		System.out.println(h.validarFecha()+" "+h);
		System.out.println(i.validarFecha()+" "+i);
		System.out.println(j.validarFecha()+" "+j);
		System.out.println(b.compareTo(j)+" <----compareTo");
		System.out.println(b.compararDosFechas(h)+" <----comparar dos fechas");
		System.out.println(b.equals(j)+" <----equals");
		System.out.println(b.equals(h)+" <----equals");
		
		
		

	}

}
