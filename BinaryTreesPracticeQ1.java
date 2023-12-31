public class BinaryTreesPracticeQ1 {
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
    public static boolean isUnivalued(Node root) {
        if (root == null) {
            return true;
        }
        if (root.left != null && root.left.data != root.data) {
            return false;
        }
        if (root.right != null && root.right.data != root.data) {
            return false;
        }
        return isUnivalued(root.left) && isUnivalued(root.right);
    }
    public static void main(String[] args) {
        Node root1 = new Node(2);                 //            2
        root1.left = new Node(2);                 //          /   \ 
        root1.right = new Node(2);                //         2     2
        root1.left.left = new Node(2);            //        / \   / \
        root1.left.right = new Node(2);           //       2   2 2   2
        root1.right.left = new Node(2);           //
        root1.right.right = new Node(2);
        String ans = isUnivalued(root1)?" > Yes":" > No";
        System.out.println(ans);
        Node root = new Node(2);                 //            2
        root.left = new Node(2);                 //          /   \ 
        root.right = new Node(2);                //         2     2
        root.left.left = new Node(2);            //        / \   / \
        root.left.right = new Node(5);           //       2   5 2   2
        root.right.left = new Node(2);           //
        root.right.right = new Node(2);
        String ans2 = isUnivalued(root)?" > Yes":" > No";
        System.out.println(ans2);
    }
}
