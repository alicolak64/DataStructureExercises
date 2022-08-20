/**
 * @author Ali Çolak
 * 24.12.2021
 */

public class RedBlackTree {

    Node root ;
    static boolean RED = true;
    static boolean BLACK = false;

    public void insert (int data) {
        Node node = root;
        Node parent = null;

        while (node != null) {
            parent = node;
            if (data< node.data)
                node = node.left;
            else
                node = node.right;
        }

        Node newNode = new Node(data);
        newNode.color = RED;

        if (parent == null) {
            this.root = newNode;
            newNode.parent = null;
        } else if (data< parent.data) {
            parent.left = newNode;
            newNode.parent = parent;
        } else {
            parent.right = newNode;
            newNode.parent = parent;
        }

        fixColor(newNode);
    }

    public void fixColor(Node node) {

        Node parent = node.parent;

        if (parent == null) {
            node.color = BLACK;
            return;
        }

        if (parent.color == BLACK) return;

        Node grandPrent = parent.parent;

        Node uncle = getUncle(parent);

        if (uncle != null && uncle.color == RED) {
            parent.color = BLACK;
            grandPrent.color = RED;
            uncle.color = BLACK;
            fixColor(grandPrent);
        }

        if (parent == grandPrent.left) {
            if (node == parent.right)
                rotateLeft();
            rotateRight();
        } else if (parent == grandPrent.right) {
            if (node == parent.left)
                rotateRight();
            rotateLeft();
        }

    }

    public void rotateLeft() {



    }

    public void rotateRight() {



    }

    public Node getUncle(Node parent) {

        Node grandParent = parent.parent;

        if (grandParent.left == parent) return grandParent.right;
        else return grandParent.left;

    }

    public String getColor (Node node) {
        if (node.color == RED) return node.data +" - red";
        else return node.data + " - black";
    }

    public void print() {
        print(root);
    }

    private void print(Node node) {
        if (node == null) return ;
        System.out.println(getColor(node));
        print(node.left);
        print(node.right);

    }


    private class Node {
        int data;
        boolean color;
        Node parent, left, right;

        public Node(int data) {
            this.data = data;
            this.parent = null;
            this.left = null;
            this.right = null;
        }
    }


}
