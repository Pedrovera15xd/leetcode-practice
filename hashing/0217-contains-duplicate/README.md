# 217. Contains Duplicate

**Difficulty:** Easy  
**Topic:** Hashing / HashMap

## Approach

We are given an integer array called `nums`.

The goal is to determine whether any number appears more than once in the array.

My approach was to create a `HashMap` and iterate through the array.

For every element, I check whether the number already exists in the HashMap using:

`containsKey()`

If the number already exists, that means we found a duplicate, so I immediately return:

`true`

If the number does not exist yet, I insert it into the HashMap using:

`put()`

and continue checking the rest of the array.

If the loop finishes without finding any repeated value, I return:

`false`

## What I Learned

This problem helped me practice solving problems using hashing.

I reviewed how to use a `HashMap` and methods such as:

- `containsKey()`
- `put()`

I also learned how hashing can help detect duplicates efficiently without comparing every element with every other element.

Instead of using nested loops, I can store values that I have already seen and check whether the current value already exists.

## Complexity

Let:

`n = number of elements in nums`

**Time:** O(n)

We iterate through the array once.

For every element, `containsKey()` and `put()` are O(1) on average.

Therefore, the total average time complexity is O(n).

**Space:** O(n)

In the worst case, all elements are unique, so the HashMap may store all `n` elements.

Therefore, the auxiliary space complexity is O(n).