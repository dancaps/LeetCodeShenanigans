package TwentyOneToForty;

/**
 * You are given an array prices where prices[i] is the price of a given stock on the ith day.
 * You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the
 * future to sell that stock.
 * Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
 *
 * Example 1:
 * Input: prices = [7,1,5,3,6,4]
 * Output: 5
 * Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
 * Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
 *
 * Example 2:
 * Input: prices = [7,6,4,3,1]
 * Output: 0
 * Explanation: In this case, no transactions are done and the max profit = 0.
 *
 * Constraints:
 * 1 <= prices.length <= 105
 * 0 <= prices[i] <= 104
 */

public class BestTimeToBuyAndSellStocks {
    public static void main(String[] args) {
        System.out.println("Expected: 5, Actual: " + solution(new int[]{7,1,5,3,6,4}));
        System.out.println("Expected: 0, Actual: " + solution(new int[]{7,6,4,3,1}));
    }

    public static int solution(int[] prices) {
        int answer = 0;
        int left = 0;
        int right = 1;

        while(right < prices.length) {
            if(prices[left] < prices[right]) {
                answer = Math.max(answer, prices[right] - prices[left]);
            } else {
                left = right;
            }
            right++;
        }

        return answer;
    }
}
/**
 prices = [7,1,5,3,6,4]
 prices = [2,2,5,3,6,1,4]
 int left = 0, right = 1, answer = 0

 while r < the length of prices
 if the value of left is < the value of right // This is the key. It finds the lowest left value
 answer = math.max(answer, value of right - value of left
 r++
 else
 move left to right
 r++

 return answer
 */