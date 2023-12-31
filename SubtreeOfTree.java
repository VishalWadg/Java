public class SubtreeOfTree {
    static class Node{
        Node left;
        Node right;
        int data;
        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static boolean isValid(Node root, Node subRoot) {
        if (subRoot == null && root == null) {
            return true;
        } else if (root == null || subRoot == null || root.data != subRoot.data) {
            return false;
        }
        if (!isValid(root.left, subRoot.left)) {
            return false;
        }
        if (!isValid(root.right, subRoot.right)) {
            return false;
        }
        return true;
    }
    public static boolean isSubTree (Node root, Node subRoot) {
        if (root == null) {
            return false;
        }
        if (root.data == subRoot.data ) {
            if (isValid(root, subRoot)) {
                return true;
            }
        }
        return isSubTree(root.left, subRoot) ||isSubTree(root.right, subRoot);
    }
  public static void main (String args[]) {
    Node root = new Node(1);                 //            1
    root.left = new Node(2);                 //          /   \ 
    root.right = new Node(3);                //         2     3
    root.left.left = new Node(4);            //        / \   / \
    root.left.right = new Node(5);           //       4   5 6   7
    root.right.left = new Node(6);           //
    root.right.right = new Node(7);
    
    Node subRoot = new Node(2);                    
    subRoot.left = new Node(4);                
    subRoot.right = new Node(5);          
                                                
    System.out.println("> " + SubtreeOfTree.isSubTree(root, subRoot));  
    }
}
