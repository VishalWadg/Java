public class GreedyAlgoPracitceQ1 {

    public static int balancedPartition(String str, int n) {
        int ans = 0, r = 0, l = 0;
        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == 'R') {
                r++;
            } else if (str.charAt(i) == 'L') {
                l++;
            }
            if (r == l) {
               ans++; 
            }
        }
        return ans;
    }
    public static void main (String args[]) {
        String str = "LRRRRLLRLLRL";
        int n = str.length();
        System.out.println("> " + balancedPartition(str, n));
    }
}
