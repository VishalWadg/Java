import java.util.HashMap;
import java.util.Scanner;
public class BinaryTreePracticeQ4 {
    static HashMap<String, Integer> map = new HashMap<>();
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
    public static String inOrder (Node root) {
        if (root == null) {
            return "";
        }
        String str = "";
        str += inOrder(root.left);
        str += Integer.toString(root.data);
        str += inOrder(root.right);
        
        if (map.get(str) != null && map.get(str) == 1) {
            System.out.println(root.data + " ");
        }
        if (map.containsKey(str)) {
            map.put(str, map.get(str) + 1);
        } else {
            map.put(str, 1);
        }
        return str;
    }

    public static void printAllDups(Node root) {
        // map = new HashMap<>();
        inOrder(root);
    }

    public static void main(String[] args) {
        Node root = new Node(1);                 //            1
        root.left = new Node(2);                 //          /   \ 
        root.right = new Node(4);                //         2     4
        root.left.left = new Node(3);            //        / \   / \
        root.left.right = new Node(5);           //       3   5 6   2
        root.right.left = new Node(6);           //                / \
        root.right.right = new Node(2);          //               3   5
        root.right.right.left = new Node(3);
        root.right.right.right = new Node(5);
        printAllDups(root);
    }
}
