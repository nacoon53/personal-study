import java.util.Scanner;

public class BOJ2443 {
	/* 
	 * ù° �ٿ��� �� 2��N-1��, ��° �ٿ��� �� 2��N-3��, ..., N��° �ٿ��� �� 1���� ��� ����
	 * ���� ����� �������� ��Ī�̾�� �Ѵ�.
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
