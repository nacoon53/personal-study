import java.util.Scanner;

public class BOJ5598 {
	/* 
	 * 26개의 대문자 알파벳으로 이루어진 단어를 카이사르 암호 형식으로 3문자를 옮겨 겹치지 않게 나열하여 얻은 카이사르 단어가 있다. 이 카이사르 단어를 원래 단어로 돌려놓는 프로그램을 작성하시오.
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
