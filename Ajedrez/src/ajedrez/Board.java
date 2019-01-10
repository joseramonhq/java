package ajedrez;

public class Board {
	private ChessSet[][] board;
	private Pawn pw1,pw2,pw3,pw4,pw5,pw6,pw7,pw8,pb1,pb2,pb3,pb4,pb5,pb6,pb7,pb8;
	private King kingW, kingB;
	private Queen queenW, queenB;
	private Rook rookW, rookB;
	private Knight knightW, knightB;
	private Bishop bishopW, bishopB;
	
	

	public Board() {
		board=new ChessSet[8][8];
		for(int i=1;i<16;) {
			
		}
	}
}