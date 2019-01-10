package ajedrez;

public class Queen {
	public static boolean decideColor=true;
	private Colours colour;
	public Queen() {
		if(decideColor) {
			colour=Colours.WHITE;
		}else {
			colour=Colours.BLACK;
		}
		
	}

}
