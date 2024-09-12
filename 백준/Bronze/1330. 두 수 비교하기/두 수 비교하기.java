import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		String str= sc.nextLine();
		
        String[] arr = str.split(" ");
        int a = Integer.valueOf(arr[0]);
        int b = Integer.valueOf(arr[1]);
        int p = a-b;
        if(p > 0) {
            System.out.println(">");    
        } else if(p < 0) {
            System.out.println("<");    
        } else {
            System.out.println("==");    
        }
        
	}
}