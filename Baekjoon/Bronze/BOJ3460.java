import java.util.Scanner;

public class BOJ3460 {
	/*
	 * 양의 정수 n이 주어졌을 때, 이를 이진수로 나타냈을 때 1의 위치를 모두 찾는 프로그램을 작성하시오. 최하위 비트(least significant bit, lsb)의 위치는 0이다.
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
