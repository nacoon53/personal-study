import java.util.Scanner;

public class BOJ2443 {
	/* 
	 * 첫째 줄에는 별 2×N-1개, 둘째 줄에는 별 2×N-3개, ..., N번째 줄에는 별 1개를 찍는 문제
	 * 별은 가운데를 기준으로 대칭이어야 한다.
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		for(int i=n; i>=0; i--) {
			int j = (n-i) + (i*2-1);
			
			for(int k=0; j>k; k++) {
				if(k>=n-i) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
