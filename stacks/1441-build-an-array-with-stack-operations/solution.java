import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

class Solution {
    public List<String> buildArray(int[] target, int n) {

        Stack<Integer> s = new Stack<>();

        ArrayList<String> solution = new ArrayList<>();

        int targetIndex = 0;

        for(int i = 1; i <= n; i++){
            
            s.push(i);
            
            solution.add("Push");

            if(s.peek() != target[targetIndex]){
                
                s.pop();

                solution.add("Pop");
                

                
            }
            else{
                targetIndex += 1;
            }

            if(targetIndex == target.length){

                break;
            }

           
         
        }

        return solution;


        
    }
}