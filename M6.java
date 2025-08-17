//Given an array arr of n integers, where arr[i] represents price of the stock on the ith day. Determine the maximum profit achievable by buying and selling the stock at most once.
//
//
//
//The stock should be purchased before selling it, and both actions cannot occur on the same day.

public class M6 {
    public int maxProfit(int[] arr) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int price : arr) {
            if (price < minPrice) {
                minPrice = price;
            } else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice;
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        M6 sol = new M6();
        int[] arr = {7, 1, 5, 3, 6, 4};
        System.out.println(sol.maxProfit(arr));
    }
}
