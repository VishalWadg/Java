import java.util.*;
public class LowestCommonAncestorInBinaryTree {

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

    public static boolean getPath(Node root, int n, ArrayList<Node> path) {
        if (root == null) {
            return false;
        }
        path.add(root);
        if (root.data == n) {
            return true;
        }
        if (getPath(root.left, n, path) || getPath(root.right, n, path)) {
            return true;
        }
        path.remove(path.size() - 1);
        return false;
    }

    public static Node lcAncestor(Node root, int n1, int n2) {
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node>path2 = new ArrayList<>();
        
        getPath(root, n1, path1);
        getPath(root, n2, path2);
        int i = 0;
        for (; i < path1.size() && i < path2.size() ; i++) {
            if (path1.get(i) != path2.get(i)) {
                break;
            }
        }
        // last equal node -> i - 1th
        Node lca = path1.get(i - 1);
        return lca;
    }

    public static Node lcAncestorApproach2 (Node root, int n1, int n2) {
        if (root == null || root.data == n1 || root.data == n2) {
            return root;
        }
        Node lefNode = lcAncestorApproach2(root.left, n1, n2);
        Node riNode = lcAncestorApproach2(root.right, n1, n2);
        if (lefNode == null) {
            return riNode;
        }
        if (riNode == null) {
            return lefNode;
        }
        return root;
    }

    public static void main(String[] args) {
        Node root = new Node(1);                 //            1
        root.left = new Node(2);                 //          /   \ 
        root.right = new Node(3);                //         2     3
        root.left.left = new Node(4);            //        / \   / \
        root.left.right = new Node(5);           //       4   5 6   7
        root.right.left = new Node(6);           //
        root.right.right = new Node(7);

        Node lca = lcAncestor(root, 6, 7);                        // Lowest common ancestor
        Node lca2 = lcAncestorApproach2(root, 4, 5);              // Lowest common ancestor Approach 2 i.e. using recursion
        System.out.println();
        System.out.println("Lowest common ancestor > " + lca.data);
        System.out.println("Lowest common ancestor Approach2 > " + lca2.data);
    }
}
