public class Knight extends Piece
{
  public Knight(int x, int y, boolean White)
  {
    super(x, y, true);
  }

  public boolean canMove(ChessBoard board, Cell start, Cell end)
  {
    if (start.getPiece().isWhite() == end.getPiece().isWhite())
    {
      return false;
    }
    int x = Math.abs(start.getX() - end.getX());
    int y = Math.abs(start.getY() - end.getY());
    if (x == 0 && y == 0)
    {
      return false;
    }
    return (x * y == 2);
  }
}