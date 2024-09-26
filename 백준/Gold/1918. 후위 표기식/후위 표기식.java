import java.util.*;
  
public class Main {
    
   public String solution(String str) {
      
      String answer = "";
       // 중위표기식의 연산자만 담는다.
      Stack<Character> st = new Stack<>();
      char[] arr = str.toCharArray();
    // for문을 돌면서 연산자는 stack에 넣으면서 연산자가 나온거면 둘이비교
      for(char x : arr) {
           
          if(Character.isAlphabetic(x)) {
              answer += String.valueOf(x);
          } else if(x == '(') {
              st.push(x);
          } else if(x == ')') {
            while(!st.empty() && st.peek() != '(') {
                answer += st.pop();
            }
            st.pop(); //( 이거 제거를 위해
          } else {
              //우선순위 구분
              while(!st.empty() && precedence(st.peek()) >= precedence(x)) answer+= st.pop();
              st.push(x);
          }
      }
      
      while(!st.empty()) answer+= st.pop();
      
        
      return answer;

  }  
  
  public static int precedence(char c) {
      if(c == '*' || c == '/' ) return 2;
      else if (c == '+' || c == '-' ) return 1;
      else return 0;
  }
    
  public static void main(String[] args){
    Main T = new Main();
    Scanner in=new Scanner(System.in);
    String str = in.nextLine();
   
    System.out.println(T.solution(str));
  }
}