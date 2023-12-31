import java.util.*;
import java.util.LinkedList;
public class BSTPracticeQ1 {

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

    public static Node createBST(Node root,int val) {
        if (root == null) {
           root = new Node(val);
           return root;
        }
        if (val < root.data) {
            root.left = createBST(root.left, val);
        } else {
            root.right  = createBST(root.right, val);
        }
        return root;
    }

    public static void inorderTraverse(Node root) {
        if (root == null) {
            return;
        }
        inorderTraverse(root.left);
        System.out.print(root.data + " ");
        inorderTraverse(root.right);
    }

    public static void preorderTraverse(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorderTraverse(root.left);
        preorderTraverse(root.right);
    }

    static int sum = 0;
    public static int addInRange(Node root, int k1, int k2, int sum) {
        if (root == null) {
            return 0;
        }
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        while (!q.isEmpty()) {
            Node curr = q.remove();
            if (curr.data >= k1 && curr.data <= k2) {
                sum += curr.data;
            }
            if (curr.left != null && curr.data > k1) {
                q.add(curr.left);
            }
            if (curr.right != null && curr.data < k2) {
                q.add(curr.right);
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int values [] = {8, 5, 3, 1, 4, 6, 10, 11, 14};
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = createBST(root, values[i]);
        }
        System.out.print("preorder Traversal > ");
        preorderTraverse(root);
        System.out.println();

        System.out.println(" > sum in Range > " + addInRange(root, 5, 12, 0));
    }
}
