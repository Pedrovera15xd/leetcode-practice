# 787. Cheapest Flights Within K Stops

**Difficulty:** Medium  
**Topic:** Graphs / Bellman-Ford

## Approach

I use a modified Bellman-Ford approach.

I create a `prices` array where each index represents the cheapest known cost to reach that city from the source.

Because the problem allows at most `k` stops, I repeat the relaxation process `k + 1` times.

For each round, I create a copy of the current prices called `temp_prices`. Then I check every flight and update the destination city if using that flight gives a cheaper cost.

Using a temporary copy is important because it prevents updates made during the same round from being reused immediately, which could allow more stops than the problem permits.

After all rounds are completed, I return the cheapest price to the destination. If the destination cannot be reached, I return `-1`.

## What I Learned

I learned how Bellman-Ford can be modified for shortest-path problems that limit the number of edges or stops that can be used.

I also learned why keeping a copy of the previous round's distances is important when the number of stops is restricted.

## Complexity

**Time:** O((k + 1) × E)  
**Space:** O(V)