import java.util.*;
class Solution {
    public String solution(String[] seoul) {
        StringBuilder sb = new StringBuilder("김서방은 ");
        
        for(int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals("Kim")) sb.append(i);
        }
        
        sb.append("에 있다");
        
        return sb.toString();
    }
}