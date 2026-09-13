import java.util.Queue;
import java.util.ArrayDeque;
import java.util.Stack;

class Solution {
    public int countStudents(int[] students, int[] sandwiches) {

        Queue<Integer> q = new ArrayDeque<>();
        Stack<Integer> s = new Stack<>();


        for(int i = 0; i < students.length; i++){

            q.offer(students[i]);
        }

        for(int i = sandwiches.length - 1; i >= 0; i--){

            s.push(sandwiches[i]);
        }

        int currentStudent = 0;
        int rejections = 0;
        int answer = 0;

        while(!q.isEmpty()){

                currentStudent = q.poll();

            if(currentStudent == s.peek()){

                s.pop();
                rejections = 0;
            }
            else{
                q.offer(currentStudent);
                rejections++;
            }

            if(rejections == q.size()){

                break;
            }
        }

        answer = q.size();

        return answer;
        
    }
}