import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

   public static void main(String[] args) {
	   Scanner scan = new Scanner(System.in);
	   
	   int T = scan.nextInt();
	   
	   for(int i = 0 ; i < T; i++) {
		 int priority = 0;
		 int n = scan.nextInt();
		 int m = scan.nextInt();
		 int[] arr = new int[n];
		 
		 PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		 
		 for(int j = 0; j < n; j++) {
			 int num = scan.nextInt();
			 arr[j] = num;
			 pq.add(num);
		 }
		 
		 int flag = 0;
		 while(!pq.isEmpty() && flag == 0) {
			 for(int k = 0; k < n; k++) {
				 if(arr[k] == pq.peek()) {
					 if(k == m) {
						 priority++;
						 flag = 1;
						 break;
					 }
					 pq.poll();
					 priority++;
				 }
			 }
		 }
		 
		 System.out.println(priority);		 
	   }
	   
	   scan.close();
   }
}