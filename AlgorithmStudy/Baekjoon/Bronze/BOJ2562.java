import java.util.Scanner;

public class BOJ2562 {
	/* 
	 * 9���� ���� �ٸ� �ڿ����� �־��� ��, �̵� �� �ִ��� ã�� �� �ִ��� �� ��° �������� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
	 */
	public static void main(String[] args) {
		int n[] = new int[9];

		int max = 0;
		int maxi = 0;

		Scanner scan = new Scanner(System.in);
		
		for(int i=0; i<n.length; i++) {
			n[i] = scan.nextInt();
			
			if(max < n[i]) {
				max = n[i];
				maxi = i;
			}
		}
		
		System.out.println(max);
		System.out.println(maxi+1);
	}
}
