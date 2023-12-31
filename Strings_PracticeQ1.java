import java.util.Scanner;

public class Strings_PracticeQ1 {
    public static int ans(String str) {
        String vowels = new String("aeiou");
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < vowels.length(); j++) {
                if (str.charAt(i) == vowels.charAt(j)) {
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = new String();
        System.out.println("Enter any string : ");
        str = sc.nextLine();
        System.out.println("The number of lowercase vowels in the given string is : " + ans(str));
        sc.close();
    }
}
