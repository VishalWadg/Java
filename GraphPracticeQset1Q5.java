import java.util.Set;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
public class GraphPracticeQset1Q5 {
    public static int smallestLadderLength(String start, String target, Set<String> st) {
        if (start == target) {
            return 0;
        }
        if (!st.contains(target)) {
            return 0;
        }
        int level = 0;
        int wordlength = start.length();
        Queue<String> qu = new LinkedList<>();
        qu.add(start);
        while (!qu.isEmpty()) {
            level++;
            int sizOqu = qu.size();
            for (int i = 0; i < sizOqu; i++) {
                char word[] = qu.peek().toCharArray();
                qu.remove();
                for (int pos = 0; pos < wordlength; pos++) {
                    char orig_char = word[pos];
                    for (char ch = 'a'; ch < 'z'; ch++) {
                        word[pos] = ch;
                        if (String.valueOf(word).equals(target)) {
                            return level + 1;
                        }
                        if (!st.contains(String.valueOf(word))) {
                            continue;
                        }
                        st.remove(String.valueOf(word));
                        qu.add(String.valueOf(word));
                    }
                    word[pos] = orig_char;
                }
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        Set<String> D = new HashSet();
        D.add("poon");
        D.add("plee");
        D.add("same");
        D.add("poie");
        D.add("plie");
        D.add("poin");
        D.add("plea");
        D.add("tlon");
        D.add("plon");
        D.add("plen");
        String start = "toon";
        String target = "plea";
        System.out.println(smallestLadderLength(start, target, D));
        System.out.println(D);
    }
}
