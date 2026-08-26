# 743. Network Delay Time

**Difficulty:** Medium
**Topic:** Graphs / Dijkstra's Algorithm

## Approach

I build an adjacency list to represent the directed weighted graph.

Then I use Dijkstra's algorithm with a min-heap starting from node `k`. The heap always gives me the node with the smallest current travel time.

Once a node is processed, I store its shortest distance. For each neighbor, I add the new possible travel time to the heap.

At the end, if all `n` nodes were reached, the answer is the maximum value among the shortest distances. Otherwise, I return `-1`.

## What I Learned

I learned how to represent a weighted graph with an adjacency list and how Dijkstra's algorithm uses a min-heap to find shortest paths efficiently.

## Complexity

**Time:** O(E log V)
**Space:** O(V + E)
