# 1470. Shuffle the Array

**Difficulty:** Easy  
**Topic:** Arrays

## Approach

This problem asks me to create a new array using `nums` as the input and rearrange the elements depending on `n`.

My approach was to work with the two halves of the array. I used `nums[i]` to access the elements from the first half and `nums[n + i]` to access the elements from the second half.

Then, I used one `for` loop and `.append()` to add one element from the first half and one element from the second half into the result array.

## What I Learned

This problem helped me understand better how to insert elements into an array using `.append()`.

I also learned how to work with two halves of the same array using indexes and only one `for` loop.

## Complexity

**Time:** O(n)

We use one `for` loop that runs `n` times, and everything inside the loop is O(1), so the total time complexity is O(n).

**Space:** O(n)

The result array contains `2n` elements. In Big-O notation, constants are ignored, so O(2n) becomes O(n).