import java.util.Arrays;
import java.util.Scanner;

public class BOJ10809 {
	/*
	 * ���ĺ� �ҹ��ڷθ� �̷���� �ܾ� S�� �־�����. ������ ���ĺ��� ���ؼ�, �ܾ ���ԵǾ� �ִ� ��쿡�� ó�� �����ϴ� ��ġ��, ���ԵǾ� ���� ���� ��쿡�� -1�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String word = scan.nextLine();
		
		int[] alphaArr = new int[26];
		Arrays.fill(alphaArr, -1);
		
		for(int i=0; i<word.length(); i++) {
			char alpha = word.charAt(i);
			
			int k = (int)(alpha-'a');
			if(alphaArr[k] == -1) {
				alphaArr[k] = i;
			}
		}
		
		for(int i=0; i<alphaArr.length; i++) {
			System.out.print(alphaArr[i]+" ");
		}
	}

}
