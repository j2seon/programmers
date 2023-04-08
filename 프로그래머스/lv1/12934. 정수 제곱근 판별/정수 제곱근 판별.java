import java.lang.Math;

class Solution {
    public long solution(long n) {

        for(int x = 1; x <= n ; x++){
            if(Math.pow(x, 2) == n){
                return (long) Math.pow(x + 1, 2);
            }
        } 
        
        return -1;
        
    }
}