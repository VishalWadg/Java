import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
public class HashMapPracticeQ3 {
    public static String frequencySort(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            map.put(ch,map.getOrDefault(ch, 0) + 1);
        }
        PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue<>((a,b) -> a.getValue() == b.getValue() ? a.getKey() - b.getKey() : b.getValue() - a.getValue()); // IMP Line
        for (Map.Entry<Character, Integer> el : map.entrySet()) {   // IMP Line
            pq.add(el);
        }
        StringBuilder res = new StringBuilder();
        while (!pq.isEmpty()) {
            char ch = pq.poll().getKey();
            int val = map.get(ch);
            while (val > 0) {
                res.append(ch);
                val--;
            }
        }
        return res.toString();
    }
    public static void main(String[] args) {
        String str = "AppnaCollege";
        str = frequencySort(str);
        System.out.println("Frequency Sorted String > " + str);
    }
}
