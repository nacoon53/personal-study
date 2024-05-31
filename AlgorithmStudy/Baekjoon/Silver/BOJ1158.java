import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BOJ1158 {
	/*
	 * N과 K가 주어지면 (N, K)-요세푸스 순열을 구하는 프로그램을 작성하시오.
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt(); //총 사람의 수 
		int k = scan.nextInt();
		
		List<Integer> list = new ArrayList<Integer>();
		
		StringBuilder sb = new StringBuilder();
		
		//1~n까지 순서대로 값 셋팅
		for(int i=1; i<=n; i++) {
			list.add(i);
		}
		
		int i = 0;
		while(list.size() > 1) {
			i = list.size() < (i+k) ? (i+k)%list.size() : i+k;			
			if(i==0) { i = list.size(); }
			
			sb.append(list.get(i-1)+", "); //list는 0부터 시작하므로 k-1을 해준다.
			list.remove(i-1);		
			i--;
		}
		
		//list에 마지막으로 남은 값도 출력하기
		sb.append(list.get(0));
		System.out.println("<" + sb + ">");
		
		scan.close();
	}
}
