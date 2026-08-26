
# LeetCode 416: Partition Equal Subset Sum Explanation

## Approach

My approach to this problem is to use **Dynamic Programming**.

## Step-by-Step Explanation

First, I create a variable called `sum` to store the total sum of all the elements in the array. I loop through `nums` and add every element to `sum`.

Then, I check if `sum` is odd. If `sum % 2 != 0`, I return `false` because an odd total sum cannot be split into two equal parts.

If the sum is even, I create a variable called `goal`, which stores `sum / 2`. This `goal` is the target sum that I need to find in one subset.

Next, I create a boolean Dynamic Programming array called `dp` with size `goal + 1`.

In this array, `dp[s]` means whether it is possible to create a subset with sum `s` using the numbers processed so far.

For example, if `dp[5]` is `true`, it means that a subset with sum `5` can be created.

The base case is `dp[0] = true` because it is always possible to make a sum of `0` by choosing no elements.

After that, I loop through every number in `nums`. For each number, I loop backward from `goal` down to the current number. The reason I loop backward is to make sure each number is only used once.

Inside the loop, I update the DP array using this idea:

If `dp[s]` is already true, then we keep it true.  
If `dp[s - currentNumber]` is true, then we can also make sum `s` by adding the current number.

So the DP array keeps track of all possible subset sums that can be made.

At the end, I return `dp[goal]`.

If `dp[goal]` is `true`, then we found a subset whose sum is equal to half of the total sum, so the array can be partitioned into two equal subsets.

If `dp[goal]` is `false`, then no subset can reach the target sum, so the array cannot be partitioned equally.

## Complexity

The time complexity is `O(n * goal)` because for each number in the array, we check possible sums up to `goal`.

The space complexity is `O(goal)` because we only use one boolean DP array of size `goal + 1`.

## Summary

This problem uses Dynamic Programming because we solve smaller subset sum problems and use those results to build the final answer.

The main idea is to check if we can create a subset with sum equal to half of the total sum.

