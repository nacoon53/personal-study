import java.util.Scanner;

public class BOJ2576 {
	/* 
	 * 7���� �ڿ����� �־��� ��, �̵� �� Ȧ���� �ڿ������� ��� ��� �� ���� ���ϰ�, �� Ȧ���� �� �ּڰ��� ã�� ���α׷��� �ۼ��Ͻÿ�.
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
