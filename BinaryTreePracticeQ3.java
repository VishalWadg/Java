public class BinaryTreePracticeQ3 {

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

    public static Node removLeafWithx(Node root, int x) {
        if (root == null) {
            return null;
        }
        root.left = removLeafWithx(root.left, x);
        root.right = removLeafWithx(root.right, x);
        if (root.left == null && root.right == null && root.data == x) {
            return null;
        }
        return root;
    }


    //  My code 

    // public static void removLeafWithx(Node root, int x) {
    //     if (root == null) {
    //         return;
    //     }
    //     removLeafWithx(root.left, x);
    //     removLeafWithx(root.right, x);
    //     if (root.left != null && root.left.left == null && root.left.right == null && root.left.data == x) {
    //         root.left = null;
    //     }
    //     if (root.right != null && root.right.left == null && root.right.right == null && root.right.data == x) {
    //         root.right = null;
    //     }
    // }

    public static void preordTraverse(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preordTraverse(root.left);
        preordTraverse(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(1);                 //            1
        root.left = new Node(2);                 //          /   \ 
        root.right = new Node(3);                //         2     3
        root.left.left = new Node(3);            //        / \   / \
        root.left.right = new Node(5);           //       3   5 6   3
        root.right.left = new Node(6);           //                / \
        root.right.right = new Node(3);          //               3   3
        root.right.right.left = new Node(3);
        root.right.right.right = new Node(3);

        System.out.print(" > ");
        preordTraverse(root);
        removLeafWithx(root, 3);
        System.out.print("\n > ");
        preordTraverse(root);




        /*       10
                / \
               3   10
              / \   \
             3   1   3
                    / \
                   3   3  
        */

        Node root1 = new Node(10);
        root1.left = new Node(3);
        root1.right = new Node(10);
        root1.left.left = new Node(3);
        root1.left.right = new Node(1);
        root1.right.right = new Node(3);
        root1.right.right.left = new Node(3);
        root1.right.right.right = new Node(3);

        System.out.print("\n > ");
        preordTraverse(root1);
        removLeafWithx(root1, 3);
        System.out.print("\n > ");
        preordTraverse(root1);
    }
}
