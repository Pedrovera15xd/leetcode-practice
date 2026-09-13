# 1700. Number of Students Unable to Eat Lunch

**Difficulty:** Easy  
**Topic:** Queue / Simulation

## Approach

We are given an array of students and an array of sandwiches.

Each student prefers either sandwich type `0` or type `1`.

The students are arranged in a queue, so they follow FIFO order.

I store the students in a queue using `ArrayDeque` because the problem processes students from the front and moves students who reject a sandwich to the back.

For the sandwiches, I use a stack because the problem describes the sandwiches as being stacked.

I push the sandwiches into the stack in reverse order so that the first sandwich from the original array becomes the top of the stack.

Then I simulate the process while the queue is not empty.

For each iteration, I remove the student at the front using:

`q.poll()`

If:

`currentStudent == s.peek()`

the student wants the current sandwich.

The student is already removed from the queue because of `poll()`, so I remove the sandwich using:

`s.pop()`

and reset:

`rejections = 0`

because we are now processing a new sandwich.

If the student does not want the sandwich, I add the student back to the end of the queue using:

`q.offer(currentStudent)`

and increase the rejection counter.

The sandwich remains at the top of the stack because nobody has taken it yet.

If:

`rejections == q.size()`

then every student currently remaining in the queue has rejected the same sandwich once.

This means that none of the remaining students can take the current sandwich, so the process cannot continue.

Finally, I return:

`q.size()`

because every student still in the queue is unable to eat.

## What I Learned

This problem helped me understand queues better and how to use them in problem solving.

I learned how FIFO order works and practiced queue operations such as `offer()`, `poll()`, `peek()`, `size()`, and `isEmpty()`.

I also learned how `Queue<Integer>` can use `ArrayDeque` as its implementation.

This problem also helped me understand how a queue and a stack can work together in a simulation.

Another important part was learning how to detect when the simulation can no longer make progress by counting how many students rejected the current sandwich.

## Complexity

**Time:** O(n²) in the worst case

A student can be removed from the front and added back to the queue multiple times before finding a sandwich they want.

In the worst case, this repeated rotation can result in O(n²) queue operations.

**Space:** O(n)

The queue can store up to `n` students, and the stack can store up to `n` sandwiches.

Therefore:

`O(n) + O(n) = O(n)`