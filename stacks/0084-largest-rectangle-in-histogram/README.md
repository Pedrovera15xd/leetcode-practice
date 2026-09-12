# 84. Largest Rectangle in Histogram

**Difficulty:** Hard  
**Topic:** Stack / Monotonic Stack

## Approach

We are given an array called `heights`, where each value represents the height of a histogram bar.

Each bar has a width of `1`.

The goal is to find the largest rectangular area that can be formed using consecutive bars.

If a rectangle uses multiple bars, its height is limited by the shortest bar in that range.

The area of a rectangle is:

`area = height * width`

My first thought was to use a brute-force approach.

For every bar, I could expand through the other bars, keep track of the minimum height in the current range, calculate the area, and compare it with the largest area found so far.

This approach would work, but it could take O(n²) time.

To make the solution more efficient, I used a monotonic stack.

The stack stores indexes instead of heights.

Using indexes is important because they allow me to access the height with `heights[index]` and also calculate the width of a rectangle using the distance between indexes.

The stack keeps indexes of bars that have not yet found a shorter bar on their right.

While processing each index `i`, I check:

`!s.isEmpty() && heights[i] < heights[s.peek()]`

This means that while the stack is not empty and the current bar is shorter than the bar represented by the index at the top of the stack, that previous bar can no longer extend any farther to the right.

At that moment, I pop its index:

`int poppedIndex = s.pop();`

The current index `i` becomes the right boundary of the rectangle for the popped bar because the current height is smaller.

After popping, I find the left boundary.

If the stack is not empty:

`leftBoundary = s.peek()`

The new top of the stack represents the bar that limits how far the popped bar can extend to the left.

If the stack is empty:

`leftBoundary = -1`

The value `-1` acts as a virtual position before the beginning of the array. It means there is no previous bar blocking the rectangle from extending all the way to index `0`.

The width is calculated using:

`width = rightBoundary - leftBoundary - 1`

We subtract `1` because the two boundary positions themselves are not included in the rectangle.

Then the area is:

`currentArea = heights[poppedIndex] * width`

We use `heights[poppedIndex]` because `poppedIndex` is only the position of the bar, while `heights[poppedIndex]` gives us its actual height.

If `currentArea` is greater than `maxArea`, I update `maxArea`.

After resolving all taller bars, I push the current index into the stack:

`s.push(i)`

After the main `for` loop finishes, some indexes may still remain in the stack.

Those bars never found a shorter bar on their right, so I use:

`rightBoundary = heights.length`

This acts as a virtual position just after the end of the array.

Then I pop each remaining index and use the same process:

- Find the left boundary.
- Calculate the width.
- Calculate the area.
- Update `maxArea` if necessary.

Finally, I return the largest area found.

## What I Learned

This problem helped me understand how to approach a more complex problem using a monotonic stack.

I learned how indexes can be used not only to access values, but also to calculate distances and widths.

I also learned how the bars on the left and right can act as boundaries for a rectangle.

One of the most important things I learned was why `-1` can be used as a virtual left boundary when no smaller bar exists on the left, and why `heights.length` can be used as a virtual right boundary when no smaller bar exists on the right.

This problem also helped me understand the formula:

`width = rightBoundary - leftBoundary - 1`

and how mathematical reasoning can be combined with data structures to solve a difficult problem efficiently.

I also reinforced my understanding of stacks, `push()`, `pop()`, `peek()`, conditionals, `for` loops, and `while` loops.

## Complexity

**Time:** O(n)

Each index is pushed onto the stack at most once and popped at most once.

The `while` loop inside the main `for` loop does not make the algorithm O(n²), because once an index is popped, it is never processed by that stack again.

The cleanup loop also only processes indexes that are still remaining in the stack.

Therefore, the total time complexity is O(n).

**Space:** O(n)

The stack can contain up to `n` indexes in the worst case.

The other variables use constant space.

Therefore, the auxiliary space complexity is O(n).