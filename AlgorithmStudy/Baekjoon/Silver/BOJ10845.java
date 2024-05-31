import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BOJ10845 {
	/*
	 * ������ �����ϴ� ť�� ������ ����, �Է����� �־����� ����� ó���ϴ� ���α׷��� �ۼ��Ͻÿ�.
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<Integer> queue = new ArrayList<Integer>();
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(scan.nextLine());
		
		for(int i=0; i<n; i++) {
			String order = scan.nextLine();
			
			if(order.contains("push")) {
				int num = Integer.parseInt(order.split(" ")[1]);
				queue.add(num);
			}else if(order.equals("pop")) {
				int r = -1;
				if(queue.size() > 0) {
					r = queue.get(0);
					queue.remove(0);
				}
				sb.append(r).append("\n");
			}else if(order.equals("size")) {
				sb.append(queue.size()).append("\n");
			}else if(order.equals("empty")) {
				int r = queue.size() == 0 ? 1 : 0;
				sb.append(r).append("\n");
			}else if(order.equals("front")) {
				int r = queue.size() == 0 ? -1 : queue.get(0);
				sb.append(r).append("\n");
			}else if(order.equals("back")) {
				int r = queue.size() == 0 ? -1 : queue.get(queue.size()-1);
				sb.append(r).append("\n");
			}
			
		}
		
		System.out.println(sb);
		scan.close();
	}
}
