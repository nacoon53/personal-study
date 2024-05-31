import java.util.Arrays;
import java.util.Scanner;

public class BOJ10809 {
	/*
	 * 알파벳 소문자로만 이루어진 단어 S가 주어진다. 각각의 알파벳에 대해서, 단어에 포함되어 있는 경우에는 처음 등장하는 위치를, 포함되어 있지 않은 경우에는 -1을 출력하는 프로그램을 작성하시오.
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
