import java.util.Scanner;

public class BOJ2441 {
	/* 
	 * 첫째 줄에는 별 N개, 둘째 줄에는 별 N-1개, ..., N번째 줄에는 별 1개를 찍는 문제
	 * 하지만, 오른쪽을 기준으로 정렬한 별(예제 참고)을 출력하시오. 
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		for(int i=0; i<n; i++) {
			for(int j=n; j>0; j--) {
				if(j<=n-i) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
