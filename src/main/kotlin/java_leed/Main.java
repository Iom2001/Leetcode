package java_leed;

class Main {
    public static void main(String[] args) {
    }

    public int maxProfit(int[] prices) {
        int max = Integer.MAX_VALUE;
        int min = 0;
        int profit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < max) {
                max = prices[i];
            }
            min = prices[i] - max;
            if (profit < min) {
                profit = min;
            }
        }
        return profit;
    }
}