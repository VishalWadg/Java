import java.util.HashMap;
public class ValidAnagramHashMap {
    public static boolean isAnagram(String str1, String str2) {
        // if (str1.length() != str2.length()) {
        //     return false;
        // }
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
        }
        for (int i = 0; i < str2.length(); i++) {
            char ch = str2.charAt(i);
            if (hm.containsKey(ch)) {
                if (hm.get(ch) == 1) {
                    hm.remove(ch);
                } else {
                    hm.put(ch, hm.get(ch) - 1);
                }
            } else {
                return false;
            }
        }
        if (hm.isEmpty()) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String str = "abcdec";
        String str2 = "cbdaec";
        System.out.println("is anagram > " + isAnagram(str, str2));
    }
}
