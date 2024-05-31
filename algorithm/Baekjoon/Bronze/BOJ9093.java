import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BOJ9093 {
	/*
	 * 문장이 주어졌을 때, 단어를 모두 뒤집어서 출력하는 프로그램을 작성하시오. 단, 단어의 순서는 바꿀 수 없다. 단어는 영어 알파벳으로만 이루어져 있다.
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<String> list = new ArrayList<String>();
		StringBuilder sb = new StringBuilder();
		
		int t = Integer.parseInt(scan.nextLine());
		
		for(int i=0; i<t; i++) {
			String str = scan.nextLine();
			String[] arr = str.split(" ");
			
			for(int j=0; j<arr.length; j++) {
				for(int k=arr[j].length()-1; k >=0; k--) {
					sb.append(arr[j].charAt(k));
				}
				sb.append(" ");
			}
			sb.append("\n");
		}
		
		System.out.println(sb);
		scan.close();
	}
}