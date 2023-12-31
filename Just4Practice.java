import java.util.ArrayList;
public class Just4Practice {

    public static void printBoard(char board[][]){
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] +" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static boolean isSafe(char board[][], int row, int col) {
        for (int i = row; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        for (int i = row, j = col; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }

    public static void nQueens(char board[][], int row){
        if (row >= board.length) {
            printBoard(board);
            return;
        }
        for (int i = 0; i < board.length; i++) {
            if (isSafe(board, row, i)) {
                board[row][i] = 'Q';
                nQueens(board, row + 1);
            }
            board[row][i] = 'x';
        }
    }

    public static void initBoard(char board[][]){
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = 'x';
            }
        }
    }
    
    public static void main(String args[]) {
        char board[][] = new char[4][4];
        initBoard(board);
        nQueens(board, 0);
    }
}
