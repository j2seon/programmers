import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        
        Stack<Integer> stack = new Stack();
        
        int blen = board.length;
        int mlen = moves.length;
        
        for(int i = 0; i < mlen; i++) {
            int lo = moves[i] -1;
            for(int j = 0; j < blen; j++) {
                if(board[j][lo] != 0) {
                    int item = board[j][lo];
                    board[j][lo] = 0;                     
                    if(!stack.empty() && stack.peek() == item) {
                        answer += 2;
                        stack.pop();
                    } else {
                        stack.push(item);
                    }
                    break;
                }
            }
        }        
        return answer;
    }
}