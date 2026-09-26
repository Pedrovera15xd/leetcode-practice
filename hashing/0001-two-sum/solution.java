import java.util.Map;
import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer,Integer> dictionary = new HashMap<>();
        int[] answer = new int[2];

        for(int i = 0; i < nums.length; i++){

            int needed = target - nums[i];
            
            if(dictionary.containsKey(needed) ){
                
                answer[0] = dictionary.get(needed);
                answer[1] = i;
                break;
            }
            else{
                dictionary.put(nums[i], i);
            
            }
            

        }

        return answer;
        
    }
}
