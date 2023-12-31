import java.util.Scanner;

public class SqrPattern {
    public static void main(String args[]){
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            int j = 1;
            while (j <= n) {
              System.out.print("* "); 
              j++; 
            }
            System.out.println("");
        }
        sc.close();
    }
    
}
