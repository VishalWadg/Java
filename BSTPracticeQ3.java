
public class BSTPracticeQ3 {
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


    static int count = 0;
    public static Node kthSmallestUtil(Node root, int k) {
        if(root == null) {
            return null;
        }
        Node lef = kthSmallestUtil(root.left, k);
        if (lef != null) {
            return lef;
        }
        count++;
        if (count == k) {
            return root;
        }
        return kthSmallestUtil(root.right, k);
    }
    public static void printKthSmallest(Node root, int k) {
        Node res = kthSmallestUtil(root, k);
        if (res == null) {
            System.out.println("There are less than k nodes in BST ");
        } else {
            System.out.println(k + "-th smallest element is > " + res.data);
        }
    }
    public static void main(String[] args) {
        Node root = null;
        int keys [] = {20, 8, 22, 4, 12, 10, 14};
        for (int i = 0; i < keys.length; i++) {
            root = createBST(root, keys[i]);
        }

        printKthSmallest(root, 3);
    }
}
