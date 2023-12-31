import java.net.NoRouteToHostException;

public class TransformtoSumTree {

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

    public static int toSumTree(Node root) {
        if (root == null) {
            return 0;   
        }
        int lef = toSumTree(root.left);
        int rig = toSumTree(root.right);
        int dta = root.data;
        root.data = lef + rig;
        return dta + lef + rig;
    }

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
        root.left.left = new Node(4);            //        / \   / \
        root.left.right = new Node(5);           //       4   5 6   7
        root.right.left = new Node(6);           //
        root.right.right = new Node(7);
        System.out.println("Tree before toSum > ");
        preordTraverse(root);
        toSumTree(root);
        System.out.println("\n Tree after toSum");
        preordTraverse(root);
    }
}
