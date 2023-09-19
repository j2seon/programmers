import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;

       Map<Character, Integer> map = new HashMap();
        
        for(char c : s.toLowerCase().toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }

        return map.get('p') == map.get('y') ? true : false;
        
        
        
    }
}