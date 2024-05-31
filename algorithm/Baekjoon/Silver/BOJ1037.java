import java.util.Scanner;

public class BOJ1037 {
	/* 
	 * ��� A�� N�� ��¥ ����� �Ƿ���, N�� A�� ����̰�, A�� 1�� N�� �ƴϾ�� �Ѵ�. � �� N�� ��¥ ����� ��� �־��� ��, N�� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
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
