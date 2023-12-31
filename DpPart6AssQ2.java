import java.util.Scanner;

public class DpPart6AssQ2 {
    public static void printParenthesisUtil(int open, int close, int n, int pos, char str[]){
        if (close == n) {
            for (int i = 0; i < str.length; i++) {
                System.out.print(str[i]);
            }
            System.out.println();
            return;
        }else{
            if (open > close) {
                str[pos] = '}';
                printParenthesisUtil(open, close + 1, n, pos + 1, str);
            }
            if (open < n) {
                str[pos] = '{';
                printParenthesisUtil(open + 1, close, n, pos + 1, str);
            }
        }
    }
    public static void printParenthesis(int n, char str[]){
        if (n > 0) {
            printParenthesisUtil(0, 0, n, 0, str);
        }
        return;
    }
    public static void main(String[] args) {
        int n;
        System.out.print("Enter any +ve num > ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        char str[] = new char[2 * n];
        printParenthesis(n, str);
    }
}
