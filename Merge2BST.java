import java.util.ArrayList;

public class Merge2BST {

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

    public static void getInorder(Node root, ArrayList<Integer> arr) {
        if (root == null) {
            return;
        }
        getInorder(root.left, arr);
        arr.add(root.data);
        getInorder(root.right, arr);
    }

    public static Node getNewBST(Node root, ArrayList<Integer> arr, int si, int ei) {
        if (si > ei) {
            return null;
        }
        int mid = (ei + si) / 2;
        root = new Node(arr.get(mid));
        root.left = getNewBST(root.left, arr, si, mid - 1);
        root.right = getNewBST(root.right, arr, mid + 1, ei);
        return root;
    }

    public static Node mergeBST(Node root1, Node root2) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        getInorder(root1, arr1);
        ArrayList<Integer> arr2 = new ArrayList<>();
        getInorder(root2, arr2);
        ArrayList<Integer> inOrder = new ArrayList<>();
        int p1 = 0, p2 = 0;
        while (p1 < arr1.size() && p2 < arr2.size()) {
            if (arr1.get(p1) < arr2.get(p2)) {
                inOrder.add(arr1.get(p1));
                p1++;
            } else {
                inOrder.add(arr2.get(p2));
                p2++;
            }
        }

        while (p1 < arr1.size()) {
            inOrder.add(arr1.get(p1));
            p1++;
        }

        while (p2 < arr2.size()) {
            inOrder.add(arr2.get(p2));
            p2++;
        }

        return getNewBST(null, inOrder, 0, inOrder.size() - 1);
    }

    public static void main(String[] args) {
        /*
            BST 1

                2
               / \
              1   4
        
        */ 
        Node root1 = new Node(2);
        root1.left = new Node(1);
        root1.right = new Node(4);

        /*
            BST 2

                9
               / \
              3   12
        */
        Node root2 = new Node(9);
        root2.left = new Node(3);
        root2.right = new Node(12);
        Node root = mergeBST(root1, root2);

        /*
            Final Ans BST:
                3
              /   \
             1     9
              \   / \
               2 4   12
        */ 
        System.out.print("Preoreder Treaversal > ");
        preorderTraverse(root);
        System.out.print("Inoreder Treaversal > ");
        inorderTraverse(root);
    }
}
