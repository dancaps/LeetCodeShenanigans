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
    Also finding the size of a sub array. **right - left + 1**
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

About HashMaps

Consider the following strategies

Counting occurances of items:

    Find the unique value between two strings or arrays.
    Count each item and compare the results

Don't forget about Sets:

    In some cases you can use sets to show you the answers.
    1207 - Check to see if the input is only unique values.
    Put it in a set and check the length of the set against the length of values.

Frequencies:

    Find the number that has the same number of occurances as it's value.
    Put it in a HashMap and check if key is equal to the value.

Mapping: 

    Isometric 205 and word patterns 290
    In these problems you map values in a string or array to other values in a string or array.
    This requires 2 hashmaps to check the key to value in each direction.
    Use a loop of index to look in all the differnt data structures
