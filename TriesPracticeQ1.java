import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
public class TriesPracticeQ1 {
    static class Node {
        List<String> data;
        Node children [];
        boolean eow;
        Node () {
            data = new ArrayList<>();
            children = new Node[26];
            eow = false;
        }
    }
    static List<List<String>> ans;
    public static Node root;



    public static List<List<String>> groupAnagrams(String str []) {
        ans = new ArrayList<>();
        root = new Node();
        for (String word : str) {
            build(word);
        }

        dfs(root);

        return ans;
    }

    public static void build(String s) {
        char word [] = s.toCharArray();
        Arrays.sort(word);
        Node curr = root;
        for (char c : word) {
            int idx = c - 'a';
            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }
        curr.eow = true;
        curr.data.add(s);
    }

    public static void dfs(Node rt) {
        if (rt.eow) {
            ans.add(rt.data);
        }
        for (int i = 0; i < 26; i++) {
            if (rt.children[i] != null) {
                dfs(rt.children[i]);
            }
        }
    }

    public static void main(String[] args) {
        String words[] = {"banana", "ate", "eat", "tea", "tap", "pat", "apt"};
        List<List<String>> ans = groupAnagrams(words);
        System.out.println(ans);
    }
}
