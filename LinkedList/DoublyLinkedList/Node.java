/**
 * @author Ali Çolak
 * 6.11.2021
 */


public class Node <E> {

    private E value ;
    private Node<E> next ;
    private Node<E> previous ;

    public Node(E value) {
        this.value = value;
        this.next=null;
        this.previous=null;
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

    public void setPrevious (Node<E> node) {
        this.previous=node;
    }

    public Node<E> getPrevious() {
        return previous;
    }
}
