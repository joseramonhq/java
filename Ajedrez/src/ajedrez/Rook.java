package ajedrez;

public class Rook {
	public static boolean decideColor=true;
	private Colours colour;
	public Rook() {
		if(decideColor) {
			colour=Colours.WHITE;
		}else {
			colour=Colours.BLACK;
		}
		
	}
}
