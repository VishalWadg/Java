public class BSTPracticeQ5 {
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
    static class Info {
        int max;
        int min;
        boolean isBST;
        int sum;
        int currmax;
        Info(int m, int mi, boolean is, int su, int curr) {
            max = m;
            min = mi;
            isBST = is;
            sum = su;
            currmax = curr;
        }
        Info () {}
    }

    static class INT {
        int a;
    }

    public static Info maxSumBSTUtil(Node root, INT maxsum) {
        if (root == null) {
            return new Info(Integer.MIN_VALUE, Integer.MAX_VALUE, true, 0, 0);
        }
        if (root.left == null && root.right == null) {
            maxsum.a = Math.max(maxsum.a, root.data);
            return new Info(root.data, root.data, true, root.data, maxsum.a);
        }

        Info lef = maxSumBSTUtil(root.left, maxsum);
        Info rig = maxSumBSTUtil(root.right, maxsum);
        Info BST = new Info();
        if (lef.isBST && rig.isBST && lef.max < root.data && rig.min > root.data) {
            BST.max = Math.max(root.data, Math.max(lef.max, rig.max));
            BST.min = Math.min(root.data, Math.max(lef.min, rig.min));
            maxsum.a = Math.max(maxsum.a, lef.sum + root.data + rig.sum);
            BST.sum = lef.sum + root.data + rig.sum;
            BST.currmax = maxsum.a;
            BST.isBST = true;
            return BST;
        }
        BST.currmax = maxsum.a;
        BST.isBST = false;
        BST.sum = lef.sum + rig.sum + root.data;
        return BST;
    }

    public static int maxSumBST(Node root) {
        INT maxsum = new INT();
        maxsum.a = Integer.MIN_VALUE;
        return maxSumBSTUtil(root, maxsum).currmax;
    }

    public static void main(String[] args) {
        Node root = new Node(5);
        root.left = new Node(14);
        root.right = new Node(3);root.left.left = new Node(6);
        root.right.right = new Node(7);
        root.left.left.left = new Node(9);
        root.left.left.right = new Node(1);
        System.out.println( maxSumBST(root));
    }
}
