import java.util.Stack;

class Solution {
    public int[] finalPrices(int[] prices) {

        int[] answer = new int[prices.length];
        Stack<Integer> s = new Stack<>();

        for(int i = 0; i < prices.length; i++){

            answer[i] = prices[i];

            
            while((!s.isEmpty()) && (prices[s.peek()] >= prices[i])){

                answer[s.peek()] = prices[s.peek()] - prices[i];
                s.pop();

            }

        s.push(i);
        }

        return answer;

        
    }
}