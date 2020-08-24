package boardgame;

public abstract class Piece {

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
	
	public abstract boolean[][] possibleMoves();
	
	public boolean possibleMoves(Position position) {
		return possibleMoves()[position.getRow()][position.getColumn()];
	}
	
	//operação vai ter q chamar o metodo abstrato possibleMoves, e vai varrer a matriz booleana até achar uma posição verdadeira
	public boolean isThereAnyPossibleMove() {
		boolean[][] mat = possibleMoves();
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				if (mat[i][j]) {
					return true;
				}
			}
		}
		return false;
	}
}
