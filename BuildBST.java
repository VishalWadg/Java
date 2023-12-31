public class BuildBST {
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

    public static boolean search_inBST(Node root, int key) {
        if (root == null) {
            return false;
        }
        if (root.data == key) {
            return true;
        }
        if (key < root.data) {
            return search_inBST(root.left, key);
        } else {
            return search_inBST(root.right, key);
        }
    }

    public static void main(String[] args) {
        int values [] = {5, 1, 3, 4, 2, 7};
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = createBST(root, values[i]);
        }
        System.out.print("Inorder Traversal of a Binary Search Tree gives a Sorted Sequence > ");
        inorderTraverse(root);
        System.out.println();
        System.out.println("search result > " + search_inBST(root, 5));
    }
}
