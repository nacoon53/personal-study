import java.util.Scanner;

public class BOJ2576 {
	/* 
	 * 7개의 자연수가 주어질 때, 이들 중 홀수인 자연수들을 모두 골라 그 합을 구하고, 고른 홀수들 중 최솟값을 찾는 프로그램을 작성하시오.
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int min = 999;
		int sum = 0;
		
		for(int i=0; i<7; i++) {
			int k = scan.nextInt();
			
			if(k%2==1) {
				sum += k;
				if(min > k) min = k;
			}
		}
		
		if(sum == 0) {
			System.out.println(-1);
			return;
		}
		else {
			System.out.println(sum);
			System.out.println(min);
		}
	}
}
