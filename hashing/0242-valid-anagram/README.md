# 242. Valid Anagram

**Difficulty:** Easy  
**Topic:** Hashing / HashMap

## Approach

We are given two strings, `s` and `t`.

The goal is to determine whether `t` is an anagram of `s`.

Two strings are anagrams when they contain the same characters with the same frequencies, even if those characters appear in a different order.

My approach was to create two HashMaps:

`d1`

stores the frequency of every character in `s`.

`d2`

stores the frequency of every character in `t`.

Before creating the frequency maps, I first check:

`s.length() != t.length()`

If the strings have different lengths, they cannot be anagrams, so I immediately return `false`.

Then I iterate through `s`.

For every character, I check whether it already exists in `d1` using:

`containsKey()`

If it already exists, I increase its frequency by one.

Otherwise, I insert the character with a frequency of `1`.

I repeat the same process for `t` using `d2`.

After both frequency maps are created, I iterate through `s` again and compare the frequency of each character in both maps.

I use:

`.equals()`

to compare the `Integer` values stored in the HashMaps.

If the frequencies are different, I return `false`.

If every character has the same frequency in both maps, I return `true`.

## What I Learned

This problem helped me understand how to use HashMaps with strings.

I practiced iterating through a string using:

`charAt(i)`

and using characters as HashMap keys.

I also practiced using:

- `containsKey()`
- `get()`
- `put()`

to create frequency maps.

Another important thing I learned was to use `.equals()` when comparing the values of `Integer` objects instead of using `==`.

This problem also helped me understand that anagrams are determined by character frequencies rather than the order of the characters.

## Complexity

Let:

`n = length of the strings`

**Time:** O(n)

We traverse `s` once to build `d1`.

We traverse `t` once to build `d2`.

Then we traverse `s` again to compare the frequencies.

Therefore:

`O(n) + O(n) + O(n) = O(n)`

**Space:** O(n)

In the general case, the HashMaps can store up to O(n) different characters.

Therefore, the auxiliary space complexity is O(n).

For this specific LeetCode problem, the strings contain only lowercase English letters, so there can be at most 26 different keys. Under that constraint, the space can also be considered O(1).