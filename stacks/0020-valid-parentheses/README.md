# 20. Valid Parentheses

**Difficulty:** Easy  
**Topic:** Stack

## Approach
I use a stack to track each opening bracket and a dictionary to tell me which open bracket should match with the current closing bracket. And if they match pop() otherwise you return False if you encounter a closing bracket while the stack is empty, and after the loop the stack must be empty for the string to be valid.

## What I Learned
I learned how to use stacks and dictionaries better, and a better understanding of how to use them in problems.

## Complexity
Time: O(n)
Space: O(n)