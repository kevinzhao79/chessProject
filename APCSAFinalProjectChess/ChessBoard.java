import java.util.*;
public class ChessBoard
{
  Cell[][] board = new Cell[8][8];
  
  public ChessBoard()
  {
    this.resetChessBoard();
  }

  public void resetChessBoard()
  {
    board[0][0].add(0, 0, new Rook(0, 0, true), board[0][0].getWhiteRook());
    board[1][0].add(1, 0, new Knight(1, 0, true), board[1][0].getWhiteKnight());
    board[2][0].add(2, 0, new Bishop(2, 0, true), board[2][0].getWhiteBishop());
    board[3][0].add(3, 0, new Queen(3, 0, true), board[3][0].getWhiteQueen());
    board[4][0].add(4, 0, new King(4, 0, true), board[4][0].getWhiteKing());
    board[5][0].add(5, 0, new Bishop(5, 0, true), board[5][0].getWhiteBishop());
    board[6][0].add(6, 0, new Knight(6, 0, true), board[6][0].getWhiteKnight());
    board[7][0].add(7, 0, new Rook(7, 0, true), board[7][0].getWhiteRook());
    for (int x = 0; x < 8; x++)
    {
      board[x][1].add(x, 1, new Pawn(x, 1, true), board[x][1].getWhitePawn());
    }

    board[0][7].add(0, 7, new Rook(0, 7, false), board[0][7].getBlackRook());
    board[1][7].add(1, 7, new Knight(1, 7, false), board[1][7].getBlackKnight());
    board[2][7].add(2, 7, new Bishop(2, 7, false), board[2][7].getBlackBishop());
    board[3][7].add(3, 7, new Queen(3, 7, false), board[3][7].getBlackQueen());
    board[4][7].add(4, 7, new King(4, 7, false), board[4][7].getBlackKing());
    board[5][7].add(5, 7, new Bishop(5, 7, false), board[5][7].getBlackBishop());
    board[6][7].add(6, 7, new Knight(6, 7, false), board[6][7].getBlackKnight());
    board[7][7].add(7, 7, new Rook(7, 7, false), board[7][7].getBlackRook());
    for (int x = 0; x < 8; x++)
    {
      board[x][6].add(x, 6, new Pawn(x, 6, false), board[x][6].getBlackPawn());
    }
    for (int i = 2; i < 6; i++) {
      for (int j = 0; j < 8; j++) {
        board[i][j].add(i, j, null, board[i][j].getNull());
      }
    }
  }
  public void printChessBoard(Cell[][] board)
  {
    for (int x = 0; x < 8; x++)
    {
      for (int y = 0; y < 8; y++)
      {
        System.out.print("[" + board[x][y].getSymbol() + "]");
      }
      System.out.println("");
    }
  }
  
  public void move(Cell[][] board, Cell start, Cell end)
  {
    if (start.getPiece().canMove(board, start, end))
    {
      Piece p1 = end.getPiece();
      end.setPiece(start.getPiece());
      start.setPiece(null);
      if (p1.equals("♔"))
      {
        System.out.print("Black wins.");
      }
      else if (p1.equals("♚"))
      {
        System.out.print("White wins.");
      }
    }
    else
    {
      System.out.print ("Error: Illegal Move.");
    }
  }
}