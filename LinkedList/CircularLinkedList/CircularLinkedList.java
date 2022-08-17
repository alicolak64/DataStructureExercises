/**
 * @author Ali Çolak
 * 15.10.2021
 */

public class CircularLinkedList <E>  {

    private Node<E> head;
    private Node<E> tail;
    private int size;

    public CircularLinkedList() {
        this.head = null;
        this.tail = null;
        this.size=0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size==0;
    }

    public void insert(E e) {
        Node<E> newElement =  new Node<>(e);
        if (isEmpty()) {
            head = newElement;
            tail = newElement;
            newElement.setPrevious(newElement);
            newElement.setNext(newElement);
        } else {
            tail.setNext(newElement);
            newElement.setPrevious(tail);
            newElement.setNext(head);
            head.setPrevious(newElement);
            tail = newElement;
        }
        size++;
    }

    public void insert(E e,int index) {

        Node<E> newElement =  new Node<>(e);
        if (isEmpty()) {
            head = newElement;
            tail = newElement;
            newElement.setPrevious(newElement);
            newElement.setNext(newElement);
        } else {
            Node<E> pointer =  head;
            Node<E> pointer2 = null;
            for (int i = 0; i < index; i++) {
                pointer2 = pointer;
                pointer = pointer.getNext();
            }
            pointer2.setNext(newElement);
            newElement.setPrevious(pointer2);
            newElement.setNext(pointer);
            pointer.setPrevious(newElement);
        }
        size++;

    }

    public void update(E e,int index) {

        Node<E> newElement =  new Node<>(e);

        Node<E> pointer =  head;
        Node<E> pointer2 = null;
        for (int i = 0; i < index; i++) {
            pointer2 = pointer;
            pointer = pointer.getNext();
        }
        pointer = pointer.getNext();
        pointer2.setNext(newElement);
        newElement.setPrevious(pointer2);
        newElement.setNext(pointer);
        pointer.setPrevious(newElement);
    }

    public void delete(int index) {

        Node<E> pointer =  head;
        Node<E> pointer2 = null;
        for (int i = 0; i < index; i++) {
            pointer2 = pointer;
            pointer = pointer.getNext();
        }

        pointer = pointer.getNext();

        pointer2.setNext(pointer);
        pointer.setPrevious(pointer2);
        size--;

    }

    public void display () {

        if (isEmpty()) {
            System.out.println("List is empty");
        } else {
            Node<E> pointer = head;
            for (int i = 0; i < size; i++) {
                System.out.println(pointer.getValue());
                pointer = pointer.getNext();
            }
        }

    }



}

