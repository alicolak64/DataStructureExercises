
/**
 * @author Ali Çolak
 * 5.11.2021
 */


public class Node <E> {

    private E value ;
    private Node<E> next ;

    public Node(E value) {
        this.value = value;
        this.next=null;
    }

    public E getValue() {
        return value;
    }

    public void setNext(Node<E> node) {
        this.next=node;
    }

    public Node<E> getNext() {
        return next;
    }
}
