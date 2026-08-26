# Sort Colors

## Approach
The problem gives an array containing only the values `0`, `1`, and `2`, where each number represents a color.

My approach uses **counting sort**.

First, I create three counters:
- `zeroCount`
- `oneCount`
- `twoCount`

Then I iterate through the array once and count how many times each value appears.

After counting, I overwrite the original `nums` array:
- first fill it with `0`s
- then fill the next positions with `1`s
- then fill the remaining positions with `2`s

For example, if the original array is `[1, 0]`, after counting and rewriting, it becomes `[0, 1]`.

This works because the array only contains three possible values, so counting how many of each value appears is enough to rebuild the array in sorted order.

The size of the array does not change, because the total number of rewritten elements is exactly the same as the total number of elements counted.