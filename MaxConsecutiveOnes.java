/* Used sliding window method. Remember that instead of flipping the bit you can just count 0's.

Given a binary array nums and an integer k, return the maximum number of consecutive 1's in the array if you can flip at most k 0's.
Input: nums = [1,1,1,0,0,0,1,1,1,1,0], k = 2
Output: 6
Explanation: [1,1,1,0,0,1,1,1,1,1,1]
Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.
*/

class MaxConsecutiveOnes {
    public int longestOnes(int[] nums, int k) {
        int answer = 0;
        int left = 0;
        int zeroCounter = 0;
        
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0) { // if it's a 1 you will skip this and update the answer
                zeroCounter++;
                while (left <= right && zeroCounter > k) { // As long and left hasn't overrun right and 0's are more than k
                    if (nums[left] == 0) { 
                        zeroCounter--;
                    }
                    left++;
                }
            }
            answer = Math.max(answer, right - left + 1); // Update the answer
        }
        return answer;
    }
}
