import java.util.Scanner;

public class BOJ2442 {
	/* 
	 * ù° �ٿ��� �� 1��, ��° �ٿ��� �� 3��, ..., N��° �ٿ��� �� 2��N-1���� ��� ����
	 * ���� ����� �������� ��Ī�̾�� �Ѵ�.
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		for(int i=1; i<=n; i++) {
			int j = (n-i) + (i*2-1);
			
			for(int k=1; j>=k; k++) {
				if(k<=n-i) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
