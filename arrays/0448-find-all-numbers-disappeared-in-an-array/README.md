# 448. Find All Numbers Disappeared in an Array

**Difficulty:** Easy  
**Topic:** Arrays / Hash Map

## Approach

This problem asks me to find all the missing numbers from `1` to `n`, where `n` is the length of the input array `nums`.

My approach was to use a `HashMap` because it can help me store every expected number from `1` to `n` and identify which numbers are missing.

First, I initialize the `HashMap` with every number from `1` to `n` and give each key a value of `0`.

Then, I loop through the input array and mark every number that appears by changing its value in the `HashMap` to `1`.

After that, I use another loop and an `if` statement to check which keys still have a value of `0`.

If a key still has a value of `0`, that means the number never appeared in `nums`, so I add that number to the result list.

I use a `List<Integer>` with an `ArrayList<Integer>` because I do not know beforehand how many numbers will be missing, so the result needs to grow dynamically.

## What I Learned

This problem helped me understand `HashMap` better and also helped me learn how to use `List<Integer>` and `ArrayList<Integer>` in Java.

I also practiced the difference between Java arrays and lists, using `.add()`, working with array indexes starting at `0`, and checking expected values from `1` to `n`.

## Complexity

**Time:** O(n)

We use three separate `for` loops. Since they are not nested, the total time is O(n + n + n), which simplifies to O(n).

**Space:** O(n)

We use a `HashMap` that can store up to `n` entries, and the result `ArrayList` can also grow up to `n` elements, so the space complexity is O(n).