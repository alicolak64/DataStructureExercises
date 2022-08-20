import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * @author Ali Çolak
 *         17.12.2021
 */

public class Huffman {

    PriorityQueue<Node> priorityQueue ;
    Node root; 

    
    public Huffman() {
        this(1);
    }

    public Huffman(int size) {
        priorityQueue = new PriorityQueue<>( size , new MyComparator() );
        root = null;
        encoder = new HashMap<>();
    }

    public void creatTree ( HashMap<Character , Integer> frag ) {
 
        for (Map.Entry<Character,Integer> entry : frag.entrySet()) {
            Node node = new Node(entry.getKey(), entry.getValue());
            priorityQueue.add(node);
        }

        while (priorityQueue.size() > 1) {

            Node x = priorityQueue.peek();
            priorityQueue.poll();

            Node y = priorityQueue.peek();
            priorityQueue.poll();

            Node newNode = new No de();
            newNode.frag = x.frag+ y.frag;
            newNode.c = '-';
            newNode.left = x;
            newNode.right = y;

            priorityQueue.add(newNode);

        }

        root = priorityQueue.peek();

    }
 
    public void const ru ctorCoding(Node no de , String s){
        if (node.left==null &&  node.right==null) {
            encoder.put(node.c,s);
            return;
        }
   
        constructorCoding(node.left,s + " 0");
        constructorCoding(node.right,s+"1");

    }

    class MyComparator implements Comparator<Node> {

        @Override
        public int compare(Node o1, Node o2) {
            return o1.frag - o2.frag;
        }

    }

    private class Node {

        int frag;
        char c;
 
        Node left,right;

        public Node(char c , int frag ) {
            this.frag = frag;
            this.c = c;
            right = null;
            left = null;
        }

        public Node () {

        }

    }

}
