public class RecursionRemoveDuplicatesFromString {
    public static void removedup(int idx, String str, boolean map[], StringBuilder newStr) {
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(idx);
        if (map[currChar - 'a'] == true) {
            // duplicate
            removedup(idx + 1, str, map, newStr);
        } else {
            map[currChar - 'a'] = true;
            removedup(idx + 1, str, map, newStr.append(currChar));
        }
    }

    public static void main(String[] args) {
        String str = "appnnacollege";
        boolean map[] = new boolean[26];
        int idx = 0;
        StringBuilder newStr = new StringBuilder("");
        removedup(idx, str, map, newStr);
    }
}
