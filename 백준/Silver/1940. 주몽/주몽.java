import java.util.*;
import java.io.*;
public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(arr);
        
        int s = 0, e = arr.length -1, count=0;
        
        while(s < e) {
            if(arr[s] + arr[e] < m) {
                s++;
            } else if(arr[s] + arr[e] > m) {
                e--;
            } else {
                s++;
                e--;
                count++;
            }
        }
        System.out.print(count);  
        
      
	}
}