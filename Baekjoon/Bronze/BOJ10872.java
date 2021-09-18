import java.util.Scanner;

public class BOJ10872 {
	/* 
	 * 0보다 크거나 같은 정수 N이 주어진다. 이때, N!을 출력하는 프로그램을 작성하시오.
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int sum = 1;
		
		for(int i=1; i<=n; i++) {
			sum *= i;
		}
		System.out.println(sum);
		scan.close();
	}
}
