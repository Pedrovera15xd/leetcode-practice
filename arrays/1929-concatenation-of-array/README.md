# 1929. Concatenation of Array

**Difficulty:** Easy  
**Topic:** Arrays

## Approach

This problem asks me to build a new array `ans` with size `2n`, where `n` is the length of the input array `nums`.

My approach was to first create the new array `ans` with enough space to store all the elements of `nums` twice.

Then, I used a `for` loop to go through the indexes of `nums`.

I filled the first half of `ans` using:

`ans[i] = nums[i]`

Then, I filled the second half using:

`ans[len(nums) + i] = nums[i]`

This way, the final array contains all the elements of `nums` followed by the same elements again.

## What I Learned

This problem helped me understand some basic Python syntax better, especially how to use `range(len(nums))` to iterate through an array using its indexes.

I also learned how to create a list with a fixed size and how to use indexes to place values in specific positions.

## Complexity

**Time:** O(n)

The loop runs `n` times, and each iteration performs constant-time operations, so the total time complexity is O(n).

**Space:** O(n)

The new array `ans` contains `2n` elements. In Big-O notation, constants are ignored, so O(2n) becomes O(n).