import java.util.Arrays;

/**
 * @author Ali Çolak
 * 5.11.2021
 */

public class Main {

    public static void main(String[] args) {

        ScoreBoard scoreBoard =  new ScoreBoard(3);

        GameEntry gameEntry1 =  new GameEntry("ALİ Çolak",195);
        GameEntry gameEntry2 =  new GameEntry("Ahmet Çolak",123);

        scoreBoard.add(gameEntry1);
        scoreBoard.add(gameEntry2);

        System.out.println(Arrays.toString(scoreBoard.getScoreBoard()));

        scoreBoard.remove(1);

        System.out.println(Arrays.toString(scoreBoard.getScoreBoard()));

    }

}
