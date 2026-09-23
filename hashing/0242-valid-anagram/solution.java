import java.util.Map;
import java.util.HashMap;

class Solution {
    public boolean isAnagram(String s, String t) {

        Map<Character, Integer> d1 = new HashMap<>();
        Map<Character, Integer> d2 = new HashMap<>();

        if(s.length() != t.length()){
            return false;
        }

        for(int i = 0; i < s.length(); i++){

            if(d1.containsKey(s.charAt(i))){

                d1.put(s.charAt(i), d1.get(s.charAt(i)) + 1);

            }
            else{

                d1.put(s.charAt(i), 1);

            }

        }

        for(int i = 0; i < t.length(); i++){

            if(d2.containsKey(t.charAt(i))){

                d2.put(t.charAt(i), d2.get(t.charAt(i)) + 1);

            }
            else{

                d2.put(t.charAt(i), 1);
            }

        }

        for(int i = 0; i < s.length(); i++){

            if(d1.get(s.charAt(i)).equals(d2.get(s.charAt(i)))){

                continue;
            }
            else{

                return false;
            }
        }

        return true;
    }
}