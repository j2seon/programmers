import java.util.*;
import java.io.*;
public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        st =  new StringTokenizer(bf.readLine());
        for(int i = 0; i<n; i++) arr[i]= Integer.parseInt(st.nextToken());
        
         int start = 0, end = 0, count = 0, sum = 0;
        
        while (start < n) {
            if(sum > k || end == n) {
                sum -= arr[start++];
            } else {
                sum += arr[end++];
            }
            
            if(sum == k) count++;
        }
        System.out.print(count);
        
        
	}
}