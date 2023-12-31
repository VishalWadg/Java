public class TriespracticeQ2 {
    static class Node {
        String word;
        Node children [];
        boolean eow;
        Node () {
            word = null;
            children = new Node[26];
            eow = false;
        }
    }
    public static Node root = new Node();
    public static String ans = "";
    public static void insert(String word) {
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }
        curr.eow = true;
        curr.word = word;
    }

    public static void dfs (Node root) {
        if (root == null) {
            return;
        }
        if (root.word != null) {
            if (root.word.length() > ans.length()) {
                ans = root.word;
            } else if (root.word.length() == ans.length() && root.word.compareTo(ans) < 0) {
                ans = root.word;
            }
        }

        for (Node child : root.children) {
            if (child != null && child.word != null) {
                dfs(child);
            }
        }
    }

    public static String longestWord(String str []) {
        for (String word : str) {
            insert(word);
        }
        Node curr = root;
        dfs(curr);
        return ans;
    }

    public static void main(String[] args) {
        String words[] = {"a","banana","app","appl","ap","apply","apple"};
        System.out.println("Longest > " + longestWord(words));
    }
}
