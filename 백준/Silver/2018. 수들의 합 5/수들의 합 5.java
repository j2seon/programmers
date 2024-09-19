import java.util.*;
import java.util.stream.*;
public class Main {
    public int solution (int num) {
        
        int[] arr = IntStream.rangeClosed(1, num).toArray();
        int lt = 0, answer = 0, sum = 0;
        for(int rt = 0; rt < num; rt++){
            sum += arr[rt];
            if(sum == num) answer++;
            while(sum > num) {
                sum -= arr[lt++];
                if(sum == num) answer++;
            }
        }
        return answer;
        
    }
	public static void main(String[] args) {
        Main T = new Main();
		Scanner sc = new Scanner(System.in); 
		int num = sc.nextInt();
		System.out.println(T.solution(num));
	}
}