public class KthAncestorOfNodeinBT {
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

    public static int kthAncestor(Node root, int n, int k) {
        if (root == null) {
            return -1;
        }
        if (root.data == n) {
            return 0;
        }
        int lef = kthAncestor(root.left, n, k);
        int rig = kthAncestor(root.right, n, k);
        if (lef == -1 && rig == -1) {
            return -1;
        }
        int mx = Math.max(lef, rig);
        if (mx + 1 == k) {
            System.out.println(k + "th ancestor of " + n + " > " + root.data);
        }
        return  mx + 1;
    }

    public static void main(String[] args) {
        Node root = new Node(1);                 //            1
        root.left = new Node(2);                 //          /   \ 
        root.right = new Node(3);                //         2     3
        root.left.left = new Node(4);            //        / \   / \
        root.left.right = new Node(5);           //       4   5 6   7
        root.right.left = new Node(6);           //
        root.right.right = new Node(7);

        kthAncestor(root, 4, 1);
    }
}
