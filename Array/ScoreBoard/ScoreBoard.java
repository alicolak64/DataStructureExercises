/**
 * @author Ali Çolak
 * 5.11.2021
 */

public class ScoreBoard {

    private int numEntries = 0; // number of actual entries
    private GameEntry[ ] board; // array of game entries (names & scores)

    public ScoreBoard(int capacity) {
        this.board = new GameEntry[capacity];
    }

    public void add(GameEntry e) {

        int newScore = e.getScore( );

        if ( numEntries < board.length || newScore > board [ numEntries - 1 ].getScore( )) {

            if (numEntries < board.length)
                numEntries++;

            int j = numEntries - 1;

            while ( j > 0 && board [ j - 1 ].getScore( ) < newScore) {
                board [j] = board [ j - 1 ];
                j--;
            }

            board [j] = e;

        }

    }

    public GameEntry remove( int i ) throws IndexOutOfBoundsException {

        if ( i < 0 || i >= numEntries )
            throw new IndexOutOfBoundsException ("Invalid index: " + i );

        GameEntry temp = board[i];

        for ( int j = i ; j < numEntries - 1 ; j++)
            board [j] = board [ j + 1 ];

        board [ numEntries -1 ] = null;
        numEntries--;
        return temp;
    }

    public GameEntry[] getScoreBoard () {
        return board;
    }

}
