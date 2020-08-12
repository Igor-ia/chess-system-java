package boardgame;

public class Piece {

	protected Position position;
	private Board board;
	public Piece(Board board) {
		this.board = board;
		//não é necessario colocar nulo, pois o java ja declara nulo por padrão
		position = null;
	}
	protected Board getBoard() {
		return board;
	}
	
	
	
}
