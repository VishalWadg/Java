public class LargestBSTinBT {
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
    static int maxBSTSize;
    static class Info {
        boolean isBST;
        int size, min, max;
        Info (boolean isBST, int size, int min, int max) {
            this.isBST = isBST;
            this.size = size;
            this.min = min;
            this.max = max;
        }
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

    public static Info largestBST(Node root) {
        if (root == null) {
            Info rtinfo = new Info(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
            return rtinfo;
        }
        Info lefSbtr = largestBST(root.left);
        Info rigSbtr = largestBST(root.right);
        Info curInfo;
        int min = Math.min(Math.min(lefSbtr.min, rigSbtr.min),root.data);
        int max = Math.max(Math.max(lefSbtr.max, rigSbtr.max),root.data);
        if (lefSbtr.max >= root.data || rigSbtr.min < root.data || lefSbtr.isBST == false || rigSbtr.isBST == false) {
            curInfo = new Info(false, lefSbtr.size + rigSbtr.size + 1, min, max);
        } else {
            curInfo = new Info(true, lefSbtr.size + rigSbtr.size + 1, min, max);
        }

        if (curInfo.isBST == true) {
            maxBSTSize = Math.max(maxBSTSize, curInfo.size);
        }
        return curInfo;
    }

    public static void main(String[] args) {
        Node root = new Node(50);
        root.left = new Node(30);
        root.left.left = new Node(5);
        root.left.right = new Node(20);
        root.right = new Node(60);
        root.right.left = new Node(45);
        root.right.right = new Node(70);
        root.right.right.left = new Node(65);
        root.right.right.right = new Node(80);
        largestBST(root);
        System.out.println(" > " + maxBSTSize);
    }
}
