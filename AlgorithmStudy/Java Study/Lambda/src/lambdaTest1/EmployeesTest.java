package lambdaTest1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class MyComparator implements Comparator<Employees> {

	@Override
	public int compare(Employees o1, Employees o2) {
		return o1.employeeId - o2.employeeId; //오름차순 정렬
	}
	
}

public class EmployeesTest {
	public static void main(String[] args) {
		List<Employees> list = new ArrayList<Employees>();
		list.add(new Employees(1, "홍길동", "010-0000-0001"));
		list.add(new Employees(3, "고길동", "010-0000-0003"));
		list.add(new Employees(4, "김길동", "010-0000-0007"));
		list.add(new Employees(2, "이길동", "010-0000-0006"));
		list.add(new Employees(6, "장길동", "010-0000-0009"));
		list.add(new Employees(5, "황길동", "010-0000-0008"));
		
		list.forEach( (item) -> {
			System.out.println(item);
		});
		
		System.out.println("정렬하기");
		list.sort(new MyComparator());
		
		list.forEach( (item) -> {
			System.out.println(item);
		});
		
		//익명의 클래스
		System.out.println("익명의 클래스");
		list.sort( new Comparator<Employees>() {

			@Override
			public int compare(Employees o1, Employees o2) {
				return o1.employeeId - o2.employeeId; //오름차순 정렬
			}
			
		});
		
		list.forEach( (item) -> {
			System.out.println(item);
		});
		
		//람다
		System.out.println("람다");
		list.stream()
			.sorted( (o1, o2) -> { return o1.employeeId - o2.employeeId; }) //정렬된 새로운 목록을 보내는 거라, 원본은 그대로 남아 있다. (데이터 자체를 건드리지 않음)
			.forEach( (n) -> {
				System.out.println(n);
			});
	}
}
