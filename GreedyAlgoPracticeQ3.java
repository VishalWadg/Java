import java.util.Arrays;

public class GreedyAlgoPracticeQ3 {
    public static char[] lexicoSmalleststr(int N, int K) {
        char arr[] = new char[N];
        Arrays.fill(arr,'a');
        for (int i = N - 1; i >= 0; i--) {
            K -= i;
            if (K  >= 0) {
                if (K >= 26) {
                    arr[i] = 'z';
                    K -= 26;
                } else {
                    arr[i] = (char)(K + 97 - 1);
                    K -= arr[i] - 'a' + 1;
                }
            } else {
                break;
            }
            K += i; 
        }
        return arr;
    }
    public static void main (String args[]) {
        int n = 5, k = 42;
        char ch[] = lexicoSmalleststr(n, k);
        System.out.println(new String(ch));
    }
}
