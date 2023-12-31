public class BinaryTreePracticeQ2 {
    static class Node {
        Node left;
        Node right;
        int data;
        Node (int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static void invert(Node root) {
        if (root == null) {
            return;
        }
        invert(root.left);
        invert(root.right);
        Node temp = root.left;
        root.left = root.right;
        root.right = temp;
    }
    
    public static void preordTraverse(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preordTraverse(root.left);
        preordTraverse(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(1);                 //            1                                        1
        root.left = new Node(2);                 //          /   \                                     / \ 
        root.right = new Node(3);                //         2     3             =>                    3   2 
        root.left.left = new Node(4);            //        / \   / \                                 / \ / \
        root.left.right = new Node(5);           //       4   5 6   7                               7  6 5  4
        root.right.left = new Node(6);           //
        root.right.right = new Node(7);
        System.out.print("Before Inversion of the BT > ");
        preordTraverse(root);
        invert(root);
        System.out.print("\nAfter Inverion of the BT > ");
        preordTraverse(root);
    }
}
