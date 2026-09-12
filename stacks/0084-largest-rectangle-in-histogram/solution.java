import java.util.Stack;

class Solution {
    public int largestRectangleArea(int[] heights) {

        Stack<Integer> s = new Stack<>();
        int maxArea = 0;

        for(int i = 0; i < heights.length; i++){

            while(!s.isEmpty() && heights[i] < heights[s.peek()]){

                int poppedIndex = s.pop();

                int rightBoundary = i;
                int leftBoundary = 0;
                int width = 0;

                
                if(!s.isEmpty()){
                    leftBoundary = s.peek();
                    
                }
                else{
                    leftBoundary = -1;

                }
                width = rightBoundary - leftBoundary - 1;

                int currentMaxArea = heights[poppedIndex] * width;

                if(currentMaxArea > maxArea){
                    maxArea = currentMaxArea;
                }
                

            }

            s.push(i);

        }

        while(!s.isEmpty()){
            int poppedIndex = s.pop();

                int rightBoundary = heights.length;
                int leftBoundary = 0;
                int width = 0;


                if(!s.isEmpty()){
                    leftBoundary = s.peek();
                    
                }
                else{
                    leftBoundary = -1;

                }
                width = rightBoundary - leftBoundary - 1;

                int currentMaxArea = heights[poppedIndex] * width;

                if(currentMaxArea > maxArea){
                    maxArea = currentMaxArea;
                }

            }


        return maxArea;
        
    }
}