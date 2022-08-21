package DataStructureLabExamples.TicTacToeUser;

/**
 * @author Ali Çolak
 * 26.11.2021
 */
public class TicTacToe {

    public static final int X=1, O=-1, EMPTY=0;
    public static final int [][] board = new int[3][3];
    private int player;
    private int counter;

    public TicTacToe() {
        clearBoard();
    }

    public void clearBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = EMPTY;
                player = X;
            }
        }
        counter = 0;
    }

    public int getPlayer() {
        return player;
    }

    public void putMark (int i, int j) {

        if ((i < 0) || (i > 2) || (j < 0) || (j > 2))
            throw new IllegalArgumentException("Invalid board position");
        if (board[i][j] != EMPTY)
            throw new IllegalArgumentException("Board position occupied");
        board[i][j] = player;
        player = - player;
        counter++;

        if (counter>4&&winner()!=0){
            printBoard();
            if (winner()==X) {
                System.out.println("Winner X user");
                System.exit(1);
            } else {
                System.out.println("Winner O user");
                System.exit(1);
            }
        } else if (counter==9){
            printBoard();
            System.out.println("there is not winner user");
            System.exit(1);
        }

    }

    public boolean isWin(int mark) {
        return ((board[0][0] + board[0][1] + board[0][2] == mark*3) // row 0
                || (board[1][0] + board[1][1] + board[1][2] == mark*3) // row 1
                || (board[2][0] + board[2][1] + board[2][2] == mark*3) // row 2
                || (board[0][0] + board[1][0] + board[2][0] == mark*3) // column 0
                || (board[0][1] + board[1][1] + board[2][1] == mark*3) // column 1
                || (board[0][2] + board[1][2] + board[2][2] == mark*3) // column 2
                || (board[0][0] + board[1][1] + board[2][2] == mark*3) // diagonal
                || (board[2][0] + board[1][1] + board[0][2] == mark*3)); // rev diag
    }

    public int winner( ) {
        if (isWin(X))
            return(X);
        else if (isWin(O))
            return(O);
        else
            return(0);
    }

    public void printBoard () {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j]==0){
                    System.out.print("-");
                } else if (board[i][j] == 1) {
                    System.out.print("X");
                } else {
                    System.out.print("O");
                }
            }
            System.out.print("\n");
        }

    }

}
