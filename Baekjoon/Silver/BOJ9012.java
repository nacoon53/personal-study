import java.util.Scanner;
import java.util.Stack;

public class BOJ9012 {
	/*
	 * 괄호 문자열을 입력 받아 올바른 괄호 문자열인지 판단하시오.
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int T = Integer.parseInt(scan.nextLine());
		
		for(int i=0; i<T; i++) {
			String str = scan.nextLine();
			System.out.println(isVPS(str));
		}
		
		scan.close();
	}
	
	public static String isVPS(String str) {
		String result = "YES";
		Stack stack = new Stack();
		
		for(int i= 0; i<str.length(); i++) {			
			if(str.charAt(i) == '(') {
				stack.add("(");
			}else { //str.charAt(i) == ')'
				if(stack.isEmpty()) {
					result = "NO";
					break;
				}
				
				stack.pop();
			}
		}
		
		if(!stack.isEmpty()) {
			result = "NO";
		}
		
		return result;
	}
}
