import java.util.*;
public class TicTacToe {
    static char[] board = {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};
    public static void printBoard() {
        System.out.println(board[0] + "|" + board[1] + "|" + board[2]);
        System.out.println("-+-+-");
        System.out.println(board[3] + "|" + board[4] + "|" + board[5]);
        System.out.println("-+-+-");
        System.out.println(board[6] + "|" + board[7] + "|" + board[8]);
    }
    public static boolean checkWin(char player) {
        return (board[0]==player && board[1]==player && board[2]==player) ||
               (board[3]==player && board[4]==player && board[5]==player) ||
               (board[6]==player && board[7]==player && board[8]==player) ||
               (board[0]==player && board[3]==player && board[6]==player) ||
               (board[1]==player && board[4]==player && board[7]==player) ||
               (board[2]==player && board[5]==player && board[8]==player) ||
               (board[0]==player && board[4]==player && board[8]==player) ||
               (board[2]==player && board[4]==player && board[6]==player);
    }
    public static boolean isFull() {
        for (char c : board) {
            if (c == ' ') return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char player = 'X';
        while (true) {
            printBoard();
            System.out.print("Player " + player + ", enter position (1-9): ");
            int pos = sc.nextInt() - 1;
            if (pos < 0 || pos > 8 || board[pos] != ' ') {
                System.out.println("Invalid move!");
                continue;
            }
            board[pos] = player;
            if (checkWin(player)) {
                printBoard();
                System.out.println("Player " + player + " wins!");
                break;
            }
            if (isFull()) {
                printBoard();
                System.out.println("It's a draw!");
                break;
            }
            player = (player == 'X') ? 'O' : 'X';
        }
        sc.close();
    }
}

