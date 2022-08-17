
/**
 * @author Ali Çolak
 * 18.10.2021
 */


public class Main {

    public static void main(String[] args) {

        DoublyLinkedList<String> doublyLinkedList = new DoublyLinkedList<>();
        doublyLinkedList.addFirst("Ali");
        doublyLinkedList.addLast("Veli");
        doublyLinkedList.addFirst("Mehmet");
        doublyLinkedList.insert("Huseyin",2);
        doublyLinkedList.printList();
        System.out.println("************************");
        doublyLinkedList.delete(3);
        doublyLinkedList.printList();
        System.out.println("************************");
        System.out.println(doublyLinkedList.getFirstElement());
        System.out.println("************************");
        System.out.println(doublyLinkedList.getLastElement());
        System.out.println("************************");
        doublyLinkedList.update(2,"Oguzhan");
        doublyLinkedList.printList();
        System.out.println("************************");

    }


}
