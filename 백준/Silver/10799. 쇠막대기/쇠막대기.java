import java.util.*;
public class Main {
  
  public int solution(String str) {
      int answer = 0;
      // 괄호가 ( 이면 스택에 담고
      // 바로 전이 ( 였는데 )를 만나면 레이저를 쏠 예정
      // 레이져가 아닌 ) 인 경우 막대기의 끝
      // )를 만날 경우 (를 꺼내고 남은 (를 계산한다.
      Stack<Character> stack = new Stack<>();
      
      for(int i = 0; i< str.length(); i++) {
          if(str.charAt(i)=='(') stack.push('(');
          else {
            // )이면 하나 pop 해야함
            stack.pop();
            if(str.charAt(i-1) == '(') answer += stack.size();
            else answer++;
          }
      }

      return answer;
  }  

  public static void main(String[] args){
   Main T = new Main();
    Scanner in=new Scanner(System.in);
    String str = in.next();
   
    System.out.println(T.solution(str));
  }
}