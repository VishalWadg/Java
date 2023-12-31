import java.util.Queue;
import java.util.LinkedList;
public class BinaryTree {
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
    static class BT {
        static int idx = -1;
        static Node buildTree(int arr[]) {
            idx++;
            if (arr[idx] == -1) {
                return null;
            }
            Node newNode = new Node(arr[idx]);
            newNode.left = buildTree(arr);
            newNode.right = buildTree(arr);
            return newNode;
        }

        static void preordTraverse(Node root) {
            if (root == null) {
                // System.out.print(-1 + " ");
                return;
            }
            System.out.print(root.data + " ");
            preordTraverse(root.left);
            preordTraverse(root.right);
        }
        
        static void inordTraverse (Node root) {
            if (root == null) {
                // System.out.print(-1 + " ");
                return;
            }
            inordTraverse(root.left);
            System.out.print(root.data + " ");
            inordTraverse(root.right);
        }

        static void postordTraverse (Node root) {
            if (root == null) {
                return;
            }
            postordTraverse(root.left);
            postordTraverse(root.right);
            System.out.print(root.data + " ");
        }

        static void levordTraverse(Node root) {
            if (root == null) {
                return;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);
            while (!q.isEmpty()) {
                Node currNode = q.remove();
                if (currNode == null) {
                    System.out.println();
                    if (q.isEmpty()) {
                        break;
                    } else {
                        q.add(null);
                    }
                } else {
                    System.out.print(currNode.data + " ");
                    if (currNode.left != null) {
                        q.add(currNode.left);
                    }
                    if (currNode.right != null) {
                        q.add(currNode.right);
                    }
                }
            }
        }

        static int heightOfBT(Node root) {
            if (root == null) {
                return 0;
            }
            int lsubTrHt = heightOfBT(root.left);
            int rsubTrHt = heightOfBT(root.right);
            int TrHt = Math.max(lsubTrHt, rsubTrHt) + 1;
            return TrHt;
        }

        static int countOfNodes(Node root) {
            if (root == null) {
                return 0;
            }
            int lsubTrCt = countOfNodes(root.left);
            int rsubTrCt = countOfNodes(root.right);
            return lsubTrCt + rsubTrCt + 1;
        }

        static int sumOfNodes(Node root) {
            if (root == null) {
                return 0;
            }
            int lsTrSum = sumOfNodes(root.left);
            int rsTrSum = sumOfNodes(root.right);
            return lsTrSum + rsTrSum + root.data;
        }

        
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 4, -1, -1, 5, -1, 6, -1, 7, -1, -1, 3, -1, -1};
        Node root = BT.buildTree(arr);
        System.out.println("Post order Traversal of BT > ");
        BT.levordTraverse(root);
        System.out.println("Height of Tree > " + BT.heightOfBT(root));
        System.out.println("The count of Nodes in the given tree is > " + BT.countOfNodes(root));
        System.out.println("Sum of all the nodes in the tree is > " + BT.sumOfNodes(root));
    }
}
