// This one was pretty easy. I'm getting the hang of two pointers. I know there are better ways to do this but it took me 20 minutes.

/*
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.

 

Example 1:

Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
Example 2:

Input: nums = [0]
Output: [0]
*/

package OneToTwenty;

import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args) {
        int[] nums = {0, 0, 0, 1, 0, 3, 12, 0};
        System.out.println(Arrays.toString(nums));
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void moveZeroes(int[] nums) {

        int left = 0; // Left pointer

        for (int right = 0; right < nums.length; right++) { // Moves the right pointer

            // If the value in the right pointer is not zero and left is less, 
            // that means the left pointer is waiting at a zero
            if (nums[right] != 0 && left < right) { 
                nums[left] = nums[right]; // Move the value of the right pointer to the index of the left pointer
                nums[right] = 0; // Set the value of the right pointer to zero
            }

            // While the value of the left pointer is not zero and left has not passed right
            while (nums[left] != 0 && left <= right) {
                left++; // Increment the left pointer
            }
        }
    }
}
