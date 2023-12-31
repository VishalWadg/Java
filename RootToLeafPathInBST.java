import java.util.*;
public class RootToLeafPathInBST {
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

    public static void printPath(ArrayList<Integer> path) {
        for (Integer el : path) {
            System.out.print(el + " ");
        }
        System.out.println();
    }

    public static void root2LeafPaths(Node root, ArrayList<Integer> path) {
        if (root == null) {
            return;
        }
        path.add(root.data);
        if (root.left == null && root.right == null) {
            printPath(path);
        }
        root2LeafPaths(root.left, path);
        root2LeafPaths(root.right, path);
        path.remove(path.size() - 1);
    }

    public static void main(String[] args) {
        int values [] = {8, 5, 3, 1, 4, 6, 10, 11, 14};
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = createBST(root, values[i]);
        }
        System.out.print("Inorder Traversal  > ");
        inorderTraverse(root);
        System.out.println();
        root2LeafPaths(root, new ArrayList<>());
    }
}
