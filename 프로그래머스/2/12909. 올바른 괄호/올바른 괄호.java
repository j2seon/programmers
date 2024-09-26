import java.util.*;
class Solution {
    boolean solution(String s) {
        
        String[] arr = s.split("");
        
        int count = 0;
        for(String x : arr) {
            if(x.equals("(")) count++;
            
            if(x.equals(")")) count--;
            
            if(count < 0) break;
        }
        
        return count == 0;

    }
}