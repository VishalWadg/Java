public class BacktrackingPracticeQ2 {
    final static char L[][] = {{},{},{'a', 'b', 'c'}, {'d', 'e', 'f'}, {'g', 'h', 'i'}, {'j', 'k', 'l'}, {'m', 'n', 'o'}, {'p', 'q', 'r', 's'}, {'t', 'u', 'v'}, {'w', 'x', 'y', 'z'}};
    public static void letterCombinations(String diledNum) {
        int len = diledNum.length();
        if (len == 0) {
            System.out.print("");
            return;
        } 
        bfs(0, len, new StringBuilder(), diledNum);
    }
    public static void bfs(int pos, int len, StringBuilder sb, String dilNum) {
        if (pos == len) {
            System.out.println(sb.toString());
        } else {
            char letters[] = L[Character.getNumericValue(dilNum.charAt(pos))];
            for (int i = 0; i < letters.length; i++) {
                bfs(pos + 1, len, new StringBuilder(sb).append(letters[i]), dilNum);
            }
        }
    }
    public static void main (String args[]) {
        String dilnum = "234";
        letterCombinations(dilnum);
    }
}
