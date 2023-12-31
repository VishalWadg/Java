import java.util.Map;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
public class GrphPracticeQSet2Q4 {
    public static String alienDictionary(String words[]) {
        Map<Character, Set<Character>> map = new HashMap<>();
        Map<Character, Integer> dergree = new HashMap<>();
        String result = "";
        if (words == null || words.length == 0) {
            return result;
        }
        for (String str : words) {
            for (char ch : str.toCharArray()) {
                dergree.put(ch, 0);
            }
        }
        for (int i = 0; i < words.length - 1; i++) {
            String curr = words[i];
            String next = words[i + 1];
            int n = Math.min(curr.length(), next.length());
            for (int j = 0; j < n; j++) {
                char c1 = curr.charAt(j);
                char c2 = next.charAt(j);
                if (c1 != c2) {
                    Set<Character> set = map.getOrDefault(c1, new HashSet<>());  
                    if (!set.contains(c2)) {
                        set.add(c2);
                        map.put(c1, set);
                        dergree.put(c2, dergree.get(c2) + 1);
                    }
                    break;
                }
            }
        }
        Queue<Character> qu = new LinkedList<>();
            for (char ch : dergree.keySet()) {
                if (dergree.get(ch) == 0) {
                    qu.add(ch);
                }
            }
            while (!qu.isEmpty()) {
                char ch = qu.poll();
                result += ch;
                if (map.containsKey(ch)) {
                    for (char nex: map.get(ch)) {
                        dergree.put(nex, dergree.get(nex) - 1);
                        if (dergree.get(nex) == 0) {
                            qu.add(nex);
                        }
                    }
                }
            }
        return result.length() == dergree.size() ? result : "";  
    }
    public static void main(String[] args) {
        String words [] = {"baa", "abcd", "abca", "cab", "cad"};
        System.out.println(alienDictionary(words));
    }
}
