import java.util.Scanner;
public class ChessDriver
{
public static void main(String[] args)
{
    board.resetChessBoard();
    printChessBoard(board);

    Scanner moveScanner = new Scanner(System.in);
    System.out.println("Enter start Cell.");
    String start = moveScanner.nextLine();
    System.out.println("Enter end Cell.");
    String end = moveScanner.nextLine();
    move(board, start, end);
    printChessBoard(board);

}
}