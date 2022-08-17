/**
 * @author Ali Çolak
 * 15.10.2021
 */


public class Main {

    public static void main(String[] args) {

        CircularLinkedList<Integer> circularLinkedList = new CircularLinkedList<>();

        circularLinkedList.insert(1);
        circularLinkedList.insert(2);
        circularLinkedList.insert(3);
        circularLinkedList.insert(4,5);
        circularLinkedList.delete(5);
        circularLinkedList.update(8,1);

        circularLinkedList.display();

    }

}
