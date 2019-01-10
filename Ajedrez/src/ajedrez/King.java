package ajedrez;

public class King {
	public static boolean decideColor=true;
	private Colours colour;
	public King() {
		if(decideColor) {
			colour=Colours.WHITE;
		}else {
			colour=Colours.BLACK;
		}
		
	}
	
}
