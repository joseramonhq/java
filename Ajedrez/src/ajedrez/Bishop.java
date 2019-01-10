package ajedrez;

public class Bishop {
	public static boolean decideColor=true;
	private Colours colour;
	public Bishop() {
		if(decideColor) {
			colour=Colours.WHITE;
		}else {
			colour=Colours.BLACK;
		}
		
	}
}
