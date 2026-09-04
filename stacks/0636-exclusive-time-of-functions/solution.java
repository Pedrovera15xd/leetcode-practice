import java.util.Stack;
import java.util.List;


class Solution {
    public int[] exclusiveTime(int n, List<String> logs) {

        Stack<Integer> s = new Stack<>(); 

        int timestamp = 0;
        
        int prevTime = 0;

        int[] answer = new int[n];

        for(int i = 0; i < logs.size(); i++){

               String[] parts = logs.get(i).split(":");

               int id = Integer.parseInt(parts[0]);
               String type = parts[1];
               timestamp = Integer.parseInt(parts[2]);

               if(type.equals("start")){

                if(s.empty() == false){
                    answer[s.peek()] += timestamp - prevTime;

                }

                s.push(id);

                prevTime = timestamp;

                
               }

               else if(type.equals("end")){

                answer[s.peek()] += timestamp - prevTime + 1;

                s.pop();

                prevTime = timestamp + 1;

               }

        }

        return answer;

      
        
    }
}