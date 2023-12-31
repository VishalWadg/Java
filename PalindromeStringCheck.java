import java.util.Scanner;

public class PalindromeStringCheck {
    public static boolean ispal(String str) {
        for (int i = 0; i < str.length()/2; i++) {
            int n = str.length();
            if (str.charAt(i) != str.charAt(n-1-i)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = new String();
        str = sc.nextLine();
        String output = ispal(str) ? "The entered string is palindrome " : "The entered string is not palindrome" ;
        System.out.println(output);
        sc.close();
    }
}
