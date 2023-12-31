import java.rmi.server.RemoteRef;

public class DeleteANodeInBST {
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

    public static Node deleteNode(Node root, int d) {
        if (root.data > d) {
            root.left = deleteNode(root.left, d);
        }
        else if (root.data < d) {
            root.right = deleteNode(root.right, d);
        }
        else {

            // Case 1 No children (Leaf Node)

            if (root.left == null && root.right == null) {
                return null;
            }

            // Case 2  One child

            if (root.left == null) {
                return root.right;
            }
            else if(root.right == null) {
                return root.left;
            }

            // case 3  Two children
            Node Is = inorderSuccesor(root.right);
            root.data = Is.data;
            root.right = deleteNode(root.right, Is.data);
        }
        return root;
    }

    public static Node inorderSuccesor(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    public static void main(String[] args) {
        int values [] = {8, 5, 3, 1, 4, 6, 10, 11, 14};
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = createBST(root, values[i]);
        }
        System.out.print("Inorder Traversal > ");
        inorderTraverse(root);
        System.out.println(); 
        deleteNode(root, 10);
        System.out.print("Inorder Traversal > ");
        inorderTraverse(root);
    }
}
