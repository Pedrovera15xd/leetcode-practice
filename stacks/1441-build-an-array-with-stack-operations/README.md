# 1441. Build an Array With Stack Operations

**Difficulty:** Easy  
**Topic:** Stacks

## Approach

This problem asks me to build the `target` array using stack operations and return every `"Push"` and `"Pop"` operation that was required.

The numbers are read in order from `1` to `n`.

For every current number, I first push it into the stack and store `"Push"` in the solution list.

Then, I compare the current number with `target[targetIndex]`.

If the current number is not the number that I currently need from `target`, I pop it from the stack and add `"Pop"` to the solution list.

If the current number matches `target[targetIndex]`, I keep it in the stack and increase `targetIndex` by 1 so that I can start looking for the next required number in `target`.

`targetIndex` represents the current position in the `target` array that I am trying to match.

Once `targetIndex` becomes equal to `target.length`, it means that every required number has been found and the target has been completely built. At that point, I use `break` to stop the loop even if I have not reached `n`.

The result list stores every `"Push"` and `"Pop"` operation used during this process.

## What I Learned

In this problem, I learned more about how a stack works using LIFO and how to use its operations such as `push()`, `pop()`, and `peek()`.

I also reviewed how to use an `ArrayList` to store the operations performed by the stack.

Another important thing I learned was how to track a position inside another array using an index. In this solution, `targetIndex` helps me keep track of the next number that I need from `target`.

I also practiced using `break` to stop a loop early once the required result has already been completed.

## Complexity

**Time:** O(n)

We use one `for` loop that can run at most `n` times. The stack and list operations used inside the loop take constant time, so the total time complexity is O(n).

**Space:** O(n)

The stack can store up to `n` numbers, and the result `ArrayList` stores a number of operations proportional to `n`.

Therefore:

O(n + n) = O(n).