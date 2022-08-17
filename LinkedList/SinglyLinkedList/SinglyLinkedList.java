/**
 * @author Ali Çolak
 * 18.10.2021
 */


public class SinglyLinkedList<E> {

    private Node<E> head;
    private Node<E> tail;
    private int size=0;

    public SinglyLinkedList() {
        head = null;
        tail = null;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size==0;
    }

    public E getFirstElement() {
        if (isEmpty()) return null;
        else return head.getValue();
    }

    public E getLastElement() {
        if (isEmpty()) return null;
        else return tail.getValue();
    }

    public void addFirst(E e) {
        Node<E> newElement = new Node<>(e);
        if (isEmpty()) {
            head = newElement;
            tail = newElement;
        } else {
            newElement.setNext(head);
            head = newElement;
        }
        size++;
    }

    public void addLast(E e) {
        Node<E> newElement = new Node<>(e);
        if (isEmpty()) {
            head = newElement;
            tail = newElement;
        } else {
            tail.setNext(newElement);
            tail = newElement;
        }
        size++;
    }

    public void insert(E e,int index) {
        if (index>size) {
            throw new IndexOutOfBoundsException();
        } else {
            Node<E> newElement = new Node<>(e);
            if (index==0 ) {
                addFirst(e);
            }else if (index==size){
                addLast(e);
            } else {
                Node<E> pointer = head;
                Node<E> pointer2 = null;
                for (int i = 0; i < index; i++) {
                    pointer2=pointer;
                    pointer=pointer.getNext();
                }
                pointer2.setNext(newElement);
                newElement.setNext(pointer);
            }
            size++;
        }

    }

    public void update (int index,E e) {
        if (index>=size) {
            throw new IndexOutOfBoundsException();
        } else {
            Node<E> updateElement = new Node<>(e);
            if (index==0 ) {
                Node<E> tempNode = head.getNext();
                head = updateElement;
                updateElement.setNext(tempNode);
            }else if (index==size-1){
                Node <E> pointer = head;
                for (int i = 0; i < index-1; i++) {
                    pointer = pointer.getNext();
                }
                pointer.setNext(updateElement);
                tail = updateElement;
            } else {
                Node<E> pointer = head;
                Node<E> pointer2 = null;
                for (int i = 0; i < index; i++) {
                    pointer2=pointer;
                    pointer=pointer.getNext();
                }
                pointer = pointer.getNext();
                pointer2.setNext(updateElement);
                updateElement.setNext(pointer);
            }
        }
    }

    public void delete (int index) {
        if (index>=size) {
            throw new IndexOutOfBoundsException();
        } else {
            if (index==0 ) {
                head = head.getNext();
            }else if (index==size-1){
                Node <E> pointer = head;
                for (int i = 0; i < index-1; i++) {
                    pointer = pointer.getNext();
                }
                tail=pointer;
                pointer.setNext(null);
            } else {
                Node<E> pointer = head;
                Node<E> pointer2 = null;
                for (int i = 0; i < index; i++) {
                    pointer2=pointer;
                    pointer=pointer.getNext();
                }
                pointer = pointer.getNext();
                pointer2.setNext(pointer);
            }
            size--;
        }
    }

    public void printList() {
        if (isEmpty()) {
            System.out.println("List is empty");
        } else {
            Node <E> pointer = head;
            do {
                System.out.println(pointer.getValue());
                pointer = pointer.getNext();
            } while (pointer!=null);
        }
    }
}
