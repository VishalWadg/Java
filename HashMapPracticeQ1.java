import java.util.TreeMap;
public class HashMapPracticeQ1 {
    static class Node {
        int data;
        Node left;
        Node right;
        Node (int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
   
    public static TreeMap<Integer, Integer> tm = new TreeMap<>();
    public static void printBottomView(Node root, int hd) {
        if (root == null) {
            return;
        }
        printBottomView(root.left, hd - 1);
        printBottomView(root.right, hd + 1);
        if (!tm.containsKey(hd)) {
            tm.put(hd, root.data);
        }
    }

    public static void main(String args[]) {
        Node root = new Node(20);
        root.left = new Node(8);
        root.right = new Node(22);
        root.right.right = new Node(25);
        root.left.left = new Node(5);
        root.left.right = new Node(3);
        root.left.right.left = new Node(10);
        root.left.right.right = new Node(14);
        printBottomView(root, 0);
        for (Integer el : tm.keySet()) {
            System.out.print(tm.get(el) + " ");
        }
    }
}
