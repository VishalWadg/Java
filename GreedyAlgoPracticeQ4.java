public class GreedyAlgoPracticeQ4 {
    public static int bestTimetoBuyStock(int prices[]) {
        int buy = prices[0];
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (buy > prices[i]) {
                buy = prices[i];
            } 
            int cf = prices[i] - buy;
            maxProfit = Math.max(maxProfit, cf);
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int prices[] = {7, 1, 5, 3, 6, 4};
        int maxProfit = bestTimetoBuyStock(prices);
        System.out.println("Max profit tha could be made is > " + maxProfit);
    }
}
