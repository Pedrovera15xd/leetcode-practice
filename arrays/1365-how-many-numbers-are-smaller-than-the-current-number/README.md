# 1365. How Many Numbers Are Smaller Than the Current Number

**Difficulty:** Easy  
**Topic:** Arrays

## Approach

This problem asks me to create a new array containing how many numbers are smaller than each current number in the input array.

My approach was to use two nested `for` loops.

I use the outer loop to go through every element of the input array and treat that element as the current number.

Then, I use the inner loop to go through the entire array again and compare every number with the current number.

If a number is smaller than the current number, I increase the `count` variable by 1.

After the inner loop finishes, I store the value of `count` in the result array at the same index as the current number.

Then, I reset `count` to 0 before moving to the next element.

## What I Learned

This problem helped me understand better how nested loops work and how they affect time complexity.

I also practiced comparing each element with every other element, using a counter, resetting that counter, and storing the result using indexes.

## Complexity

**Time:** O(n²)

We use a nested loop, meaning one loop runs inside another loop. The outer loop runs `n` times, and for each iteration, the inner loop also runs `n` times.

So, O(n × n) = O(n²).

**Space:** O(n)

We create a result array with the same length as the input array, so it stores `n` elements. Therefore, the space complexity is O(n).