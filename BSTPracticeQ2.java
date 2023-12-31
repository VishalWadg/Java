public class BSTPracticeQ2 {

    public static class Node {
        Node left;
        Node right;
        int data;
        Node (int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }  
    }

    static  int mindiff = Integer.MAX_VALUE;
    static int mindiffKey = -1;

    public static void minDiffUtil(Node root, int k) {
        if (root == null) {
            return;
        }
        if (root.data == k) {
            mindiffKey = root.data;
        }
        if (mindiff > Math.abs(root.data - k)) {
            mindiff = Math.abs(root.data - k);
            mindiffKey = root.data;
        }
        if (k < root.data) {
            minDiffUtil(root.left, k);
        } else {
            minDiffUtil(root.right, k);
        }
    }

    public static int minDiff(Node root, int k) {
        minDiffUtil(root, k);
        return mindiffKey;
    }

    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(5);
        root.left.left = new Node(3);
        root.left.right = new Node(6);
        root.right = new Node(11);
        root.right.right = new Node(20);
        System.out.println("Closest Element > " + minDiff(root, 9));
    }
}
