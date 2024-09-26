import java.util.*;
public class Main {
    
    public int solution (String str) {
        int answer = 0;
        for(char c : str.toCharArray()) {
            answer += c - '0';
        }
        return answer;
    }
    
	public static void main(String[] args) {
		Main m = new Main();
		Scanner sc = new Scanner(System.in); 
		int n = sc.nextInt();
        String str = sc.next();
        
        System.out.print(m.solution(str));
		
	}
}