public class MinimumDistanceBtwn2NodesOfBT {
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

    public static Node lcAncestorApproach2 (Node root, int n1, int n2) {
        if (root == null || root.data == n1 || root.data == n2) {
            return root;
        }
        Node lefNode = lcAncestorApproach2(root.left, n1, n2);
        Node riNode = lcAncestorApproach2(root.right, n1, n2);
        if (lefNode == null) {
            return riNode;
        }
        if (riNode == null) {
            return lefNode;
        }
        return root;
    }

    public static int lcaDist(Node lca, int n) {
        if (lca == null) {
            return -1;
        }
        if (lca.data == n) {
            return 0;
        }
        int lef = lcaDist(lca.left, n);
        int rig = lcaDist(lca.right, n);
        if (lef == -1 && rig == -1) {
            return - 1;
        } else if (lef == -1) {
            return rig + 1;
        } else {
            return lef + 1;
        }
    }

    public static int minDist(Node root, int n1, int n2) {
        Node lca = lcAncestorApproach2(root, n1, n2);
        int dist1 = lcaDist(lca, n1);
        int dist2 = lcaDist(lca, n2);
        return dist1 + dist2;
    }
    
    public static void main(String[] args) {
        Node root = new Node(1);                 //            1
        root.left = new Node(2);                 //          /   \ 
        root.right = new Node(3);                //         2     3
        root.left.left = new Node(4);            //        / \   / \
        root.left.right = new Node(5);           //       4   5 6   7
        root.right.left = new Node(6);           //
        root.right.right = new Node(7);

        System.out.println("The minimum Distance > " + minDist(root, 4, 6));
    }
}
