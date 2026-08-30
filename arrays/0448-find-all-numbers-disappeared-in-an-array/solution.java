import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {

        HashMap<Integer, Integer> dictionary = new HashMap<>();
        List<Integer> solution = new ArrayList<>();

        for(int i = 1; i <= nums.length; i++){

            dictionary.put(i, 0);
        }

        for(int j = 0; j < nums.length; j++){

            dictionary.put(nums[j], 1);
        }

        for(int z = 1; z <= nums.length; z++){

            if(dictionary.get(z) == 0){
                solution.add(z);

            }
        }

        return solution;

        
    }
}
