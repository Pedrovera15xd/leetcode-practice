class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {

        int[] solution = new int[nums.length];
        int curr = 0;
        int count = 0;

        for(int i = 0; i < nums.length; i++){

            curr = nums[i];

            for(int j = 0; j < nums.length; j++){

                if(curr > nums[j]){

                    count += 1;

                }

            }
            solution[i] = count;
            count = 0;
            
        }

        return solution;


        
    }
}