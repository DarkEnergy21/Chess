public class King extends ChessPiece {

    public King(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if ((toLine < 8 && toLine >= 0) && (toColumn < 8 && toColumn >= 0)) {
            if (!(line == toLine && column == toColumn)) {
                if ((Math.abs(toLine - line) == 1 && Math.abs(toColumn - column) == 1)
                        || (Math.abs(toLine - line) == 1 && Math.abs(toColumn - column) == 0)
                        || (Math.abs(toLine - line) == 0 && Math.abs(toColumn - column) == 1)) {
                    return true;
                } else return false;
            } else return false;
        } else return false;
    }

    @Override
    public String getSymbol() {
        return "K";
    }

    public boolean isUnderAttack(ChessBoard board, int line, int column) {
        boolean isUnderAttack = false;
        for (int i = 0; i < 8; i++) {
            for (int y = 0; y < 8; y++) {
                if (board.board[i][y] != null) {
                    if (!board.board[i][y].getColor().equals(color)) {
                        if (board.board[i][y].canMoveToPosition(board, i, y, line, column)) {
                            isUnderAttack = true;
                        }
                    }
                }
            }
        }
        return false;
    }
}