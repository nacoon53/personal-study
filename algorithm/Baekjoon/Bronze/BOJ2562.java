import java.util.Scanner;

public class BOJ2562 {
	/* 
	 * 9개의 서로 다른 자연수가 주어질 때, 이들 중 최댓값을 찾고 그 최댓값이 몇 번째 수인지를 구하는 프로그램을 작성하시오.
	 */
	public static void main(String[] args) {
		int n[] = new int[9];

		int max = 0;
		int maxi = 0;

		Scanner scan = new Scanner(System.in);
		
		for(int i=0; i<n.length; i++) {
			n[i] = scan.nextInt();
			
			if(max < n[i]) {
				max = n[i];
				maxi = i;
			}
		}
		
		System.out.println(max);
		System.out.println(maxi+1);
	}
}
