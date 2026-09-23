import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean hasDuplicate(int[] nums) {

        Map<Integer, Integer> dictionary = new HashMap<>();

        for(int i = 0; i < nums.length; i++){

            if(dictionary.containsKey(nums[i])){

                return true;
            }
            else{

            dictionary.put(nums[i],1);
            
            }
        }

        return false;

        
    }
}