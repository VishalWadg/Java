import javax.print.FlavorException;

public class Is_PowerOf2OrNot {
    public static boolean check(int n) {
        if ((n & n-1) == 0) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
       int n = 32;
       System.out.println(check(n)); 
    }
}
