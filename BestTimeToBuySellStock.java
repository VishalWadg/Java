public class BestTimeToBuySellStock {
    public static int calc(int prices[]) {
        int maxprofit = 0, buyprice = Integer.MAX_VALUE, profit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (buyprice < prices[i]) {
                profit = prices[i] - buyprice;
                maxprofit = Math.max(maxprofit, profit);
            } else {
                buyprice = prices[i];
            }
        }
        return maxprofit;
    }

    public static void main(String[] args) {
        int prices[] = { 7, 1, 5, 3, 6, 4, 10 };
        System.out.println("The best profit we could earn is : " + calc(prices));
    }
}
