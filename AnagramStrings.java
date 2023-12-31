import java.util.Arrays;
import java.util.Scanner;

public class AnagramStrings {
    public static boolean isAnagram(String str, String str1) {
        str = str.toLowerCase();
        str1 = str1.toLowerCase();
        if (str.length() == str1.length()) {
            char strchararray[] = str.toCharArray();
            char str1chararray[] = str1.toCharArray();
            Arrays.sort(strchararray);
            Arrays.sort(str1chararray);
            if (Arrays.equals(strchararray, str1chararray)) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = new String();
        String str1 = new String();
        System.out.println("Enter first String : ");
        str = sc.next();
        System.out.println("Enter second String : ");
        str1 = sc.next();
        String ans = isAnagram(str, str1)?"The Strings entered are anagram !": "The strings entered are not anagram !";
        System.out.println(ans);
        sc.close();
    }
}
