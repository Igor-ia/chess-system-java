package boardgame;

public class Piece {

	protected Position position;
	private Board board;
	public Piece(Board board) {
		this.board = board;
		//n�o � necessario colocar nulo, pois o java ja declara nulo por padr�o
		position = null;
	}
	protected Board getBoard() {
		return board;
	}
	
	
	
}
