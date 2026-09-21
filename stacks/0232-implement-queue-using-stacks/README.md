# 232. Implement Queue using Stacks

**Difficulty:** Easy  
**Topic:** Stack / Queue / Design

## Approach

This problem asks us to create a class that behaves like a queue using only two stacks.

A queue follows FIFO order, while a stack follows LIFO order. Because they work in opposite ways, my approach was to use two stacks called `s1` and `s2`.

`s1` is used to store newly inserted elements.

For `push(x)`, I simply push the new value into `s1`:

`s1.push(x)`

For `pop()`, I first check if `s2` is empty.

If `s2` is empty, I move every element from `s1` into `s2` using:

`s2.push(s1.pop())`

Moving the elements from one stack into another reverses their order.

Because of this, the oldest element becomes the top element of `s2`, which allows the stacks to behave like a queue.

Then I use:

`s2.pop()`

to remove and return the front element of the queue.

I only transfer elements when `s2` is empty because the elements already inside `s2` are older and need to be removed first.

For `peek()`, I use the same transfer process if `s2` is empty.

Then I use:

`s2.peek()`

to return the front element without removing it.

For `empty()`, the queue is empty only when both stacks are empty.

Therefore, I check:

`s1.isEmpty() && s2.isEmpty()`

## What I Learned

This problem helped me understand more deeply how queues and stacks work.

I learned how a queue can be created using two stacks even though queues use FIFO order and stacks use LIFO order.

I also learned that transferring elements from one stack to another reverses their order.

This problem helped me understand why one stack can be used for incoming elements and another stack can be used for outgoing elements.

I also practiced using stack operations such as `push()`, `pop()`, `peek()`, and `isEmpty()`.

## Complexity

Let:

`n = number of elements currently stored`

### push(x)

**Time:** O(1)

The new element is pushed directly into `s1`.

### pop()

**Amortized Time:** O(1)

In some calls, we may need to move several elements from `s1` into `s2`, which can take O(n).

However, each element is moved from `s1` to `s2` at most once.

Because of this, over many operations, the amortized time for `pop()` is O(1).

**Worst Case:** O(n)

### peek()

**Amortized Time:** O(1)

Like `pop()`, it may sometimes require transferring all elements from `s1` into `s2`.

Each element is transferred only once, so the amortized time is O(1).

**Worst Case:** O(n)

### empty()

**Time:** O(1)

We only check whether both stacks are empty.

### Space

**Space:** O(n)

The two stacks together store all elements in the queue.

Even though there are two stacks, each element is stored in only one of them at a time.

Therefore, the total auxiliary space is O(n).