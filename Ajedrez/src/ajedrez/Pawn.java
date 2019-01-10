package ajedrez;

public class Pawn {
	private Colours colour;
	private int create=1;
	private boolean firstMove;
	
	public Pawn() {
		if(create<=8) {
			colour=Colours.WHITE;
		}else {
			colour=Colours.BLACK;
		}
		
		firstMove=true;
	}
	
	
	
	public void movePawn(Pawn p) {
		int forward;
		if(firstMove) {
			forward=(int)(Math.floor(Math.random()*(1-(2+1))+1));
			firstMove=false;
		}else {
			forward=1;
		}
	}
}
