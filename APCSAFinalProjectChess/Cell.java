public class Cell
{
  private Piece piece;
  private int x;
  private int y;
  private String symbol;

  public Cell(int x, int y, Piece piece, String symbol)
  {
    this.setPiece(piece);
    this.setX(x);
    this.setY(y);
    this.symbol = symbol;
  }

  public void setX(int x)
  {
    this.x = x;
  }

  public void setY(int y)
  {
    this.y = y;
  }

  public int getX()
  {
    return x;
  }

  public int getY()
  {
    return y;
  }

  public void setPiece(Piece p)
  {
    this.piece = p;
  }

  public Piece getPiece()
  {
    return this.piece;
  }

  public String getWhiteKing()
  {
    return "♚";
  }

  public String getBlackKing()
  {
    return "♔";
  }
  
  public String getWhiteQueen()
  {
    return "♛";
  }

  public String getBlackQueen()
  {
    return "♕";
  }

  public String getWhiteRook()
  {
    return "♜";
  }

  public String getBlackRook()
  {
    return "♖";
  }

  public String getWhiteBishop()
  {
    return "♝";
  }
  
  public String getBlackBishop()
  {
    return "♗";
  }

  public String getWhiteKnight()
  {
    return "♞";
  }

  public String getBlackKnight()
  {
    return "♘";    
  }
  
  public String getWhitePawn()
  {
    return "♟︎";    
  }

  public String getBlackPawn()
  {
    return "♙";  
  }
  
  public String getNull()
  {
    return " ";
  }

  public String getSymbol()
  {
    return this.symbol;
  }
}

/* Written By Kevin Zhao and Leonardo Yang

Purpose of Code: To run a chess game using the Java Console

Units used: 
Unit 1: Primitive Data
Unit 2: Using Classes + Objects
Unit 3/4: If statements + For/While Loops
Unit 5: Writing Classes
Unit 8: 2D Arrays
Unit 9: Inheritance

User input is used by using the Scanner class in order to determine the moves on the board.

The abstract class, used in the Piece class, is used to be a parent class to all the different types of pieces (Queen, King, Rook ,etc.) and does not function like a normal class in that its methods will be called, but instead the methods will be called from the child classes, which all share similar needs for a method that is most easily put in the abstract class.
*/