import java.util.*;
import java.util.LinkedList;
public class TopViewOfBinaryTree {
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

      static class Info {
        Node node;
        int hd;
        Info (Node node, int hd) {
            this.node = node;
            this.hd = hd;
        }
      }

      static void topViewOfBT (Node root) {
        if (root == null) {
            return;
        }
        HashMap<Integer,Node> map = new HashMap<>();
        Queue<Info> que = new LinkedList<>();
        que.add(new Info(root, 0));
        que.add(null);
        int min = 0, max = 0;
        while (!que.isEmpty()) {
            Info curInfo = que.remove();
            if (curInfo == null) {
                if (que.isEmpty()) {
                    break;
                } else {
                    que.add(null);
                }
            } else {
                if (curInfo.node.left != null) {
                    que.add(new Info(curInfo.node.left, curInfo.hd - 1));
                }
                if (curInfo.node.right != null) {
                    que.add(new Info(curInfo.node.right, curInfo.hd + 1));
                }
                if (!map.containsKey(curInfo.hd)) {
                    min = Math.min(min, curInfo.hd);
                    max = Math.max(max, curInfo.hd);
                    map.put(curInfo.hd, curInfo.node);
                }
            }
        }

        for (int i = min; i <= max; i++) {
            System.out.print(map.get(i).data + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node tree2 = new Node(1);                            //                      1
        tree2.left = new Node(2);                            //                     / \
        tree2.right = new Node(3);                           //                    2   3
        tree2.left.right = new Node(4);                      //                     \     
        tree2.left.right.right = new Node(5);                //                      4
        tree2.left.right.right.right = new Node(6);          //                       \
        System.out.println("Top View > ");                      //                        5
        TopViewOfBinaryTree.topViewOfBT(tree2);                   //                         \         
                                                                  //                          6                                                            
    }                                                                          
}
