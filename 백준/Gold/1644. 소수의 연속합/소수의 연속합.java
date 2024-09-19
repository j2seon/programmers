import java.util.*;
  
public class Main {
  public int solution(int n) {
      ArrayList<Integer> list = prime(n);
      
      int sum = 0, lt = 0, count = 0;
      
      for(int rt=0; rt<list.size(); rt++ ) {
          sum += list.get(rt);
          if(sum == n) count++;
          while(sum > n) {
              sum -= list.get(lt++);
              if(sum == n) count++;
          }
      }
      return count;
  }
    
  static ArrayList<Integer> prime(int n) {
      
      ArrayList<Integer> list = new ArrayList<>();
      int[] arr = new int[n+1];
      arr[0] = 1; 
      arr[1] = 1; 
      
      for(int i=2; i<= Math.sqrt(n); i++) {
          if(arr[i] == 0) {
              for(int j = i*i; j<=n; j+=i) arr[j]=1;
          }
      }
      
      for(int i=0; i <= n; i++) {
          if(arr[i] == 0) list.add(i);
      }
      return list;
  }
    
    
  public static void main(String[] args){
    Main T = new Main();
    Scanner in=new Scanner(System.in);
    int input1 = in.nextInt();
    System.out.println(T.solution(input1));
  }
}