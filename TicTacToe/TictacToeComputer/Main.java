package DataStructureLabExamples.TictacToeComputer;

/**
 * @author Ali Çolak
 * 26.11.2021
 */
public class Main {

    public static double fitness(Board board) {
        return (double) (board.countO- board.countX) / (board.countX + board.countO);
    }

    public static void main(String[] args) throws IllegalAccessException {

        double temp;
        Board best;
        Board game1 = new Board();
        game1.printBoard();
        do {
            game1.getPlayerMove();
            game1.printBoard();
            // game1.putMark(1, 1);
            // game1.printBoard();
            game1.calculateComputerMove();

            temp = Double.NEGATIVE_INFINITY;
            best = null;
            for (Board child : game1.children) {
                double ratio = fitness(child);// (double)child.countO / (child.countX + child.countO);
                System.out.println(ratio);
                if (ratio > temp) {
                    temp = ratio;
                    best = child;
                }
            }
            System.out.println();
            best.printBoard();
            game1 = best;
        } while (game1.winner() == 0 && game1.children.size() > 0);
        System.out.println(game1.winner()==1 ? "X Win!" : "O Win!");
    }
}
