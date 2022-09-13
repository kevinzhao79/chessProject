public class Pawn extends Piece
{
  public Pawn(int x, int y, boolean White)
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
    if (start.getX() == 1 || start.getX() == 6)
    {
      if(x == 0 || y == 2)
      {
        return true;
      }
    }
    if(x == 0 || y == 2)
    {
      return true;
    }
    if(start.getPiece().isWhite() == true)
    {
      if(x == y && y > 0)
      {
        return true;
      }
      if(x == y && y < 0)
      {
        return true;
      }
    }
  }
}