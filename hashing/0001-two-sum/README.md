# 1. Two Sum

**Difficulty:** Easy  
**Topic:** Hashing / HashMap

## Approach

We are given an integer array called `nums` and an integer called `target`.

The goal is to find two different indexes whose values add up to `target`.

My first idea was to use two loops and compare every possible pair of elements.

That approach would work, but it would have a time complexity of:

`O(n²)`

Instead, I used a `HashMap` to create an O(n) average-time solution.

The HashMap stores:

`number -> index`

For every element in `nums`, I calculate:

`needed = target - nums[i]`

The variable `needed` represents the number required to complete the target with the current element.

Then I check whether `needed` already exists in the HashMap using:

`dictionary.containsKey(needed)`

If it exists, then we have found the two numbers whose sum equals `target`.

The index of the previously seen number is:

`dictionary.get(needed)`

and the index of the current number is:

`i`

I store both indexes in the answer array.

If `needed` is not already in the HashMap, I store the current number and its index using:

`dictionary.put(nums[i], i)`

This allows future iterations to find the current number if they need it as their complement.

Finally, I return the array containing the two indexes.

## What I Learned

This problem helped me understand how hashing can improve a brute-force solution.

My first approach would have used two loops and taken O(n²) time, but using a HashMap reduces the average time complexity to O(n).

I also learned how to use simple math to find the value needed to complete the target:

`needed = target - nums[i]`

Another important concept I practiced was storing:

`number -> index`

inside a HashMap.

This is different from previous hashing problems where I used HashMaps to count frequencies.

I also practiced using:

- `containsKey()`
- `get()`
- `put()`

to find and retrieve information efficiently.

## Complexity

Let:

`n = number of elements in nums`

**Time:** O(n)

We iterate through the array once.

For every element, HashMap operations such as `containsKey()`, `get()`, and `put()` are O(1) on average.

Therefore, the total average time complexity is:

`O(n)`

**Space:** O(n)

In the worst case, we may store up to `n` numbers and their indexes in the HashMap.

Therefore, the auxiliary space complexity is:

`O(n)`