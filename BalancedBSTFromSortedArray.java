public class BalancedBSTFromSortedArray {
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
    public static Node createBST(Node root, int arr[], int si, int ei) {
        if (si > ei) {
            return null;
        }
        int mid = (ei + si) / 2;
        root = new Node(arr[mid]);
        root.left = createBST(root.left, arr, si, mid -1);
        root.right = createBST(root.right, arr, mid + 1, ei);
        return root;
    }

    public static void inorderTraverse (Node root) {
        if (root == null) {
            return;
        }
        inorderTraverse(root.left);
        System.out.print(root.data + " ");
        inorderTraverse(root.right);
    }

    public static void main(String[] args) {
        int arr[] = {3, 5, 6, 8, 10, 11, 12};
        Node root = createBST(null, arr, 0, arr.length - 1);
        inorderTraverse(root);
    }
}
