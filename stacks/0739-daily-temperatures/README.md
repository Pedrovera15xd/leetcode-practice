# 739. Daily Temperatures

**Difficulty:** Medium  
**Topic:** Stack / Monotonic Stack

## Approach

We are given an array called `temperatures`.

For each temperature, we need to determine how many days we have to wait until a warmer temperature appears.

Each movement to the next index represents one day.

If there is no warmer temperature in the future, the answer for that day remains `0`.

My first thought was to use a brute-force approach with two `for` loops.

The outer loop would go through every temperature in the array, and the inner loop would search through the temperatures to the right until it found the first warmer temperature.

Then we could calculate the number of days by subtracting the indexes.

This approach would work, but in the worst case it would take O(n²) time.

To make the solution more efficient, I used a monotonic stack.

The stack stores the indexes of temperatures that are still waiting for a warmer future temperature.

For every current index `i`, I check:

`!s.isEmpty() && temperatures[s.peek()] < temperatures[i]`

This means that while the stack is not empty and the current temperature is warmer than the temperature represented by the index at the top of the stack, we have found the warmer day for that previous temperature.

I calculate the number of days using:

`answer[s.peek()] = i - s.peek()`

The current index `i` represents the warmer day, while `s.peek()` represents the previous day that was waiting.

Subtracting the two indexes gives the number of days we had to wait.

After finding the answer for that previous day, I remove its index from the stack using:

`s.pop()`

The `while` loop is necessary because one current temperature may be warmer than multiple previous temperatures that are still waiting in the stack.

After resolving all previous temperatures that the current temperature can resolve, I add the current index to the stack using:

`s.push(i)`

because the current temperature may need to wait for a warmer temperature later.

Any indexes remaining in the stack after the loop finishes never found a warmer future temperature.

Since a Java `int[]` is initialized with `0` by default, those positions already contain the correct answer.

## What I Learned

This problem helped me understand monotonic stacks better and how to apply them to a problem.

I practiced stack operations such as `push()`, `pop()`, `peek()`, and `isEmpty()`.

I also learned why storing indexes instead of the temperatures themselves is useful.

By storing indexes, I can both access the corresponding temperature and calculate the number of days between two positions.

Another important thing I practiced was recognizing that a `while` loop inside a `for` loop does not automatically mean the algorithm is O(n²).

Each index is pushed onto the stack once and popped at most once.

This problem also helped me think about how to improve a brute-force approach and find a more efficient solution.

## Complexity

**Time:** O(n)

The `for` loop processes each temperature once.

Each index is pushed onto the stack once and popped at most once.

Therefore, even though there is a `while` loop inside the `for` loop, the total number of stack operations is proportional to `n`.

So:

`O(n + n) = O(2n) = O(n)`

**Space:** O(n)

The `answer` array contains `n` elements.

The stack can also contain up to `n` indexes in the worst case.

Therefore:

`O(n) + O(n) = O(n)`