import java.util.Scanner;

public class BOJ2444 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		int flag = -1; 
		int i= n-1;
		int j = 1;
		
		while(i<n) {
			int k = (n-j) + (j*2-1);
			
			for(int u=0; u<k; u++) {
				if(u < n-j) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			
			System.out.println();
			if(i==0) {
				flag *= -1;
			}
			
			i+=flag;
			j+=(flag*-1);
		}
	}
}
