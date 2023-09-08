# Notes

About Arrays and Strings:
Consider the following strategies.
  Two pointers:
    Initialize a left and right index variable.
    Move them towards each other until they meet.
    Use those index variables to swap values or sum values.
  Sliding window:
    Used to find sub arrays.
    Can be used to find the number of sub arrays that meet some criteria.
    Also finding the size of a sub array. right - left + 1
    The pattern is: 
      Initialize the left pointer to 0
      Use a for loop to move the right pointer
      Test some value we will call k
      Use a while loop to move the left pointer to the right when the test is failing, also make sure that the left pointer does not overrun the right pointer.
        Move left
        Update the test to remove the left value from the test
  Prefix sum:
    Use this to sum all the values in the array.
    Build the prefix starting with the num[0] value.
    Use a for loop to build the rest of the prefix starting at element 1 and append to the prefix
    The prefix is good at quickly finding the sum of two values in an array. The forumla is right - (left - 1)
    It is also useful when finding the min or max values.
    It works when you want to find the index of a middle index where everything to the left equals the same as everything to the right.
    
