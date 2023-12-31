import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapsack {
    public static void main (String args[]) {
        int value [] = {60, 100, 120};
        int weight [] = {10, 20, 30};
        double ratio [][] = new double[value.length][2];
        for (int i = 0; i < weight.length; i++) {
            ratio[i][0] = i;
            ratio[i][1] = value[i] /(double) weight[i];
        }
        Arrays.sort(ratio, Comparator.comparingDouble(o -> (o[1])));
        int capacity = 50;
        int maxProfit = 0;
        for (int i = ratio.length - 1; i >= 0; i--) {
            int idx = (int)ratio[i][0];
            if (capacity >= weight[idx]) {
                capacity -= weight[idx];
                maxProfit += value[idx];
            } else {
                maxProfit += capacity * ratio[i][1];
                capacity = 0;
                break;
            }
        }
        System.out.println("maxProfit > " + maxProfit);
    }
}
