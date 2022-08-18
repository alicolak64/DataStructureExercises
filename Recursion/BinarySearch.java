/**
 * @author Ali Çolak
 * 7.11.2021
 */

public class BinarySearch {

    public static void main(String[] args) {

        int [] array = {0,1,2,3,4,5,6,7,8,9,13,15,18,21,36,43,89};


        System.out.println(binarySearch(array,89,0, array.length));

    }

    public static boolean binarySearch(int[ ] data, int target, int low, int high) {
        
        if (low > high)
            return false;
        else {
            int mid = (low + high) / 2;
            if (target == data[mid])
                return true;
            else if (target < data[mid])
                return binarySearch(data, target, low, mid - 1);
            else
                return binarySearch(data, target, mid + 1, high);
        }
    }


}
