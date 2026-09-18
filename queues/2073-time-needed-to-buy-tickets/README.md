# 2073. Time Needed to Buy Tickets

**Difficulty:** Easy  
**Topic:** Queue / Simulation

## Approach

We are given an array called `tickets` and an integer `k`, which represents the index of the person we are interested in.

`tickets[i]` represents how many tickets person `i` still needs to buy.

The goal is to calculate how many seconds pass until person `k` finishes buying all of their tickets.

My approach is to use a queue that stores the indexes of each person.

I store indexes instead of ticket values because an index allows me to identify the person and access their remaining tickets using:

`tickets[current]`

At the beginning, I add every person's index into the queue.

Then I simulate the process while the queue is not empty and person `k` still needs tickets.

For every iteration, I remove the person at the front using:

`current = q.poll()`

That person buys exactly one ticket, so I decrease:

`tickets[current] -= 1`

Every ticket purchase takes one second, so I increase:

`answer++`

If:

`tickets[current] > 0`

the person still needs more tickets, so I add their index back to the end of the queue using:

`q.offer(current)`

If their remaining tickets become `0`, they are finished and do not return to the queue.

The simulation stops when:

`tickets[k] == 0`

because this means that person `k` has finished buying all of their tickets.

Finally, I return `answer`, which represents the total number of seconds that passed.

## What I Learned

This problem helped me understand queue simulation better.

I practiced using `Queue<Integer>` with `ArrayDeque` and queue operations such as `offer()`, `poll()`, and `isEmpty()`.

I also learned why storing indexes can be more useful than storing values directly.

By storing the person's index, I can identify the person and modify their remaining number of tickets using the original array.

This problem also helped me understand how one loop iteration can represent one unit of time and how a person can leave and later re-enter the queue until their task is finished.

## Complexity

Let:

`T = total number of ticket purchases made until person k finishes`

**Time:** O(T)

Each iteration represents exactly one ticket purchase.

A person can be inserted into the queue multiple times if they still need more tickets.

Therefore, the number of iterations depends on the total number of ticket purchases made before person `k` finishes.

In the worst case, this can also be written as:

`O(n * m)`

where:

- `n` = number of people
- `m` = maximum number of tickets needed by a person

**Space:** O(n)

The queue can contain up to `n` person indexes.

All other variables use constant space.

Therefore, the auxiliary space complexity is O(n).