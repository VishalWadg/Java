public class MirrorBST {
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


    public static void mirror(Node root) {
        if (root == null) {
            return;
        }
        mirror(root.left);
        mirror(root.right);
        Node temp = root.left;
        root.left = root.right;
        root.right = temp;
    }
    public static void main(String[] args) {
        int values [] = {8, 5, 3, 6, 10, 11};
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = createBST(root, values[i]);
        }
        System.out.print("Inorder Traversal  > ");
        inorderTraverse(root);
        System.out.println();
        mirror(root);
        System.out.print("Inorder Traversal after mirroring > ");
        preorderTraverse(root);
    }
}
