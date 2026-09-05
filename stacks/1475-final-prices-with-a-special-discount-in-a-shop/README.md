# 1475. Final Prices With a Special Discount in a Shop

**Difficulty:** Easy  
**Topic:** Stack / Monotonic Stack

## Approach

We are given an array containing prices.

For each price, we need to find the first price to the right that is less than or equal to the current price.

If such a price exists, we apply the discount by subtracting:

`current price - discount price`

If no valid discount exists, the original price stays the same.

My first idea was to use two loops.

The outer loop would go through each price, and the inner loop would search to the right for the first valid discount.

This approach works, but in the worst case it would take O(n²) time because for each price we may need to check many prices to the right.

To make the solution more efficient, I used a stack.

The stack stores the indexes of prices that are still waiting for a valid discount.

I first store the original price in the `answer` array:

`answer[i] = prices[i]`

This makes sure that if a price never receives a discount, its original value will remain unchanged.

Then, while the stack is not empty and the current price is less than or equal to the price at the index on top of the stack:

`prices[s.peek()] >= prices[i]`

the current price becomes the discount for that previous price.

I update the answer using:

`answer[s.peek()] = prices[s.peek()] - prices[i]`

After applying the discount, I pop that index from the stack because its final price has already been calculated.

The `while` loop is necessary because one current price may be the valid discount for multiple previous prices.

After checking all possible discounts, I push the current index into the stack because that price may receive a discount later.

Any indexes still left in the stack at the end never found a valid discount, so their original prices remain in the `answer` array.

## What I Learned

This problem helped me understand how to improve a brute-force solution by using a monotonic stack.

I practiced using stack operations such as `push()`, `pop()`, `peek()`, and `isEmpty()`.

I also learned why storing indexes in the stack can be more useful than storing the values directly, because the indexes allow me to update the correct position in the `answer` array.

Another important thing I learned is that having a `while` loop inside a `for` loop does not automatically make the time complexity O(n²).

In this problem, each index is pushed onto the stack at most once and popped at most once.

## Complexity

**Time:** O(n)

Each index is pushed onto the stack at most once and popped from the stack at most once.

Therefore, even though there is a `while` loop inside the `for` loop, the total number of stack operations is proportional to n.

This gives:

`O(n + n) = O(2n) = O(n)`

**Space:** O(n)

The `answer` array contains n elements.

The stack can also contain up to n indexes in the worst case.

Therefore:

`O(n) + O(n) = O(n)`