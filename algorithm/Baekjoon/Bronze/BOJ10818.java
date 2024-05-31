import java.util.Scanner;

public class BOJ10818 {
	/*
	 * N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int max = 0, min = 0;
		int cnt = scan.nextInt();
		
		for(int i=0; i<cnt; i++) {
			int n = scan.nextInt();
			if(i==0 || max<n) {
				max = n;
			}
			if(i==0 || min>n) {
				min = n;
			}
		}
		
		System.out.println(min +" " + max);
	}

}
