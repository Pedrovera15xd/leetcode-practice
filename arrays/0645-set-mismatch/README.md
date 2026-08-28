# 645. Set Mismatch

**Difficulty:** Easy  
**Topic:** Arrays / Hash Map

## Approach

This problem asks me to return an array where the first element is the duplicated number and the second element is the missing number.

My approach was to use a `HashMap` because I thought it was a good way to store every expected number and keep track of how many times each number appears.

First, I initialize the `HashMap` with every number from `1` to `n`, where `n` is the length of the input array. Each key starts with a value of `0`.

Then, I loop through `nums` and update the count of each number in the `HashMap`.

I identify the duplicated number by checking when the count of a number reaches `2`.

To find the missing number, I use another loop from `1` to `n` and check which key still has a value of `0`.

Finally, I return the duplicated number first and the missing number second.

## What I Learned

This problem helped me understand Java syntax and problem solving better, especially how to create and use a `HashMap`.

I also practiced importing `HashMap` and `Map`, accessing keys and values, updating frequencies, and using multiple loops to find different information from the same data structure.

## Complexity

**Time:** O(n)

We use three separate loops that each run at most `n` times. Since the loops are not nested, the total is O(n + n + n), which simplifies to O(n).

**Space:** O(n)

We use a `HashMap` that can store up to `n` entries, so the space complexity is O(n).