import java.util.Scanner;

public class BOJ2798 {

   public static void main(String[] args) {
	   Scanner scan = new Scanner(System.in);
	   
	   int n = scan.nextInt();
	   int m = scan.nextInt();
	   int result = 0;
	   int[] num = new int[n];
	   
	   for(int i =0; i<n; i++) {
		   num[i] = scan.nextInt();
	   }

	   for(int i=0; i<num.length-2; i++) {
		   for(int j=i+1; j<num.length-1; j++) {
			   for(int k=j+1; k<num.length; k++) {
				   int sum = num[i]+num[j]+num[k];
				   if(sum <= m && sum > result ) {
					   result = sum;
				   }
			   }
		   }
	   }
	   
	   System.out.println(result);
   }
}