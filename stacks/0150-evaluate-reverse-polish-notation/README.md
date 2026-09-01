# 150. Evaluate Reverse Polish Notation

**Difficulty:** Medium  
**Topic:** Stacks

## Approach

Explain:

- What Reverse Polish Notation is.
- How the tokens are processed from left to right.
- What happens when the current token is a number.
- Why numeric strings need to be converted with `Integer.parseInt()`.
- What happens when the current token is an operator.
- Why you pop the right operand first and the left operand second.
- How you calculate `left operator right`.
- Why the result of each operation is pushed back into the stack.
- Why the final answer is the last remaining value in the stack.

## What I Learned

Explain what this problem helped you understand better.

You can mention:

- How Reverse Polish Notation works.
- Why a stack is useful for expressions that need the most recent values.
- `push()`
- `pop()`
- The importance of operand order for subtraction and division.
- Converting a `String` into an `int` using `Integer.parseInt()`.
- Comparing Java strings with `.equals()` instead of `==`.
- Java integer division.
- How intermediate results can be pushed back into the stack and reused.

## Complexity

**Time:** O(?)

Explain why each token is processed once and why the stack/arithmetic operations inside the loop are constant time.

**Space:** O(?)

Explain how the size of the stack can grow with the number of tokens.