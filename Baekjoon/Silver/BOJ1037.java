import java.util.Scanner;

public class BOJ1037 {
	/* 
	 * 양수 A가 N의 진짜 약수가 되려면, N이 A의 배수이고, A가 1과 N이 아니어야 한다. 어떤 수 N의 진짜 약수가 모두 주어질 때, N을 구하는 프로그램을 작성하시오.
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int cnt = scan.nextInt();
		int maxYaksu = 0;
		int minYaksu = 0;
		
		for(int i=0; i<cnt; i++) {
			int k = scan.nextInt();
			
			if(maxYaksu < k) maxYaksu = k;
			if(i == 0 || minYaksu > k) minYaksu = k;
		}
		
		System.out.println(maxYaksu * minYaksu);
		scan.close();
	}
}
