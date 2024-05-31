import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class BOJ10866 {
	/*
	 * 정수를 저장하는 덱(Deque)을 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Deque<Integer> deque = new ArrayDeque<>();
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(scan.nextLine());
		
		for(int i=0; i<n; i++) {
			String order = scan.nextLine();
			
			if(order.contains("push_front")) {
				int num = Integer.parseInt(order.split(" ")[1]);
				deque.addFirst(num);
			}else if(order.contains("push_back")) {
				int num = Integer.parseInt(order.split(" ")[1]);
				deque.addLast(num);
			}else if(order.equals("pop_front")) {
				int r = -1;
				if(deque.size() > 0) {
					r = deque.pollFirst();
				}
				sb.append(r).append("\n");
			}else if(order.equals("pop_back")) {
				int r = -1;
				if(deque.size() > 0) {
					r = deque.pollLast();
				}
				sb.append(r).append("\n");
			}else if(order.equals("size")) {
				sb.append(deque.size()).append("\n");
			}else if(order.equals("empty")) {
				int r = deque.size() == 0 ? 1 : 0;
				sb.append(r).append("\n");
			}else if(order.equals("front")) {
				int r = deque.size() == 0 ? -1 : deque.peekFirst();
				sb.append(r).append("\n");
			}else if(order.equals("back")) {
				int r = deque.size() == 0 ? -1 : deque.peekLast();
				sb.append(r).append("\n");
			}
			
		}
		
		System.out.println(sb);
		scan.close();
	}
}
