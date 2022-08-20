/**
 * @author Ali Çolak
 * 24.12.2021
 */
public class Main {

    public static void main(String[] args) {

        RedBlackTree redBlackTree = new RedBlackTree();

        redBlackTree.insert(5);
        redBlackTree.insert(4);
        redBlackTree.insert(7);
        redBlackTree.insert(2);
        redBlackTree.insert(1);
        redBlackTree.insert(8);

        redBlackTree.print();

    }

}
