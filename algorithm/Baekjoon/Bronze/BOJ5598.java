import java.util.Scanner;

public class BOJ5598 {
	/* 
	 * 26���� �빮�� ���ĺ����� �̷���� �ܾ ī�̻縣 ��ȣ �������� 3���ڸ� �Ű� ��ġ�� �ʰ� �����Ͽ� ���� ī�̻縣 �ܾ �ִ�. �� ī�̻縣 �ܾ ���� �ܾ�� �������� ���α׷��� �ۼ��Ͻÿ�.
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String encStr = scan.nextLine();
		
		for(int i=0; i<encStr.length(); i++) {
			char encChar = encStr.charAt(i);
			int n = encChar-3;
			if(n < 65) {
				n = n + 23 + 3;
			}
			
			char decChar = (char)(n);
			System.out.print(decChar);
		}
		scan.close();
	}
}
