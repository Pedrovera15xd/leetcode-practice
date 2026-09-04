# 636. Exclusive Time of Functions

**Difficulty:** Medium  
**Topic:** Stacks / Simulation

## Approach

This problem asks us to calculate the exclusive execution time of each function.

Each log is a `String` containing three pieces of information:

- Function ID
- `"start"` or `"end"`
- Timestamp

For example:

`"0:start:2"`

To retrieve these three pieces of information, I use `.split(":")`.

This separates the log into:

- `parts[0]` → function ID
- `parts[1]` → `"start"` or `"end"`
- `parts[2]` → timestamp

Since the function ID and timestamp are initially strings, I use `Integer.parseInt()` to convert them into integers.

My approach uses a stack to keep track of the functions that are currently active.

The function at the top of the stack is always the function that is currently running.

I also use `prevTime` to represent the first timestamp that has not been counted yet for the currently running function.

### Start Log

If the current log is `"start"`, I first check whether the stack is empty.

If the stack is not empty, another function was already running before the new function started.

I add the time that the previous function was running:

`timestamp - prevTime`

to:

`answer[s.peek()]`

Then, I push the ID of the new function into the stack.

Finally:

`prevTime = timestamp`

because the current timestamp now belongs to the newly started function.

### End Log

If the current log is `"end"`, the function at the top of the stack is the function that is finishing.

I add:

`timestamp - prevTime + 1`

to its exclusive time.

The `+1` is necessary because an ending timestamp is inclusive.

After that, I pop the finished function from the stack.

Then:

`prevTime = timestamp + 1`

because the ending timestamp was already counted, so the next uncounted timestamp is one unit later.

The `answer` array accumulates the execution time for every function ID, even if a function runs in multiple separate execution segments.

After every log has been processed, I return the `answer` array.

## What I Learned

This problem helped me understand how to approach a more complex problem by separating it into smaller pieces.

I learned more about stack-based simulation and why a stack works well for function calls because they follow LIFO order.

I also practiced stack operations such as `push()`, `pop()`, and `peek()`.

I learned new Java syntax such as `.split(":")` for parsing strings, `Integer.parseInt()` for converting strings into integers, and `.equals()` for comparing strings.

The most important part for me was understanding how `prevTime` can be used to incrementally calculate and store the execution time of each function.

I also learned the difference between the calculations for `"start"` and `"end"` events and why an ending timestamp is inclusive.

## Complexity

Let:

`m = number of logs`

`n = number of functions`

**Time:** O(m)

We process every log once using one loop. The stack operations and calculations performed for each log take constant time, so the time complexity is O(m).

**Space:** O(n + m)

The `answer` array contains `n` elements, so it uses O(n) space.

The stack stores active function calls. In the worst case, many function calls can be nested, so the stack can grow proportionally to the number of logs, giving O(m) space.

Therefore, the total worst-case space complexity is O(n + m).