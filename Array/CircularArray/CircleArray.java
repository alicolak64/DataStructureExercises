/**
 * @author Ali Çolak
 * 8.10.2021
 */

public class CircleArray {

    private int [] circleArray;
    private int count;
    private int capacity;

    public CircleArray ( int capacity ) {

        this.circleArray = new int [0] ;
        this.count = 0 ;
        this.capacity = capacity;
    }

    public int[] getCircleArray() {
        return circleArray;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public int size() {
        return count;
    }

    public int getValue(int index) {

        if ( count != 0 ) {
            int tempIndex = index % count;
            return circleArray[tempIndex];
        } 
        else 
            throw new RuntimeException("No Element In Circle Array");

    }

    public void insert (int index, int value) {

        if ( count <capacity) {

            if ( isEmpty() ) {

                count++;
                circleArray = new int[count];
                circleArray[0] = value;

            } else {

                count++ ;
                int tempIndex = index % count;
                int [] tempArray = new int[count];

                for ( int i = 0; i < tempIndex ; i++ ) {
                    tempArray[i] = circleArray[i];
                }

                for ( int i = tempIndex + 1 ; i < count; i++ ) {
                    tempArray[i] = circleArray[ i - 1 ];
                }

                tempArray[tempIndex] = value;

                circleArray = tempArray;

            }

        } 

        else 
            throw new RuntimeException("Maximum Size Circle Array");


    }

    public void update (int index, int value) {

        if ( !isEmpty() ) {
            int tempIndex = index % count;
            circleArray[tempIndex] = value;
        } 
        else 
            throw new RuntimeException("Not Contains Element In Circle Array For Update");

    }

    public int delete (int index) {

        int deletedValue = 0;

        if ( !isEmpty() ) {

            int tempIndex = index % count;
            count--;
            deletedValue = circleArray[tempIndex];
            int [] tempArray = new int[count];

            for ( int i = 0 ; i < tempIndex ; i++ ) {
                tempArray[i] = circleArray[i];
            }
            for ( int i = tempIndex + 1 ; i < count + 1 ; i++ ) {
                tempArray[ i - 1 ] = circleArray[i];
            }

            circleArray=tempArray;

        } 
        else 
            throw new RuntimeException("Not Contains Element In Circle Array For Delete");

        return deletedValue;
        
    }

}
