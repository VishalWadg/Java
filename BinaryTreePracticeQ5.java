class Res {
    public int val;
}
public class BinaryTreePracticeQ5 {
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

    public static int maxPthUtil(Node root, Res res) {
        if (root == null) {
            return 0;
        }
        int lefSum = maxPthUtil(root.left, res);
        int rigSum = maxPthUtil(root.right, res);
        int max_single = Math.max(Math.max(lefSum, rigSum) + root.data, root.data);
        int max_top = Math.max(max_single, lefSum + rigSum + root.data);
        res.val = Math.max(res.val, max_top);
        return max_single;
    }

    public static int maxPathSum(Node root) {
        Res res = new Res();
        res.val = Integer.MIN_VALUE;
        maxPthUtil(root, res);
        return res.val;
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(2);
        root.right = new Node(10);
        root.left.left = new Node(20);
        root.left.right = new Node(1);
        root.right.right = new Node(-25);
        root.right.right.left = new Node(3);
        root.right.right.right = new Node(4);

        System.out.println("The max sum Path is > " + maxPathSum(root));
    }
}
