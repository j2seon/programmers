import java.util.*;
import java.io.*;
public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        long[] arr = new long[n+1];
        st = new StringTokenizer(bf.readLine());
        for(int i=1; i < arr.length; i++){
            arr[i] = arr[i - 1] + Integer.parseInt(st.nextToken());
        }

        for(int i=0; i < m; i++) {
            st = new StringTokenizer(bf.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int sum = (int)(arr[end] - arr[start-1]);
            System.out.println(sum);
        }
	}
}