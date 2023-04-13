import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Solution {
    public int[] solution(int[] num_list) {
        int[] result = new int[num_list.length];
        
        for(int i = num_list.length - 1, j = 0; i >= 0; i--, j++){
            result[j] = num_list[i];
        }
        return result;
        
    }
}