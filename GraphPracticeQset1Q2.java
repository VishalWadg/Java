import java.util.LinkedList;
import java.util.Queue;
public class GraphPracticeQset1Q2 {
    static class Node {
        int data;
        Node left, right;
        public Node (int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class qltm {
        Node node;
        int depth;
        public qltm(Node node, int depth) {
            this.node = node;
            this.depth = depth;
        }
    }

    public static int minDepth(Node root) {
        if (root == null ) {
            return 0;
        }
        Queue<qltm> q = new LinkedList<>();
        q.add(new qltm(root, 1));
        while (!q.isEmpty()) {
            qltm qi = q.remove();
            Node node = qi.node;
            int depth = qi.depth;
            if (node.left == null && node.right == null) {
                return depth;
            }
            if (node.left != null) {
                qi.node = node.left;
                qi.depth = depth + 1;
                q.add(qi);
            }
            if (node.right != null) {
                qi.node = node.right;
                qi.depth = depth + 1;
                q.add(qi);
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        Node root = new Node(0);
        root.left = new Node(1);
        root.right = new Node(2);
        // root.left.left = new Node(3);
        root.left.right = new Node(4);
        root.left.right.left = new Node(5);
        root.left.right.right = new Node(6);
        root.right.left = new Node(9);
        System.out.println(minDepth(root));
    }
}
