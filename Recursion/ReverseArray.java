import java.util.Arrays;

/**
 * @author Ali Çolak
 * 7.11.2021
 */

public class ReverseArray {

    static void reverseArray(int [] array,int low,int high) {

        if ( low < high ) {
            int temp = array[low];
            array[low] = array[high];
            array[high] = temp;
            reverseArray(array,low+1,high-1);
        }

    }

    public static void main(String[] args) {

        int [] array = {0,1,2,3,4,5,6,7,8,9};

        reverseArray(array,0, array.length-1);

        System.out.println(Arrays.toString(array));

    }


}
