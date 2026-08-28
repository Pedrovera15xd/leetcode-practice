import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] findErrorNums(int[] nums) {

        Map<Integer, Integer> dictionary = new HashMap<>();

        for(int z = 1; z <= nums.length; z++){
            dictionary.put(z,0);
        }

        int[] answer = new int[2];

        int curr1 = 0;

        for(int i = 0; i < nums.length; i++){

            dictionary.put(nums[i], dictionary.get(nums[i]) + 1);

            if(dictionary.get(nums[i]) >= 2){
               curr1 = nums[i];
            }

        }

        int curr2 = 0;

        for (int j = 1; j <= nums.length; j++) {
            
            if (dictionary.get(j) == 0) {

                curr2 = j;
            }
            
            }

        answer[0] = curr1;
        answer[1] = curr2;

        return answer;
        
    }
}