# 150. Evaluate Reverse Polish Notation

**Difficulty:** Medium  
**Topic:** Stacks

## Approach

Reverse Polish Notation is a different way of writing mathematical expressions where the operator comes after the numbers.

For example:

`2 + 4`

in Reverse Polish Notation becomes:

`2 4 +`

The goal of this problem is to evaluate the expression and return its final value.

My approach was to use a stack.

I loop through every token from left to right.

If the current token is a number, I convert the `String` into an integer using `Integer.parseInt()` and push it into the stack.

If the current token is an operator, I pop the last two numbers from the stack.

The first number popped is stored as `right`, and the second number popped is stored as `left`.

This order is important because subtraction and division depend on the order of the operands.

Then, I perform the corresponding operation:

`left operator right`

After calculating the result, I push that result back into the stack so it can be used in future operations.

After every token has been processed, the stack contains one final value, which is the answer.

## What I Learned

This problem helped me learn how Reverse Polish Notation works.

More importantly, it helped me understand better how to use stack operations such as `push()` and `pop()` when solving expressions.

I also learned how intermediate results can be pushed back into the stack and used by later operations.

I practiced converting a `String` into an integer using `Integer.parseInt()`.

I also learned that Java strings should be compared using `.equals()` instead of `==` when I want to compare their contents.

Another important concept was keeping the correct operand order for subtraction and division.

## Complexity

**Time:** O(n)

We use one `for` loop to process every token once.

The stack operations and arithmetic operations performed during each iteration take constant time.

Therefore, the total time complexity is O(n).

**Space:** O(n)

We use a stack that can contain a number of values proportional to the number of tokens.

Therefore, the space complexity is O(n).