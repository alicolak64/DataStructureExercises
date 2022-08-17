/**
 * @author Ali Çolak
 * 18.10.2021
 */


public class DoublyLinkedList <E> {

    private Node<E> head;
    private Node<E> tail;
    private int size;

    public DoublyLinkedList() {
        this.size=0;
        this.head=null;
        this.tail=null;
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
            head.setPrevious(newElement);
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
            newElement.setPrevious(tail);
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
                if (index<=size/2) {
                    Node<E> pointer = head;
                    Node<E> pointer2 = null;
                    for (int i = 0; i < index; i++) {
                        pointer2=pointer;
                        pointer=pointer.getNext();
                    }
                    pointer2.setNext(newElement);
                    newElement.setPrevious(pointer2);
                    newElement.setNext(pointer);
                    pointer.setPrevious(newElement);
                } else {
                    Node<E> pointer = tail;
                    Node<E> pointer2 = null;
                    for (int i = 0; i < size-index; i++) {
                        pointer2=pointer;
                        pointer=pointer.getPrevious();
                    }
                    pointer.setNext(newElement);
                    newElement.setPrevious(pointer);
                    newElement.setNext(pointer2);
                    pointer2.setPrevious(newElement);
                }

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
                tempNode.setPrevious(updateElement);
            }else if (index==size-1){
                Node<E> tempNode = tail.getPrevious();
                tempNode.setNext(updateElement);
                updateElement.setPrevious(tempNode);
                tail = updateElement;
            } else {
                if (index<=size/2) {
                    Node<E> pointer = head;
                    Node<E> pointer2 = null;
                    for (int i = 0; i < index; i++) {
                        pointer2=pointer;
                        pointer=pointer.getNext();
                    }
                    pointer = pointer.getNext();
                    pointer2.setNext(updateElement);
                    updateElement.setPrevious(pointer2);
                    pointer.setPrevious(updateElement);
                    updateElement.setNext(pointer);
                } else {
                    Node<E> pointer = tail;
                    Node<E> pointer2 = null;
                    for (int i = 0; i < size-index-1; i++) {
                        pointer2=pointer;
                        pointer=pointer.getPrevious();
                    }
                    pointer = pointer.getPrevious();
                    pointer.setNext(updateElement);
                    updateElement.setPrevious(pointer);
                    pointer2.setPrevious(updateElement);
                    updateElement.setNext(pointer2);
                }

            }
        }
    }

    public void delete (int index) {
        if (index>=size) {
            throw new IndexOutOfBoundsException();
        } else {
            if (index==0 ) {
                head.getNext().setPrevious(null);
                head = head.getNext();
            }else if (index==size-1){
                Node<E> tempNode = tail.getPrevious();
                tail=tempNode;
                tempNode.setNext(null);
            } else {
                if (index<=size/2) {
                    Node<E> pointer = head;
                    Node<E> pointer2 = null;
                    for (int i = 0; i < index; i++) {
                        pointer2=pointer;
                        pointer=pointer.getNext();
                    }
                    pointer = pointer.getNext();
                    pointer2.setNext(pointer);
                    pointer.setPrevious(pointer2);
                } else {
                    Node<E> pointer = tail;
                    Node<E> pointer2 = null;
                    for (int i = 0; i < size - index - 1; i++) {
                        pointer2=pointer;
                        pointer=pointer.getPrevious();
                    }
                    pointer = pointer.getPrevious();
                    pointer2.setPrevious(pointer);
                    pointer.setNext(pointer2);
                }
            }
            size--;
        }
    }

    public void printList() {
        if (isEmpty()) {
            System.out.println("List is empty");
        } else {
            Node<E> pointer = head;
            do {
                System.out.println(pointer.getValue());
                pointer = pointer.getNext();
            } while (pointer!=null);
        }
    }

}
