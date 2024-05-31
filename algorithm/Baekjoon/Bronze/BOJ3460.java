import java.util.Scanner;

public class BOJ3460 {
	/*
	 * ���� ���� n�� �־����� ��, �̸� �������� ��Ÿ���� �� 1�� ��ġ�� ��� ã�� ���α׷��� �ۼ��Ͻÿ�. ������ ��Ʈ(least significant bit, lsb)�� ��ġ�� 0�̴�.
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int t = scan.nextInt();
		int[] n = new int[t];
		
		for(int i=0; i<t; i++) {
			n[i] = scan.nextInt();
		}
		
		for(int i=0; i<t; i++) {
			for(int j = n[i], k=0; j>0; j/=2, k++) {
				if(j%2==1) {
					System.out.print(k + " ");
				}
			}
			System.out.println();
		}
		
		scan.close();
	}
}
