import java.util.Scanner;

public class BOJ2441 {
	/* 
	 * ù° �ٿ��� �� N��, ��° �ٿ��� �� N-1��, ..., N��° �ٿ��� �� 1���� ��� ����
	 * ������, �������� �������� ������ ��(���� ����)�� ����Ͻÿ�. 
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
