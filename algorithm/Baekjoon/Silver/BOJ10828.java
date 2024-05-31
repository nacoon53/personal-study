import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BOJ10828 {
	/*
	 * ������ �����ϴ� ������ ������ ����, �Է����� �־����� ����� ó���ϴ� ���α׷��� �ۼ��Ͻÿ�.
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<Integer> stack = new ArrayList<Integer>();
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(scan.nextLine());
		
		for(int i=0; i<n; i++) {
			String order = scan.nextLine();
			
			if(order.contains("push")) {
				int num = Integer.parseInt(order.split(" ")[1]);
				stack.add(num);
			}else if(order.equals("pop")) {
				int r = -1;
				if(stack.size() > 0) {
					r = stack.get(stack.size()-1);
					stack.remove(stack.size()-1);
				}
				sb.append(r).append("\n");
			}else if(order.equals("size")) {
				sb.append(stack.size()).append("\n");
			}else if(order.equals("empty")) {
				int r = stack.size() == 0 ? 1 : 0;
				sb.append(r).append("\n");
			}else if(order.equals("top")) {
				int r = stack.size() == 0 ? -1 : stack.get(stack.size()-1);
				sb.append(r).append("\n");
			}
			
		}
		
		System.out.println(sb);
		scan.close();
	}

}
