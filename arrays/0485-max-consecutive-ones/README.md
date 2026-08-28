# 485. Max Consecutive Ones

**Difficulty:** Easy  
**Topic:** Arrays

## Approach

This problem asks me to find the maximum number of consecutive `1`s in a binary array.

My approach was to use two variables: `curr` and `largest`.

I use `curr` to keep track of how many consecutive `1`s I currently have while looping through the array.

I use `largest` to store the maximum number of consecutive `1`s found so far.

When I see a `1`, I increase `curr` by 1. Then, I compare `curr` with `largest`, and if `curr` is bigger, I update `largest`.

When I see a `0`, I reset `curr` to 0 because the current streak of consecutive `1`s has ended.

## What I Learned

In this problem, I learned how to approach a problem where I need to keep track of a current value and update a maximum value when necessary while looping through an array.

I also practiced using Java array indexing and `nums.length`.

## Complexity

**Time:** O(n)

We loop through the array one time, and everything inside the loop is O(1), so the total time complexity is O(n).

**Space:** O(1)

We only use a few integer variables such as `curr` and `largest`, so the extra space does not grow with the size of the input array.