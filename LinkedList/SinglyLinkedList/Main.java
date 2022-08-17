/**
 * @author Ali Çolak
 * 18.10.2021
 */


public class Main {

    public static void main(String[] args) {

        SinglyLinkedList<String> singlyLinkedList = new SinglyLinkedList<>();
        singlyLinkedList.addFirst("Ali");
        singlyLinkedList.addLast("Veli");
        singlyLinkedList.addFirst("Mehmet");
        singlyLinkedList.insert("Huseyin",2);
        singlyLinkedList.printList();
        System.out.println("************************");
        singlyLinkedList.delete(3);
        singlyLinkedList.printList();
        System.out.println("************************");
        System.out.println(singlyLinkedList.getFirstElement());
        System.out.println("************************");
        System.out.println(singlyLinkedList.getLastElement());
        System.out.println("************************");
        singlyLinkedList.update(2,"Oguzhan");
        singlyLinkedList.printList();
        System.out.println("************************");


    }

}
