import java.util.Arrays;

/**
 * @author Ali Çolak
 * 8.10.2021
 */
public class Main {

    public static void main(String[] args) {
        CircleArray circleArray = new CircleArray(5);
        circleArray.insert(0,5);
        circleArray.insert(0,4);
        circleArray.insert(0,2);
        circleArray.insert(0,1);
        circleArray.insert(4,6);
        circleArray.delete(2);
        circleArray.delete(3);
        circleArray.delete(0);
        circleArray.update(0,0);
        System.out.println(Arrays.toString(circleArray.getCircleArray()));
    }

}
