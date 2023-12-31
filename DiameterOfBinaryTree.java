public class DiameterOfBinaryTree {
    static class Node {
        int data;
        Node left;
        Node right;
        Node (int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int heightOfBT(Node root) {
        if (root == null) {
            return 0;
        }
        int lsubTrHt = heightOfBT(root.left);
        int rsubTrHt = heightOfBT(root.right);
        int TrHt = Math.max(lsubTrHt, rsubTrHt) + 1;
        return TrHt;
    }

    public static int diameterOfBT(Node root) {
        if (root == null) {
            return 0;
        }
        int lh = heightOfBT(root.left);
        int rh = heightOfBT(root.right);
        int ld = diameterOfBT(root.left);
        int rd = diameterOfBT(root.right);
        int diam = lh + rh + 1;
        return Integer.max(diam, Math.max(rd, ld));
    }

    public static class Info {
        int diam;
        int height;
        public Info (int diam, int height) {
            this.diam = diam;
            this.height = height;
        }
    }
    
        
    public static Info diametApproach2 (Node root) {
        if (root == null) {
            return new Info(0,0);
        }
        Info leftInfo = diametApproach2(root.left);
        Info rightInfo = diametApproach2(root.right);
        int daim = Math.max(Math.max(leftInfo.diam, rightInfo.diam), (leftInfo.height + rightInfo.height + 1));
        int ht = Math.max(leftInfo.height, rightInfo.height) + 1;
        return new Info(daim, ht);
    }
    public static void main(String[] args) {
        Node root = new Node(1);                 //            1
        root.left = new Node(2);                 //          /   \ 
        root.right = new Node(3);                //         2     3
        root.left.left = new Node(4);            //        / \   / \
        root.left.right = new Node(5);           //       4   5 6   7
        root.right.left = new Node(6);           //
        root.right.right = new Node(7);

        Info ans = 
        diametApproach2(root);
        System.out.println("The diameter of the given tree is > " + ans.diam);
        System.out.println("The diameter of the Tree is > " + diameterOfBT(root));
    }
}
