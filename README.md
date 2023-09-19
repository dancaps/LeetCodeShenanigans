# About Arrays and Strings:

## Strategies

### Two pointers:
  
    Initialize a left and right index variable.
    Move them towards each other until they meet.
    Use those index variables to swap values or sum values.
    
### Sliding window:
  
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
    
### Prefix sum:
  
    Use this to sum all the values in the array.
    Build the prefix starting with the num[0] value.
    Use a for loop to build the rest of the prefix starting at element 1 and append to the prefix
    The prefix is good at quickly finding the sum of two values in an array. The forumla is right - (left - 1)
    It is also useful when finding the min or max values.
    It works when you want to find the index of a middle index where everything to the left equals the same as everything to the right.

# About HashMaps

## Strategies

### Counting occurances of items:

    Find the unique value between two strings or arrays.
    Count each item and compare the results

### Don't forget about Sets:

    In some cases you can use sets to show you the answers.
    1207 - Check to see if the input is only unique values.
    Put it in a set and check the length of the set against the length of values.

### Frequencies:

    Find the number that has the same number of occurances as it's value.
    Put it in a HashMap and check if key is equal to the value.

### Mapping: 

    Isometric 205 and word patterns 290
    In these problems you map values in a string or array to other values in a string or array.
    This requires 2 hashmaps to check the key to value in each direction.
    Use a loop of index to look in all the differnt data structures

# About Linked Lists

They are similar to an array; however, they are not contiguous in memory. In their simplest form they are a construct that 
holds a value and a reference to the next node. You call the first node the head or you can use a sentinel node at the 
beginning so that you always have a reference to head. That is the starting point of the LL. If there is not a sentinel node then
head is like [0] and head.next is [1] and head.next.next is [2] and so on. If there is a sentinel node then head is just a pointer and
head.next is [0], head.next.next is [1], head.next.next.next [2], etc. The cool thing about them is you can add to the front in O(1) time 
because you don't need to worry about resizing like you would with an array.

## Strategies

### Fast and slow pointers:

    We can start two pointers at head. Slow can move 1 element at a time, while the fast pointer can move 2 elements at a time.
    In LLs we don't know the length of the list. Suppose we have a problem to return the middle element in the list. We could
    iterate it and find the length or even better use fast and slow pointers. Once the fast pointer reaches the end the slow pointer will 
    be halfway through. We can change the speed of the pointers based on the problem requirements.

    Another option for fast slow pointers is find a cyclical node, which means the LL never ends because it's in a circle. If you 
    use this strategy eventually the pointers will land on the same node so you want test for that in the loop.

    We can use this strategy to find a numbered element in the LL. We would create a fixed gap between the fast and slow pointer. 
    When fast reaches the end, slow will be on the node. In this case you would use a for loop to create the gap and then while loop 
    to iterate through the LL.

### Reversing a linked list:

    Simply reversing you can do this by using three variables current, previous and nextNode. Previous would be null because it will 
    represent the null at the end of the LL. Current will be head. With a while loop you check that there is a next node attached to 
    head. In the loop you use a temp variable nextNode to hold the current next node. Now you change the current next to point at previous, 
    thus reversing the order. Move previous to current and current to nextNode. Rinse and repeat.
    
