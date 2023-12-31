import java.util.*;
import java.util.LinkedList;
public class KthLevelOfaBinaryTree {
    static class Node{
        Node left;
        Node right;
        int data;
        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static void kthLevel(Node root, int level, int k) {
        if (root == null) {
            return;
        }
        if (level == k) {
            System.out.print(root.data + " ");
            return;
        }
        kthLevel(root.left, level + 1, k);
        kthLevel(root.right, level + 1, k);
    }
    public static void kthLevel2(Node root, int k) {
        if (root == null) {
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);
        int count = 1;
        while (! queue.isEmpty()) {
            Node currNode = queue.remove();
            if(currNode == null) {
                if (queue.isEmpty()) {
                    break;
                } else {
                    count++;
                    queue.add(null);
                }
            } else {
                if (count == k) {
                    System.out.print(currNode.data + " ");
                } else {
                    if (currNode.left != null) {
                        queue.add(currNode.left);
                    }
                    if (currNode.right != null) {
                        queue.add(currNode.right);
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        Node root = new Node(1);                 //            1
        root.left = new Node(2);                 //          /   \ 
        root.right = new Node(3);                //         2     3
        root.left.left = new Node(4);            //        / \   / \
        root.left.right = new Node(5);           //       4   5 6   7
        root.right.left = new Node(6);           //
        root.right.right = new Node(7);
        System.out.print("Kth level 1st approach > ");
        KthLevelOfaBinaryTree.kthLevel(root, 1, 3);                                   // Level
        System.out.println();
        System.out.print("Kth level 2nd approach > ");
        KthLevelOfaBinaryTree.kthLevel2(root, 3);
    }
}
