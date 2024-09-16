import java.util.*;

public class Main {
    
  public int solution (int n, int[] arr, int x) {
      
      Arrays.sort(arr);
      int p1 = 0, p2 = arr.length -1;
      int count = 0;
      while(p1 < p2) {
          if(arr[p1] + arr[p2] == x){
              count++;
              p1++;
              p2--;
          } else if(arr[p1] + arr[p2] > x) p2--;
          else p1++;
      }
      return count;
  }  
  
  public static void main(String[] args) {
    Main T = new Main();
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int[] arr = new int[n];  
      
    for(int i = 0; i < n; i++ ){
        arr[i] = in.nextInt();
    }
    int x = in.nextInt(); 
    System.out.println(T.solution(n,arr, x));
  }
}