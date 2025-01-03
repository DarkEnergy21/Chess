public class Bishop extends ChessPiece {

    public Bishop(String color) {
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
                if (Math.abs(toLine - line) == Math.abs(toColumn - column)) {
                    return true;
                } else return false;
            } else return false;
        } else return false;
    }
    @Override
    public String getSymbol() {
        return "B";
    }
}