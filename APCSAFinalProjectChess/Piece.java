public abstract class Piece
{
private boolean white = true;
private int x;
private int y;

public Piece(int x, int y, boolean white)
{
  this.setX(x);
  this.setY(y);
  this.setWhite(white);
}

public void setX(int x)
{
  this.x = x;
}

public int getX()
{
  return x;
}

public void setY(int y)
{
  this.y = y;
}

public int getY()
{
  return y;
}

public boolean isWhite()
{
  return this.white;
}

public void setWhite(boolean white)
{
  this.white = white;
}
}