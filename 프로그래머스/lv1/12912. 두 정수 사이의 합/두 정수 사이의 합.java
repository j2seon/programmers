import java.util.stream.IntStream;
import java.util.stream.Stream;

class Solution {
    public long solution(int a, int b) {    
        if(a == b) return a;
        
        return (a > b) ? IntStream.rangeClosed(b, a).mapToLong(i->i).sum() :
        IntStream.rangeClosed(a, b).mapToLong(i->i).sum();
    }
        
}