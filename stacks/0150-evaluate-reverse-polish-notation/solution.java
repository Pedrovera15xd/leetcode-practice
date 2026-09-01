import java.util.Stack;

class Solution {
    public int evalRPN(String[] tokens) {

        Stack<Integer> s = new Stack<>();

        int left = 0;
        int right = 0;

        for(int i = 0; i < tokens.length; i++) {


            if(tokens[i].equals("+")){

                right = s.pop();
                left = s.pop();

                s.push(left + right);

            }
            else if(tokens[i].equals("-")){

                right = s.pop();
                left = s.pop();

                s.push(left - right);

            }
            else if(tokens[i].equals("*")){

                 right = s.pop();
                left = s.pop();

                s.push(left * right);

            }
            else if(tokens[i].equals("/")){

                right = s.pop();
                left = s.pop();

                s.push(left / right);

            }
            else{
                s.push(Integer.parseInt(tokens[i]));
            }

        }

        return s.pop();
        
    }
}