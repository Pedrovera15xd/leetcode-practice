import java.util.Queue;
import java.util.ArrayDeque;

class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {

        Queue<Integer> q = new ArrayDeque<>();

        int current = 0;
        int answer = 0;

        for(int i = 0; i < tickets.length; i++){

            q.offer(i);

        }

        while(!q.isEmpty() && tickets[k] != 0){

            current = q.poll();

            tickets[current] -= 1;

            answer++;

            if(tickets[current] <= 0){
                continue;
            }
            else{

                q.offer(current);
            }


        }

        return answer; 

        
    }
}