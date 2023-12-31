public class PrintInRangeBST {
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

    public static void printInRange(Node root, int k1, int k2) {
        if (root == null) {
            return;
        }
        if (root.data >= k1 && root.data <= k2) {
            printInRange(root.left, k1, k2);
            System.out.print(root.data + " ");
            printInRange(root.right, k1, k2);
        }
        else if (root.data < k1) {
            printInRange(root.right, k1, k2);
        } 
        else {
            printInRange(root.left, k1, k2);
        }
    }

    public static void main(String[] args) {
        int values [] = {3, 8, 10, 1, 4, 6, 5, 11, 14};
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = createBST(root, values[i]);
        }
        System.out.print("Inorder Traversal > ");
        inorderTraverse(root);
        System.out.println();

        printInRange(root, 5, 12);
    }
}
