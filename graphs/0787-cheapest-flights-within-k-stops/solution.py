class Solution:
    def findCheapestPrice(self, n: int, flights: List[List[int]], src: int, dst: int, k: int) -> int:
        prices = [float('inf')] * n
        prices[src] = 0

        for _ in range(k + 1):
            temp_prices = prices.copy()

            for u, v, cost in flights:
                if prices[u] != float('inf'):
                    if prices[u] + cost < temp_prices[v]:
                        temp_prices[v] = prices[u] + cost

            prices = temp_prices  

        return prices[dst] if prices[dst] != float('inf') else -1