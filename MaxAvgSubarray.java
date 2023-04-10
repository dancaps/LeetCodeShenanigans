/* Using the sliding window method to solve the problem.
You are given an integer array nums consisting of n elements, and an integer k.

Find a contiguous subarray whose length is equal to k that has the maximum 
average value and return this value. Any answer with a calculation error less than 10-5 will be accepted.

Input: nums = [1,12,-5,-6,50,3], k = 4
Output: 12.75000
Explanation: Maximum average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75
*/

class MaxAvgSubarray {
    public double findMaxAverage(int[] nums, int k) {
        double value = 0;
        double answer = 0;
        
        for (int i = 0; i < k; i++) {
            value += nums[i];
        }
        
        answer = value / k;
        
        for (int right = k; right < nums.length; right++) {
            value += nums[right] - nums[right - k];
            answer = Math.max(answer, value / k);
        }
        
        return answer;
    }
}
