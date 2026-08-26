class Solution {
    public boolean canPartition(int[] nums) {

        // Create an integer called sum to store sum of all the elements in the array
        int sum = 0;

        // Make a loop for sum all the elements in the array
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }

        // Make a condition for checking if it is already false since the sum is already odd
        if (sum % 2 != 0) {
            return false;
        }

        // Create an integer called goal because that is our target
        int goal = sum / 2;

        // Create a boolean dp[] to store the solution
        boolean[] dp = new boolean[goal + 1];

        // Set base case
        dp[0] = true;

        // Loop for every element in the array nums[]
        for (int j = 0; j < nums.length; j++) {

            // Make another loop for checking
            for (int s = goal; s >= nums[j]; s--) {
                dp[s] = dp[s] || dp[s - nums[j]];
            }
        }

        return dp[goal];
    }
        
    }
