# 200. Number of Islands

**Difficulty:** Medium
**Topic:** Graphs / Grid Traversal

## Approach

I traverse every cell in the grid. When I find land (`"1"`) that has not been visited, I start a graph traversal from that position.

During the traversal, I check the four possible directions: up, down, left, and right. Each connected land cell is added to a `visited` set so it is not processed again.

Every time a new unvisited land cell starts a traversal, I increase the number of islands by one.

## What I Learned

I learned how a 2D grid can be treated like a graph and how to explore connected cells while keeping track of visited positions.

## Complexity

**Time:** O(rows × cols)
**Space:** O(rows × cols)
