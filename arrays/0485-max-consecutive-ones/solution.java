class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {

        int curr = 0;
        int largest = 0;


        for (int i = 0; i < nums.length; i++){

            if (nums[i] == 1){
                curr += 1;

                if (curr > largest){
                    largest = curr;
                }
            }
            else{
                curr = 0;
            }
        }

        return largest;
    }
}